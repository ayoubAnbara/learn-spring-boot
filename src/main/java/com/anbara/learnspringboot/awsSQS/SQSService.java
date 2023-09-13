//package com.anbara.learnspringboot.awsSQS;
//
//import com.anbara.learnspringboot.config.AppConfig;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
//import org.springframework.context.annotation.Bean;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Service;
//
///**
// * @author Ayoub ANBARA
// */
//@Service
//public class SQSService {
//
//    private final QueueMessagingTemplate queueMessagingTemplate;
//    private final AppConfig.AWS aws;
//    Logger logger = LoggerFactory.getLogger(SQSService.class);
//
//    public SQSService(QueueMessagingTemplate queueMessagingTemplate, AppConfig appConfig) {
//        this.queueMessagingTemplate = queueMessagingTemplate;
//        this.aws = appConfig.aws();
//    }
//
//
//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
//            for (int i = 0; i <10 ; i++) {
//                sendMessageToQueue("hi "+i);
//            }
//        };
//    }
//
//    public void sendMessageToQueue(String message) {
//        queueMessagingTemplate.send(aws.endpointSQS(), MessageBuilder.withPayload(message).build());
//    }
//
//
//}
