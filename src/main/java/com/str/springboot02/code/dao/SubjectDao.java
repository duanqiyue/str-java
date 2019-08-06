package com.str.springboot02.code.dao;

import com.str.springboot02.code.entity.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubjectDao {
    @Select("select * from tm_subject where subject=#{subject}")
    public Subject getOneSubject(String subject);
}
