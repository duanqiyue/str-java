package com.str.springboot02.code.service.impl;

import com.str.springboot02.code.dao.SubjectDao;
import com.str.springboot02.code.entity.Subject;
import com.str.springboot02.code.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;

    @Override
    public Subject getOneSubject(String subject) {
        Subject subject1 = subjectDao.getOneSubject(subject);
        return subject1;
    }
}
