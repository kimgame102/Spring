package com.app.study.mapper;

import com.app.study.domain.member.MemberDTO;
import com.app.study.domain.member.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testInsert(){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberEmail("chulsu@gmail.com");
        memberDTO.setMemberPassword("2222");
        memberDTO.setMemberName("김철수");

        memberMapper.insert(memberDTO.toVO());
    }

    @Test
    public void testSelectByMemberEmailAndMemberPassword(){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberEmail("chulsu@gmail.com");
        memberDTO.setMemberPassword("2222");

        Optional<MemberVO> foundMember =
                memberMapper.selectByMemberEmailAndMemberPassword(memberDTO.toVO());

//        테이블에서 조회된 회원 정보가 null이 아니라면, 전체 정보 출력
        foundMember.map(MemberVO::toString).ifPresent(log::info);
    }
}















