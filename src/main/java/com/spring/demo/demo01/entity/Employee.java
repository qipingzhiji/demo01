package com.spring.demo.demo01.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * employee
 * @author 
 */
@Data
public class Employee implements Serializable {
    private Integer id;

    private String name;

    private Byte age;

    private String birth;

    private static final long serialVersionUID = 1L;
}