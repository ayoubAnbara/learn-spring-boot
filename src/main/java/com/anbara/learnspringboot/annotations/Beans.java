package com.anbara.learnspringboot.annotations;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ayoub ANBARA
 */
@Configuration

public class Beans {

    /**
     * the @ConditionalOnProperty annotation allows us to register beans conditionally
     * depending on the presence of a configuration property.
     * */
    @Bean(name = "emailNotification")
    @ConditionalOnProperty(prefix = "notification", name = "service",havingValue = "email")
     NotificationSender notificationSender() {
        System.out.println("Creating bean EmailNotification");
        return new EmailNotification();
    }
    @Bean
    @ConditionalOnProperty(prefix = "notification",name = "service",havingValue = "sms")
    NotificationSender notificationSender2(){
        System.out.println("Creating bean SMSNotification");
        return new SMSNotification();
    }
}
