package com.stevi.jms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "test", containerFactory = "customFactory")
    public void listenTest(String message) {
        System.out.println(message);
    }
}
