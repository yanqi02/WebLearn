package com.example.demo.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testpic")
public class testpicBean {
    public testpicBean(String picid, byte[] pic) {
        this.picid = picid;
        this.pic = pic;
    }

    public testpicBean() {} ;

    public String getPicid() {
        return picid;
    }

    public void setPicid(String picid) {
        this.picid = picid;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }
    @Id
    String picid;
    @Column
    byte[] pic;
}
