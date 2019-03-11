package com.tgram.kafkaimportdata.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    @KafkaListener(topics = {"$kafka.consumer.topic"})
    public void test(ConsumerRecord<?,?> record){
        System.out.println(record);
    }
}
