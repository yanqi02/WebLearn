package com.example.demo.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "apprvmark")
public class apprvmarkBean {
    public apprvmarkBean(String currentappversion, String currentexammversion, String appnotice) {
        this.currentappversion = currentappversion;
        this.currentexammversion = currentexammversion;
        this.appnotice = appnotice;
    }
    public apprvmarkBean() { }

    public String getCurrentappversion() {
        return currentappversion;
    }

    public void setCurrentappversion(String currentappversion) {
        this.currentappversion = currentappversion;
    }

    public String getCurrentexammversion() {
        return currentexammversion;
    }

    public void setCurrentexammversion(String currentexammversion) {
        this.currentexammversion = currentexammversion;
    }

    public String getAppnotice() {
        return appnotice;
    }

    public void setAppnotice(String appnotice) {
        this.appnotice = appnotice;
    }

//    create table apprvmark(
//    currentappversion varchar(10) primary key,   #表示软件版本
//    currentexammversion varchar(10),
//    appnotice varchar(100)
//    )default charset=utf8;
//更新软件通知appnotice                   boolean
//更新当前软件版本currentappversion        boolean
//更新档前题库版本currentexamversion        boolean
//获取当前软件版本信息                        String
//获取当前题库版本信息                        String
//获取当前软件公告                            String
    @Id
    String currentappversion;
    @Column
    String currentexammversion;
    @Column
    String appnotice;
}
