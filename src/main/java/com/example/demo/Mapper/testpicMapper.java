package com.example.demo.Mapper;

import com.example.demo.Bean.testpicBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.io.InputStream;

@Mapper
public interface testpicMapper {
    @Insert("insert into testpic(picid,pic) values (#{picid},#{pic});")
    public  int  insertonepic(String picid, InputStream pic);

    @Select("select * from testpic where picid=#{picid}")
    public testpicBean getpic(String picid);
}
