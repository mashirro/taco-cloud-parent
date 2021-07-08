package com.mashirro.tacoweb.controller.business;

import com.mashirro.tacobusiness.domain.Order;
import com.mashirro.tacobusiness.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 更新某个订单(局部更新)
     *
     * @param orderId
     * @param patch
     * @return
     */
    @PatchMapping("/{orderId}")
    public Order patchOrder(@PathVariable("orderId") String orderId, @RequestBody Order patch) {
        Order order = orderService.getBaseMapper().selectById(orderId);
        return null;
    }
}
