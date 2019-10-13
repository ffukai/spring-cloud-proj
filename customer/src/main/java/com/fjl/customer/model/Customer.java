package com.fjl.customer.model;

import com.fjl.customer.enums.StatusEnum;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.util.Map;

public class Customer {

    @ApiModelProperty("客户ID")
    private Integer id;
    @ApiModelProperty("姓名")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("年龄")
    private Integer age;
    @ApiModelProperty("状态")
    private StatusEnum status ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

}