package com.fjl.customer.service;

import com.fjl.customer.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> selectAll();


    public Customer selectByPrimaryKey(Integer id);
}
