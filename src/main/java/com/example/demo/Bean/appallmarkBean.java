package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "appallmark")
public class appallmarkBean {
//    create table appallmark(
//    appmarktime int primary key auto_increment,
//    currentappversion varchar(10),   #表示软件版本
//    currentexammversion varchar(10),
//    appnotice varchar(100)
//    )default charset=utf8;
//记录软件版本，题库版本，软件通知修改记录信息

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int appmarktime;
    @Column
    String currentappversion;
    @Column
    String currentexammversion;
    @Column
    String appnotice;

    public appallmarkBean(int appmarktime, String currentappversion, String currentexammversion, String appnotice) {
        this.appmarktime = appmarktime;
        this.currentappversion = currentappversion;
        this.currentexammversion = currentexammversion;
        this.appnotice = appnotice;
    }

    public appallmarkBean() { }

    public int getAppmarktime() {
        return appmarktime;
    }

    public void setAppmarktime(int appmarktime) {
        this.appmarktime = appmarktime;
    }

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
}
