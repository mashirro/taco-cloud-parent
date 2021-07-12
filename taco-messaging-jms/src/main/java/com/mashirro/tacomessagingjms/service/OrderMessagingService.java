package com.mashirro.tacomessagingjms.service;


import com.mashirro.tacocommon.domain.Order;

public interface OrderMessagingService {

    /**
     * 发送订单
     * @param order
     */
    void sendOrder(Order order);
}
