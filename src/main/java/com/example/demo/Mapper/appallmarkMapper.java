package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface appallmarkMapper {
    @Insert("insert into  appallmark(currentappversion,currentexammversion,appnotice) values (#{appversion},#{exammversion},#{appnotice});")
    public int insertappallmarkbean(String appversion,String exammversion,String appnotice);
}
