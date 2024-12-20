package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.NotificationService;

public class EmailNotificationServiceImpl implements NotificationService {

    @Override
    public void sendNotification(User user) {
        System.out.println("Send to email");
    }
}
