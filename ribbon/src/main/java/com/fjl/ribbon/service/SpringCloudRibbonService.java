package com.fjl.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpringCloudRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String getCustomerById(Integer id){
        return restTemplate.getForObject("http://customer/getCustomerById/" + id,String.class);
    }
}
