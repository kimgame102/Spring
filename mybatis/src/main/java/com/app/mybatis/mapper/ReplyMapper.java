package com.app.mybatis.mapper;

import com.app.mybatis.domain.ReplyDTO;
import com.app.mybatis.domain.ReplyVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ReplyMapper {
//    댓글 작성
public void insert(ReplyVO replyVO);

//    댓글 목록
    public List<ReplyDTO> selectAll();

//    댓글 삭제
//    전달해야 할 것이 2개만 가져와야할때 @Param 사용(3개도 가능)
    public void delete(@Param("id") Long id, @Param("replyOrder") int replyOrder);

//    댓글 수정
    public void update(ReplyVO replyVO);
}
