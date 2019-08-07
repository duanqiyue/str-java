package com.str.springboot02.code.controller;

import com.str.springboot02.code.entity.Subject;
import com.str.springboot02.code.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/getOneSubject")
    private Subject getOneSubject(Subject subjectVo){
        if(StringUtils.isEmpty(subjectVo.getId()) || subjectService.getMaxId().equals(subjectVo.getId())){
            subjectVo.setId(0);
        }
        return subjectService.getOneSubject(subjectVo);
    }
}
