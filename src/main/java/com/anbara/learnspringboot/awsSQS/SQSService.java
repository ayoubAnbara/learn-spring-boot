package com.anbara.learnspringboot.awsSQS;

import com.anbara.learnspringboot.config.AppConfig;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author Ayoub ANBARA
 */
@Service
public class SQSService {

    private final SqsTemplate sqsTemplate;

    Logger logger = LoggerFactory.getLogger(SQSService.class);

    public SQSService(SqsTemplate sqsTemplate) {
        this.sqsTemplate = sqsTemplate;
    }


    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            for (int i = 0; i < 10; i++) {
                sendMessageToQueue("hi " + i);
            }
        };
    }

    public void sendMessageToQueue(String message) {
       // sqsTemplate.send(MessageBuilder.withPayload(message).build());
    }


}
