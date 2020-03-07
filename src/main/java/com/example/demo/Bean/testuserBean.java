package com.example.demo.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testuser")
public class testuserBean {
//    create table testuser(
//    userid varchar(20) primary key,#用户ID
//    userpassward varchar(20),		#密码
//    username varchar(20),			#帐号昵称
//    usercategory varchar(20),		#身份类别tch/stu
//    userschoolid varchar(20),		#校园卡证件号
//    usersubmittime int default 0,	#提交总次数
//    usergradetotal int default 0	#该用户总成绩
//    )default charset=utf8;
// 插入用户信息                          boolean
// 删除用户信息                          boolean
// 修改用户昵称                          boolean
// 修改用户密码                          boolean
// 初始化用户密码                        boolean
// 判断用户能否登陆                      boolean
// 获取用户信息，前十	1：提交次数      List<testuserBean>
//                      2：总成绩        List<testuserBean>
//                      3：平均成绩      List<testuserBean>
// 提交一次用户成绩  1：总提交次数+1       boolean
//                 2：总成绩+            boolean
//
    @Id
    String userid;
    @Column
    String userpassward;
    @Column
    String username;
    @Column
    String usercategory;
    @Column
    String userschoolid;
    @Column
    int usersubmittime;
    @Column
    int usergradetotal;


    public testuserBean(String userid, String userpassward, String username, String usercategory, String userschoolid, int usersubmittime, int usergradetotal) {
        this.userid = userid;
        this.userpassward = userpassward;
        this.username = username;
        this.usercategory = usercategory;
        this.userschoolid = userschoolid;
        this.usersubmittime = usersubmittime;
        this.usergradetotal = usergradetotal;
    }
    public  testuserBean(){ }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpassward() {
        return userpassward;
    }

    public void setUserpassward(String userpassward) {
        this.userpassward = userpassward;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsercategory() {
        return usercategory;
    }

    public void setUsercategory(String usercategory) {
        this.usercategory = usercategory;
    }

    public String getUserschoolid() {
        return userschoolid;
    }

    public void setUserschoolid(String userschoolid) {
        this.userschoolid = userschoolid;
    }

    public int getUsersubmittime() {
        return usersubmittime;
    }

    public void setUsersubmittime(int usersubmittime) {
        this.usersubmittime = usersubmittime;
    }

    public int getUsergradetotal() {
        return usergradetotal;
    }

    public void setUsergradetotal(int usergradetotal) {
        this.usergradetotal = usergradetotal;
    }


}
