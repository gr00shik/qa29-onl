package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.UserValidator;

public class HardUserValidatorImpl implements UserValidator {

    private String[] fobNames = {"user0", "admin0"};

    @Override
    public boolean isValid(User user) {

        String name = user.getUsername();

        for (String fobName : fobNames) {
            if (name.equals(fobName)) {
                return false;
            }
        }

        return user.getAge() >= 22;

    }
}
