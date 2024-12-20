package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.UserValidator;

public class SimpleUserValidatorImpl implements UserValidator {

    @Override
    public boolean isValid(User user) {
        return user.getAge() >= 22;
    }
}
