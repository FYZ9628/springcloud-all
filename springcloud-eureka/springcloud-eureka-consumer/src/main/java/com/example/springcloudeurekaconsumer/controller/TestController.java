package com.example.springcloudeurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Administrator
 * @Date 2021/12/1 0:43
 */
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;


    //访问地址：http://127.0.0.1:8002/test/get
    @RequestMapping(value = "/test/get",method = RequestMethod.GET)
    public String TestMethod(){
        //此参数为注册在Eureka中的服务
        String ticketName = restTemplate.getForObject("http://springcloud-eureka-provider//test/get", String.class);
        return ticketName;
    }



}