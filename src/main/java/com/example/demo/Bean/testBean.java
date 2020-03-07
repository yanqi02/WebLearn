package com.example.demo.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class testBean {
    public testBean(String testid, String testcategory, String testcontent, char testanswer, String testopinionA, String testopinionB, String testopinionC, String testopinionD, String testdescription, String testpicture,String testversion) {
        this.testid = testid;
        this.testcategory = testcategory;
        this.testcontent = testcontent;
        this.testanswer = testanswer;
        this.testopinionA = testopinionA;
        this.testopinionB = testopinionB;
        this.testopinionC = testopinionC;
        this.testopinionD = testopinionD;
        this.testdescription = testdescription;
        this.testpicture = testpicture;
        this.testversion=testversion;
    }

    public testBean(){}

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getTestcategory() {
        return testcategory;
    }

    public void setTestcategory(String testcategory) {
        this.testcategory = testcategory;
    }

    public String getTestcontent() {
        return testcontent;
    }

    public void setTestcontent(String testcontent) {
        this.testcontent = testcontent;
    }

    public char getTestanswer() {
        return testanswer;
    }

    public void setTestanswer(char testanswer) {
        this.testanswer = testanswer;
    }

    public String getTestopinionA() {
        return testopinionA;
    }

    public void setTestopinionA(String testopinionA) {
        this.testopinionA = testopinionA;
    }

    public String getTestopinionB() {
        return testopinionB;
    }

    public void setTestopinionB(String testopinionB) {
        this.testopinionB = testopinionB;
    }

    public String getTestopinionC() {
        return testopinionC;
    }

    public void setTestopinionC(String testopinionC) {
        this.testopinionC = testopinionC;
    }

    public String getTestopinionD() {
        return testopinionD;
    }

    public void setTestopinionD(String testopinionD) {
        this.testopinionD = testopinionD;
    }

    public String getTestdescription() {
        return testdescription;
    }

    public void setTestdescription(String testdescription) {
        this.testdescription = testdescription;
    }

    public String getTestpicture() {
        return testpicture;
    }

    public void setTestpicture(String testpicture) {
        this.testpicture = testpicture;
    }

    public String getTestversion() { return testversion; }

    public void setTestversion(String testversion) { this.testversion = testversion; }

//    create table test(
//    testid varchar(20) primary key,
//    testcategory varchar(20),
//    testcontent varchar(1000),
//    testanswer char default 'A',
//    testopinionA varchar(100),
//    testopinionB varchar(100),
//    testopinionC varchar(100) default null,
//    testopinionD varchar(100) default null,
//    testdescription varchar(100),
//    testpicture varchar(100),
//    testversion varchar(10)
//    testpicture mediumblob
//插入一道测试题               boolean                     ----------有待调整
//删除一道测试题               loolean
//查询标签为stu/tch的测试题    List<testBean>
    @Id
    String testid;
    @Column
    String testcategory;
    @Column
    String testcontent;
    @Column
    char testanswer;
    @Column
    String testopinionA;
    @Column
    String testopinionB;
    @Column
    String testopinionC;
    @Column
    String testopinionD;
    @Column
    String testdescription;
    @Column
    String testpicture;
    @Column
    String testversion;
}
