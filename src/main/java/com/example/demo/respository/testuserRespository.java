package com.example.demo.respository;

import com.example.demo.Bean.testuserBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface testuserRespository extends JpaRepository<testuserBean,String> {
    public  testuserBean findByuserid(String userid);
}
