package com.example.learnKafka.notification_service.consumer;

import com.example.learnKafka.user_service.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-created-topic")
    public void handleUserCreated(UserCreatedEvent userCreatedEvent) {
        log.info("handleUserCreated: {}", userCreatedEvent);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage1(String message){

        log.info("handleUserRandomMessage1: {}", message);

    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage2(String message){

        log.info("handleUserRandomMessage2: {}", message);

    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomMessage3(String message){

        log.info("handleUserRandomMessage3: {}", message);

    }



}
