package com.example.demo.Controller;

import com.example.demo.Bean.testpicBean;
import com.example.demo.Mapper.testpicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class testpicController {
    @Autowired
    testpicMapper picMap;

    @GetMapping("/insertoneppic/{picid}")
    public boolean insertoneppic(@PathVariable String picid){
        try {
            InputStream in=new FileInputStream("C:/Users/purem/Desktop/lyGame/cf55f01963e9de72aa85bb6006e82ae6.jpg");
            InputStream in2=new FileInputStream("C:/Users/purem/Pictures/Facade4.gif");
            picMap.insertonepic(picid,in2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @GetMapping("/getpic/{picid}")
    public testpicBean getpic(@PathVariable String picid){
        testpicBean picB=picMap.getpic(picid);
        try {
            FileOutputStream out= new FileOutputStream("C:/Users/purem/Desktop/lyGame/3.jpg");
            byte[] inst=picB.getPic();
            out.write(inst,0,inst.length);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picB;
    }
}
