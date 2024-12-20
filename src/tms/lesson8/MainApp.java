package tms.lesson8;

import tms.lesson8.domain.User;
import tms.lesson8.inner.ClassB;
import tms.lesson8.service.NotificationService;
import tms.lesson8.service.UserHandler;
import tms.lesson8.service.impl.*;

public class MainApp {

    public static void main(String ... args) {

        User user = new User("user1", "qwerty", 25);

        UserHandler handler = new UserHandlerImpl(
                new SimpleUserValidatorImpl(),
                new UserDataServiceImpl(),
                new NotificationService[]{
                        new TelegramNotificationService(),
                        new ViberNotificationServiceImpl(),
                        new EmailNotificationServiceImpl()
                });

        handler.register(user);

        ClassB.Inner.innerTest();

    }

}
