package com.example.demo.Controller;

import antlr.StringUtils;
import com.example.demo.Bean.testuserBean;
import com.example.demo.Mapper.testuserMapper;
import com.example.demo.respository.testuserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;

@RestController
public class testuserController {
    @Autowired
    testuserRespository userRes;
    @Autowired
    testuserMapper userMap;
//    String userid;
//    String userpassward;
//    String username;
//    String usercategory;
//    String userschoolid;
//    int usersubmittime;
//    int usergradetotal;
// 插入用户信息
// 删除用户信息
// 修改用户昵称
// 修改用户密码
// 获取用户信息，前十	1：提交次数2：总成绩3：平均成绩

    //插入完整的一条学生信息
    @GetMapping("/insertuserBean/{userid}/{userpassward}/{username}/{usercategory}/{userschoolid}/{usersubmittime}/{usergradetotal}")
    public  boolean insertuserBeanAll(@PathVariable("userid") String userid,
                                      @PathVariable("userpassward") String userpassward,
                                      @PathVariable("username") String username,
                                      @PathVariable("usercategory") String usercategory,
                                      @PathVariable("userschoolid") String userschoolid,
                                      @PathVariable("usersubmittime") int usersubmittime,
                                      @PathVariable("usergradetotal") int usergradetotal){
        testuserBean userB=new testuserBean(userid,userpassward,username,usercategory,userschoolid,usersubmittime,usergradetotal);
        userRes.save(userB);
        return  true;
    }

    //插入学生信息，一般这个用的比较多，学生信息录入时常用
    @GetMapping("/insertuserInf/{userid}/{userpassward}/{username}/{usercategory}/{userschoolid}")
    public  boolean insertuserInf(@PathVariable("userid") String userid,
                                      @PathVariable("userpassward") String userpassward,
                                      @PathVariable("username") String username,
                                      @PathVariable("usercategory") String usercategory,
                                      @PathVariable("userschoolid") String userschoolid){
        testuserBean userB=new testuserBean(userid,userpassward,username,usercategory,userschoolid,0,0);
        userRes.save(userB);
        return  true;
    }

    //根据学号以及成绩录入一次成绩
    @GetMapping("/submitonetest/{userid}/{grade}")
    public  boolean submitonetest(@PathVariable("userid") String userid,
                                  @PathVariable("grade") int grade){
//        testuserBean userB=userRes.findByuserid(userid);
//        if (userB.getUserid().length()==0||userB.getUserid()==null)
//            return false;
//        userRes.delete(userB);
//        userB.setUsersubmittime(userB.getUsersubmittime()+1);
//        userB.setUsergradetotal(userB.getUsergradetotal()+grade);
//        userRes.save(userB);
        if(userMap.updatetestresult(userid,grade)==1)
            return  true;
        else return false;
    }

    //根据账号密码判断是否能够登录
    @GetMapping("/logonjudgement/{userid}/{userpassword}")
    public boolean login(@PathVariable("userid") String userid,
                         @PathVariable("userpassword") String userpassword) {
        testuserBean userB=userRes.findByuserid(userid);
        if(userpassword.equals(userB.getUserpassward())){
            return true;
        }
        else  return  false;
    }

    //修改用户密码
    @GetMapping("/alterpassword/{userid}/{oldpassword}/{newpassword}")
    public  boolean alterpassword(@PathVariable("userid") String userid,
                                  @PathVariable("oldpassword") String oldpassword,
                                  @PathVariable("newpassword") String newpassword){
        testuserBean userB=userRes.findByuserid(userid);
        if(oldpassword.equals(userB.getUserpassward())){
            userMap.updateuserpassword(userid,newpassword);
            return true;
        }
        else
            return false;
    }

    //根据用户ID初始化用户密码
    @GetMapping("/initializeaccountbyadministrator/{userid}")
    public  boolean initializeaccount(@PathVariable String userid){
        if(userMap.initializepassword(userid)==1)
            return  true;
        else return  false;
    }

    //获取总分数前十的用户信息
    @GetMapping("/gettotalgradetopten")
    public List<testuserBean> gettotalgradetopten(){
        return userMap.selecttotalgradetopten();
    }
    //获取平均分前十的用户信息
    @GetMapping("/getaveragegradetopten")
    public List<testuserBean> getaveragegradetopten(){
        return userMap.selectaveragegradetopten();
    }
    //获取提交次数前十的用户信息
    @GetMapping("/getsubmittimttopten")
    public List<testuserBean> getsubmittimttopten(){
        return userMap.selectsubmittimetopten();
    }
//    @GetMapping()bn
//    public  testuserBean[] gettopsubmittime(){
//
//    }
}
