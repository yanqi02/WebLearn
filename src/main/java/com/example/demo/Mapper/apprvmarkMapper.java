package com.example.demo.Mapper;

import com.example.demo.Bean.apprvmarkBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface apprvmarkMapper {
    @Update("UPDATE apprvmark SET currentappversion=#{newappversion} where currentappversion=#{oldappversion};")
    public int updatecurrentappversion(String newappversion,String oldappversion);

    @Update("UPDATE apprvmark SET currentexammversion=#{newexammversion} where currentappversion=#{appversion};")
    public int updatecurrentexammversion(String appversion,String newexammversion);

    @Update("UPDATE apprvmark SET appnotice=#{appnotice} where currentappversion=#{appversion};")
    public int updateappnotice(String appversion,String appnotice);

    @Select("select * from apprvmark;")
    public List<apprvmarkBean> selectapprvmark();
}
