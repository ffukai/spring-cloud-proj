package com.fjl.feign.controller;

import com.fjl.feign.service.SpringCloudFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudFeignController {

    @Autowired
    private SpringCloudFeignService feignService;

    @GetMapping(value = "/getCustomerById/{id}")
    public String getUser(@PathVariable Integer id){
        System.out.println(id);
        return feignService.getCustomerById(id);
    }
}
