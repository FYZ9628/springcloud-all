package com.example.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @Date 2021/12/8 0:16
 */

@RestController
public class ClientController {

    @Value("${word}")
    private String word;

    //访问地址：http://127.0.0.1:8004/hello?name=klkkll
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return name+","+this.word;
    }
}

