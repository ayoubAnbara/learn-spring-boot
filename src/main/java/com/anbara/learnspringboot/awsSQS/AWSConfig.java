//package com.anbara.learnspringboot.awsSQS;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;
//import com.anbara.learnspringboot.config.AppConfig;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author Ayoub ANBARA
// */
//@Configuration
//public class AWSConfig {
//    private final AppConfig appConfig;
//
//    public AWSConfig(AppConfig appConfig) {
//        this.appConfig = appConfig;
//    }
//
//    @Bean
//    public QueueMessagingTemplate queueMessagingTemplate() {
//        return new QueueMessagingTemplate(amazonSQSAsync());
//    }
//
//    //    @Primary
////    @Bean
//    public AmazonSQSAsync amazonSQSAsync() {
//        return AmazonSQSAsyncClientBuilder.standard().withRegion(Regions.EU_WEST_3)
//                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(appConfig.aws().accessKeyId(),
//                        appConfig.aws().secretKey())))
//                .build();
//    }
//}
