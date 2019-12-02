package com.atguigu.nacosconsumer.controller;

import com.atguigu.nacosconsumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hi")
    public String hi(){
        String hello = this.providerClient.hello();
        return "hi provider,===========" + hello;
    }
    public void devtest(){

    }

    public void mastertest (){}
}
