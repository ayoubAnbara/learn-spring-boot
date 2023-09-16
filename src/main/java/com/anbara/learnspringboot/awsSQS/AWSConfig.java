package com.anbara.learnspringboot.awsSQS;

import com.anbara.learnspringboot.config.AppConfig;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ayoub ANBARA
 */
@Configuration
public class AWSConfig {
    private final AppConfig appConfig;

    public AWSConfig(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    /*@Bean
    public SqsTemplate sqsTemplate() {
        SqsAsyncClient sqsAsyncClient = ;
        return  SqsTemplate.builder()
                .sqsAsyncClient(sqsAsyncClient)
                .build();
    }

    //    @Primary
//    @Bean
    public AmazonSQSAsync amazonSQSAsync() {
        return AmazonSQSAsyncClientBuilder.standard().withRegion(Regions.EU_WEST_3)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(appConfig.aws().accessKeyId(),
                        appConfig.aws().secretKey())))
                .build();
    }*/
}
