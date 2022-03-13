package com.acer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "order", groupId = "g1")
    void listener(String data) {
        System.out.println("Message received in listener --> " + data);
    }
}
