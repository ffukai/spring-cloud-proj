package com.fjl.customer.controller;

import com.fjl.customer.model.Customer;
import com.fjl.customer.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Api(value = "客户控制类CustomerController" ,tags = "客户控制类")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    private static Map<String, List<Map<String, String>>> enumCache;

    /**
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "通过ID获取客户信息",tags = "getCustomerById")
    @ApiImplicitParam(name = "id" , value = "用户id" , required = true , dataType = "Integer")
    @GetMapping(value = "/getCustomerById/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        Customer customer = null;

        try {
            customer = customerService.selectByPrimaryKey(id);
            System.out.println("status-key : " + customer.getStatus().getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }


    @ApiOperation(value = "获取所有客户信息",tags = "getAll")
    @GetMapping(value = "/getAll")
    public List<Customer> getAll(){
        List<Customer> customerList = new ArrayList<Customer>();
        try {
            customerList = customerService.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public List<Map<Integer,String>> getALLCustomer(@PathVariable String enumType){
        List<Map<Integer,String>> list = new ArrayList<Map<Integer,String>>();




        return list;
    }


}
