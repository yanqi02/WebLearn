package com.example.demo.Controller;

import com.example.demo.Bean.testBean;
import com.example.demo.Mapper.testMapper;
import com.example.demo.respository.testRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class testController {
    @Autowired
    testRespository testRes;
    @Autowired
    testMapper testMap;

    @GetMapping("/testtest")
    public  String  testtestController(){
        return "there is testController";
    }

//    @GetMapping("/updalocaltetestRes/{testcategory}")
//    public List<testBean> updalocaltetestRes(@PathVariable String testcategory){
//        return  testRes.findBytestcategory(testcategory);
//        //return testRes.findAll();
//    }

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
    @GetMapping("/insertonetest/{testid}/{testcategory}/{testcontent}/{testanswer}/{testopinionA}/{testopinionB}/{testopinionC}/" +
            "{testopinionD}/{testdescription}/{testpicture}/{testversion}")
    public boolean insertonetest(@PathVariable("testid") String testid,
                                 @PathVariable("testcategory") String testcategory,
                                 @PathVariable("testcontent") String testcontent,
                                 @PathVariable("testanswer") char testanswer,
                                 @PathVariable("testopinionA") String testopinionA,
                                 @PathVariable("testopinionB") String testopinionB,
                                 @PathVariable("testopinionC") String testopinionC,
                                 @PathVariable("testopinionD") String testopinionD,
                                 @PathVariable("testdescription") String testdescription,
                                 @PathVariable("testpicture") String testpicture,
                                 @PathVariable("testversion") String testversion){
        testBean testB=new testBean(testid,testcategory,testcontent,testanswer,testopinionA,testopinionB,
                testopinionC,testopinionD,testdescription,testpicture,testversion);
        testRes.save(testB);
        return true;
    }

    @GetMapping("/insertonetestexpic/{testid}/{testcategory}/{testcontent}/{testanswer}/{testopinionA}/{testopinionB}/{testopinionC}/{testopinionD}/{testdescription}/{testversion}")
    public boolean insertonetestexpic(@PathVariable("testid") String testid,
                                 @PathVariable("testcategory") String testcategory,
                                 @PathVariable("testcontent") String testcontent,
                                 @PathVariable("testanswer") char testanswer,
                                 @PathVariable("testopinionA") String testopinionA,
                                 @PathVariable("testopinionB") String testopinionB,
                                 @PathVariable("testopinionC") String testopinionC,
                                 @PathVariable("testopinionD") String testopinionD,
                                 @PathVariable("testdescription") String testdescription,
                                 @PathVariable("testversion") String  testversion){
        testBean testB=new testBean(testid,testcategory,testcontent,testanswer,testopinionA,testopinionB,testopinionC,testopinionD,testdescription,null,testversion);
        testRes.save(testB);
        return true;
    }

    @GetMapping("/insertonetestexdes/{testid}/{testcategory}/{testcontent}/{testanswer}/{testopinionA}/{testopinionB}/{testopinionC}/{testopinionD}/{testpicture}/{testversion}")
    public boolean insertonetestexdes(@PathVariable("testid") String testid,
                                      @PathVariable("testcategory") String testcategory,
                                      @PathVariable("testcontent") String testcontent,
                                      @PathVariable("testanswer") char testanswer,
                                      @PathVariable("testopinionA") String testopinionA,
                                      @PathVariable("testopinionB") String testopinionB,
                                      @PathVariable("testopinionC") String testopinionC,
                                      @PathVariable("testopinionD") String testopinionD,
                                      @PathVariable("testpicture") String testpicture,
                                      @PathVariable("testversion") String testversion){
        testBean testB=new testBean(testid,testcategory,testcontent,testanswer,testopinionA,testopinionB,testopinionC,testopinionD,null,testpicture,testversion);
        testRes.save(testB);
        return true;
    }

    @GetMapping("/insertonetestexpicdes/{testid}/{testcategory}/{testcontent}/{testanswer}/{testopinionA}/{testopinionB}/{testopinionC}/{testopinionD}/{testversion}")
    public boolean insertonetestexpicdes(@PathVariable("testid") String testid,
                                      @PathVariable("testcategory") String testcategory,
                                      @PathVariable("testcontent") String testcontent,
                                      @PathVariable("testanswer") char testanswer,
                                      @PathVariable("testopinionA") String testopinionA,
                                      @PathVariable("testopinionB") String testopinionB,
                                      @PathVariable("testopinionC") String testopinionC,
                                      @PathVariable("testopinionD") String testopinionD,
                                      @PathVariable("testversion") String testversion){
        testBean testB=new testBean(testid,testcategory,testcontent,testanswer,testopinionA,testopinionB,testopinionC,testopinionD,null,null,testversion);
        testRes.save(testB);
        return true;
    }

    @GetMapping("/gettestbeanbytestcategory/{testcategory}")
    public List<testBean> gettestbeanbytestcategory(@PathVariable String testcategory){
        return testRes.findBytestcategory(testcategory);
    }


    @GetMapping("/testinserpicture")
    public boolean testinserpicture(){
        return true;
    }

}
