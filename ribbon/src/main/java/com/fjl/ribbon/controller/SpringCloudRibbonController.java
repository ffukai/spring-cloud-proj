package com.fjl.ribbon.controller;

import com.fjl.ribbon.service.SpringCloudRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCloudRibbonController {

    @Autowired
    private SpringCloudRibbonService springCloudRibbonService;

    @RequestMapping("getCustomerById/{id}")
    public String getUser(@PathVariable Integer id){
        return springCloudRibbonService.getCustomerById(id);
    }
}
