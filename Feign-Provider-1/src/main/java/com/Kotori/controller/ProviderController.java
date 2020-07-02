package com.Kotori.controller;

import com.Kotori.SDK.OrderApi;
import com.Kotori.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProviderController implements OrderApi {
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody String orderId) {
        return orderService.getOrder(orderId);
    }

    @RequestMapping("/getOrder/{orderId}")
    public String cancelOrder(@PathVariable String orderId) {
        return orderService.getOrder(orderId);
    }
}
