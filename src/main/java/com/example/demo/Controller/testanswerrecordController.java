package com.example.demo.Controller;

import com.example.demo.Bean.testanswerrecordBean;
import com.example.demo.Mapper.testanswerMapper;
import com.example.demo.respository.testanswerrecordRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testanswerrecordController {
    @Autowired
    testanswerMapper testanswerMap;
    @Autowired
    testanswerrecordRespository testanswerrecordRes;

    @GetMapping("/inseronetestanswerrecord/{userid}/{grade}")
    public boolean inseronetestanswerrecord(@PathVariable("userid") String  userid,
                                            @PathVariable("grade") int  grade){
        if(testanswerMap.inserttestanswer(userid,grade)==1){
            return true;
        }
        else return false;
    }

    @GetMapping("/gettestanswerrecordbeanbyuserid/{userid}")
    public List<testanswerrecordBean> gettestanswerrecordbeanbyuserid(@PathVariable String userid){
        return testanswerrecordRes.findByrecorduserid(userid);
    }
}
