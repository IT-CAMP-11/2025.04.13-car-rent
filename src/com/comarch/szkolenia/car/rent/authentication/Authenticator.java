package com.comarch.szkolenia.car.rent.authentication;

import com.comarch.szkolenia.car.rent.database.UserRepository;
import com.comarch.szkolenia.car.rent.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class Authenticator {
    private final UserRepository userRepository = UserRepository.getInstance();
    private final String seed = "{B0;g;2PS)d.i!$}x)_v2;%RRxZGru2k-^n!QneR+!4jLpG0Fi";
    public static String currentUserRole;
    private final static Authenticator instance = new Authenticator();

    private Authenticator() {
    }

    public boolean authenticate(String login, String password) {
        User user = this.userRepository.findUser(login);

        if(user != null && user.getPassword().equals(DigestUtils.md5Hex(password+seed))) {
            currentUserRole = user.getRole();
            return true;
        }

        return false;
    }

    public static Authenticator getInstance() {
        return instance;
    }
}
