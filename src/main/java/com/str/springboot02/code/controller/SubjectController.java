package com.str.springboot02.code.controller;

import com.str.springboot02.code.entity.Subject;
import com.str.springboot02.code.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/getOneSubject")
    private Subject getOneSubject(String subject){
        return subjectService.getOneSubject(subject);
    }
}
