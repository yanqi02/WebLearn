package com.example.demo.Bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "testanswerrecord")
public class testanswerrecordBean {
    public testanswerrecordBean(int recordcount, String recorduserid, int recordgrade, Date recorddate) {
        this.recordcount = recordcount;
        this.recorduserid = recorduserid;
        this.recordgrade = recordgrade;
        this.recorddate = recorddate;
    }
    public testanswerrecordBean(String recorduserid, int recordgrade) {
        this.recorduserid = recorduserid;
        this.recordgrade = recordgrade;
    }
    public testanswerrecordBean() { }

    public int getRecordcount() {
        return recordcount;
    }

    public void setRecordcount(int recordcount) {
        this.recordcount = recordcount;
    }

    public String getRecorduserid() {
        return recorduserid;
    }

    public void setRecorduserid(String recorduserid) {
        this.recorduserid = recorduserid;
    }

    public int getRecordgrade() {
        return recordgrade;
    }

    public void setRecordgrade(int recordgrade) {
        this.recordgrade = recordgrade;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

//    create table record(
//    recordcount int primary key auto_increment,
//    recorduserid varchar(20),
//    recordgrade int,
//    recorddate datetime default now()
//插入一条测试成绩结果
//根据userid查询用户测试结果记录
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int recordcount;
    @Column
    String recorduserid;
    @Column
    int recordgrade;
    @Column
    Date recorddate;
}
