package com.spring.demo.demo01.controller;

import com.spring.demo.demo01.dao.EmployeeDao;
import com.spring.demo.demo01.dao.TeacherMapper;
import com.spring.demo.demo01.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private TeacherMapper teacherMapper;

    @RequestMapping("hello/{username}")
    public  Object helloWorld(@PathVariable(value = "username",required = false) String username) {
        return "welcome to spring application  " + username;
    }

    @GetMapping(value = "employerInfo")
    public Object getEmployersInfo() {
        Object o = employeeDao.selectByPrimaryKey(2);
        return o;
    }

    @GetMapping(value = "/teacher/{teacher_id}")
    public Object getTeacherInfo(@PathVariable(value = "teacher_id") String teacher_id) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(teacher_id);
        return teacher;
    }

}
