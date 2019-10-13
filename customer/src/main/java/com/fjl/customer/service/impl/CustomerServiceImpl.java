package com.fjl.customer.service.impl;

import com.fjl.customer.dao.CustomerMapper;
import com.fjl.customer.enums.StatusEnum;
import com.fjl.customer.model.Customer;
import com.fjl.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> selectAll() {

        List<Customer> customerList = new ArrayList<Customer>();
        try {
            customerList = customerMapper.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        Customer customer = null;
        try {
            customer = customerMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customer;
    }
}
