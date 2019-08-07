package com.str.springboot02.code.dao;

import com.str.springboot02.code.entity.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SubjectDao {
    @Select("select * from tm_subject where subject=#{subject} and id > #{id} order by id ASC limit 1 ")
    public Subject getOneSubject(Subject subject);

    @Select("select max(id) from tm_subject ")
    public Integer getMaxId();
}
