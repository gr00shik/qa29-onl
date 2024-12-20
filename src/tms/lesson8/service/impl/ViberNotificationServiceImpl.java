package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.NotificationService;

public class ViberNotificationServiceImpl implements NotificationService {

    @Override
    public void sendNotification(User user) {
        System.out.println("Send notification to viber for " + user.getUsername());
    }
}
