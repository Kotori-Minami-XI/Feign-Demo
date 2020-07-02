package com.Kotori.SDK;

public interface OrderApi {
    public String getOrder(String orderId);

    public String cancelOrder(String orderId);
}
