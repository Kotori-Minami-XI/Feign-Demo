package com.Kotori.controller;

import com.Kotori.service.EurekaFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    private EurekaFeignClient feignClient;

    @RequestMapping("/pay")
    public String pay(String orderId) {
        return feignClient.getOrder(orderId);
    }

    @RequestMapping("/cancel")
    public String cancel(String orderId) {
        return feignClient.getOrder(orderId);
    }
}
