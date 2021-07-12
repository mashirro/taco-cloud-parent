package com.mashirro.tacobusiness.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mashirro.tacobusiness.mapper.OrderMapper;
import com.mashirro.tacobusiness.mapper.OrderTacoMapper;
import com.mashirro.tacobusiness.service.OrderService;
import com.mashirro.tacocommon.domain.Order;
import com.mashirro.tacocommon.domain.OrderTaco;
import com.mashirro.tacocommon.domain.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderTacoMapper orderTacoMapper;


    @Override
    public Order updateOrderById(Order order) {
        orderMapper.updateById(order);
        return order;
    }

    @Override
    @Transactional
    public Order saveOrder(Order order) {
        String orderId = UUID.randomUUID().toString();
        order.setId(orderId);
        order.setCreateTime(new Date());
        orderMapper.insert(order);
        List<Taco> tacos = order.getTacos();
        OrderTaco orderTaco = new OrderTaco();
        orderTaco.setTacoOrderId(orderId);
        for (Taco taco : tacos) {
            orderTaco.setTacoId(taco.getId());
            orderTacoMapper.insert(orderTaco);
        }
        return order;
    }
}
