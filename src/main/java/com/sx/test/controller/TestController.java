package com.sx.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zd
 * @date 2022-10-27 15:05
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
