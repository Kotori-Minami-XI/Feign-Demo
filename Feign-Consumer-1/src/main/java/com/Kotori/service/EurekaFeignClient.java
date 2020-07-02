package com.Kotori.service;

import com.Kotori.SDK.OrderApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "feign-provider-group")
public interface EurekaFeignClient extends OrderApi{
    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody String orderId);

    @RequestMapping("/cancelOrder/{orderId}")
    public String cancelOrder(@PathVariable String orderId);
}
