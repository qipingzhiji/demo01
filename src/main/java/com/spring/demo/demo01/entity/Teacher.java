package com.spring.demo.demo01.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    private String id;

    private String firstName;

    private int sex;

    private String subject;

    private String deptnum;

    private String comment;
}