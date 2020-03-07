package com.example.demo.respository;

import com.example.demo.Bean.testanswerrecordBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface testanswerrecordRespository extends JpaRepository<testanswerrecordBean,String > {
    public List<testanswerrecordBean> findByrecorduserid(String recorduserid);
}
