package com.app.study.domain.post;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestDTO {
    private String name;
    private String[] tests;
}
