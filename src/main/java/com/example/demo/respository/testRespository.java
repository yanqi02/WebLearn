package com.example.demo.respository;

import com.example.demo.Bean.testBean;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface testRespository extends JpaRepository<testBean,String> {
    public testBean findBytestid(String testid);
    public List<testBean> findBytestcategory(String testcategory);
}
