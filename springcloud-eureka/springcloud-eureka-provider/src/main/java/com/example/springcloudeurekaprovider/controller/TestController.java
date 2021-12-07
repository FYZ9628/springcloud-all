package com.example.springcloudeurekaprovider.controller;

import com.example.springcloudeurekaprovider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2021/12/1 0:35
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;


    //访问地址：http://127.0.0.1:8001/test/get
    @RequestMapping(value = "/test/get",method = RequestMethod.GET)
    public String TestMethod(){
        return testService.TestMethod();
    }

}
