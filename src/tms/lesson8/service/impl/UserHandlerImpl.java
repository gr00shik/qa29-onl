package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.NotificationService;
import tms.lesson8.service.UserDataService;
import tms.lesson8.service.UserHandler;
import tms.lesson8.service.UserValidator;

public class UserHandlerImpl implements UserHandler {

    private UserValidator validator;
    private UserDataService dataService;
    private NotificationService[] notificationServices;

    public UserHandlerImpl(UserValidator validator, UserDataService dataService, NotificationService[] notificationServices) {
        this.validator = validator;
        this.dataService = dataService;
        this.notificationServices = notificationServices;
    }

    @Override
    public void register(User user) {
        System.out.println("step1: validation");

        boolean isValid = validator.isValid(user);

        if (!isValid) {
            System.out.println("step1.1: validation failed");
            return;
        }

        System.out.println("step2: save user");
        dataService.save(user);

        System.out.println("step3: send notification");

        for (NotificationService notificationService : notificationServices) {
            notificationService.sendNotification(user);
        }

    }

}
