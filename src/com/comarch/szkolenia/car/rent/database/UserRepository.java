package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Constants;
import com.comarch.szkolenia.car.rent.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> users = new HashMap<>();
    private final static UserRepository instance = new UserRepository();

    private UserRepository() {
        this.users.put("admin", new User("admin", "73e448ae60c818c23ede44ee35be02b3", Constants.ADMIN_ROLE));
        this.users.put("janusz", new User("janusz", "49194de393288e58756d8200c5c7b4e7", Constants.USER_ROLE));
    }

    public User findUser(String login) {
        return this.users.get(login);
    }

    public static UserRepository getInstance() {
        return instance;
    }
}
