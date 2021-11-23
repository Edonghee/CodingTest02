package com.test.codingtest02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloUser(String name){
        String result = "";
        if(name == null || "".equals(name)){
            result = "잘못 된 접근입니다.";
        }else{
            result = name + "님. 안녕하세요.";
        }
        return result;
    }
}
