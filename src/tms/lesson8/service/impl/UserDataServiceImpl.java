package tms.lesson8.service.impl;

import tms.lesson8.domain.User;
import tms.lesson8.service.UserDataService;

public class UserDataServiceImpl implements UserDataService {

    @Override
    public void save(User user) {
        System.out.println("Save user " + user.getUsername() + " to database");
    }
}
