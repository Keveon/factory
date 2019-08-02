package com.keveon.factory.service;

import com.keveon.factory.model.User;

/**
 * Created by Keveon on 2017/3/15.
 * .
 */
public interface UserService {
    /**
     * Find by username user.
     *
     * @param username the username
     * @return the user
     */
    User findByUsername(String username);
}
