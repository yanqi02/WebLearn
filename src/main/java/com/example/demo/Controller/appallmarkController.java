package com.example.demo.Controller;

import com.example.demo.Mapper.appallmarkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appallmarkController {
    @Autowired
    appallmarkMapper appallmarkMap;

    @GetMapping("/insertappallmarkbean/{appversion}/{exammversion}/{appnotice}")
    public boolean insertappallmarkbean(@PathVariable("appversion") String appversion,
                                        @PathVariable("exammversion") String exammversion,
                                        @PathVariable("appnotice") String appnotice){
        if(appallmarkMap.insertappallmarkbean(appversion,exammversion,appnotice)==1)
            return true;
        else return false;
    }
}
