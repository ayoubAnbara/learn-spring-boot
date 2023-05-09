package com.anbara.learnspringboot.annotations;

/**
 * @author Ayoub ANBARA
 */
public class EmailNotification implements NotificationSender {
    @Override
    public String send(String message) {
        return "Email Notification: " + message;
    }
}
