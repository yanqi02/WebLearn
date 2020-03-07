package com.example.demo.Controller;

import com.example.demo.Mapper.apprvmarkMapper;
import com.example.demo.respository.apprvmarkRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apprvmarkController {
    @Autowired
    apprvmarkMapper apprvmarkMap;
    @Autowired
    apprvmarkRespository apprvmarkRes;

    @GetMapping("/updatecurrentappversion/{oldappversion}/{newappversion}")
    public boolean updatecurrentappversion(@PathVariable("oldappversion") String  oldappversion,
                                           @PathVariable("newappversion") String  newappversion){
        if(apprvmarkMap.updatecurrentappversion(newappversion,oldappversion)==1)
            return true;
        else return false;
    }

    @GetMapping("/updatecurrentexammversion/{appversion}/{newexammversion}")
    public boolean updatecurrentexammversion(@PathVariable("appversion") String  appversion,
                                           @PathVariable("newexammversion") String  newexammversion){
        if(apprvmarkMap.updatecurrentexammversion(appversion,newexammversion)==1)
            return true;
        else return false;
    }

    @GetMapping("/updateappnotice/{appversion}/{appnotice}")
    public boolean updateappnotice(@PathVariable("appversion") String  appversion,
                                   @PathVariable("appnotice") String  appnotice){
        if(apprvmarkMap.updateappnotice(appversion,appnotice)==1)
            return true;
        else return false;
    }
}
