package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface testanswerMapper {
    @Insert("insert into testanswerrecord(recorduserid,recordgrade) values (#{userid},#{grade});")
    public int inserttestanswer(String userid,int grade);
}