package com.mashirro.tacomessagingjms.service.impl;


import com.mashirro.tacocommon.domain.Order;
import com.mashirro.tacomessagingjms.service.OrderMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsOrderMessagingService implements OrderMessagingService {

    @Autowired
    private JmsTemplate jmsTemplate;


    @Override
    public void sendOrder(Order order) {
        
    }
}
