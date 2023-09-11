package com.anbara.learnspringboot.annotations;

/**
 * @author Ayoub ANBARA
 */
public class SMSNotification implements NotificationSender {
    @Override
    public String send(String message) {
        return "SMS Notification: " + message;

    }
}
