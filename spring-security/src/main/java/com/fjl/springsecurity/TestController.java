package com.fjl.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "getData")
    @RequestMapping
    public String getData(){
        return "getData --  testing";
    }
}
