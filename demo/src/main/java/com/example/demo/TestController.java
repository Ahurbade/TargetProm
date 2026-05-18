package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

    @GetMapping("/getMsg")
    public String getMessage(){
        return "Build jenkins Set up done";
    }

}
