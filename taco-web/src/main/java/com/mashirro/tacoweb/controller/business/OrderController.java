package com.mashirro.tacoweb.controller.business;

import com.mashirro.tacobusiness.domain.Order;
import com.mashirro.tacobusiness.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public class OrderController {

    @Autowired
    private OrderService orderService;


    /**
     * 更新某个订单(局部更新)
     *  (我们没有办法移除或添加集合的子集,如果客户端想要添加或移除集合中的条目,那么它必须将变更的完整集合发送到服务器端)
     * @param orderId
     * @param patch
     * @return
     */
    @PatchMapping("/{orderId}")
    public Order patchOrder(@PathVariable("orderId") String orderId, @RequestBody Order patch) {
        Order order = orderService.getBaseMapper().selectById(orderId);
        if (patch.getDeliveryName() != null) {
            order.setDeliveryName(patch.getDeliveryName());
        }
        if (patch.getDeliveryStreet() != null) {
            order.setDeliveryStreet(patch.getDeliveryStreet());
        }
        if (patch.getDeliveryCity() != null) {
            order.setDeliveryCity(patch.getDeliveryCity());
        }
        if (patch.getDeliveryState() != null) {
            order.setDeliveryState(patch.getDeliveryState());
        }
        if (patch.getDeliveryZip() != null) {
            order.setDeliveryZip(patch.getDeliveryZip());
        }
        if (patch.getCcNumber() != null) {
            order.setCcNumber(patch.getCcNumber());
        }
        if (patch.getCcExpiration() != null) {
            order.setCcExpiration(patch.getCcExpiration());
        }
        if (patch.getCcCVV() != null) {
            order.setCcCVV(patch.getCcCVV());
        }
        return orderService.updateOrderById(order);
    }


    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable("orderId") String orderId){
        orderService.getBaseMapper().deleteById(orderId);
    }
}
