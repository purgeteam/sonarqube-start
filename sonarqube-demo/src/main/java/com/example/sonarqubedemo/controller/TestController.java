package com.example.sonarqubedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author purgeyao
 * @since 1.0
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return  "123";
    }
}
