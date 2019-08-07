package com.str.springboot02.code.service;

import com.str.springboot02.code.entity.Subject;

public interface SubjectService {
    public Subject getOneSubject(Subject SubjectVo);
    public Integer getMaxId();
}
