package com.mashirro.tacobusiness.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mashirro.tacobusiness.domain.Order;

public interface OrderService extends IService<Order> {
    Order updateOrderById(Order order);
}
