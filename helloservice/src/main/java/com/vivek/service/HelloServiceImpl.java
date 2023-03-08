package com.vivek.service;

public class HelloServiceImpl implements HelloService {

    private String param;

    @Override
    public void m1() {
        System.out.println("hello from the default implementation with value " + param);
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
