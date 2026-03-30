package com.example.learnKafka.notification_service.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage1(String message){

        log.info("Received user random message: {}", message);

    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage2(String message){

        log.info("Received user random message: {}", message);

    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage3(String message){

        log.info("Received user random message: {}", message);

    }



}
