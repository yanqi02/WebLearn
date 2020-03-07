package com.example.demo.Mapper;

import com.example.demo.Bean.testuserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface testuserMapper {
//    String userid;
//    String userpassward;
//    String username;
//    String usercategory;
//    String userschoolid;
//    int usersubmittime;
//    int usergradetotal;
    @Select("select * from testuser order by usersubmittime desc limit 0,10;")
    public List<testuserBean> selectsubmittimetopten();

    @Select("select * from testuser order by usergradetotal desc limit 0,10;")
    public List<testuserBean> selecttotalgradetopten();

    @Select("select * from testuser order by usergradetotal/usersubmittime desc limit 0,10;")
    public List<testuserBean> selectaveragegradetopten();

    @Select("select * from testuser where userid=#{userid}")
    public testuserBean simpleselect(String userid);

    @Update("UPDATE testuser SET usersubmittime=usersubmittime+1,usergradetotal=usergradetotal+#{usergradetotal} WHERE userid=#{userid};")
    public int updatetestresult(String userid,int usergradetotal);

    @Update("UPDATE testuser SET userpassward=#{newpassword} WHERE userid=#{userid};")
    public int updateuserpassword(String userid,String newpassword);

    @Update("UPDATE testuser SET userpassward=userid WHERE userid=#{userid};")
    public int initializepassword(String userid);
}
