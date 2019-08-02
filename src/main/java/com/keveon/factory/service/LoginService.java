package com.keveon.factory.service;

import com.keveon.factory.model.bo.Login;

/**
 * Created by Keveon on 2017/3/10.
 * Login service
 */
public interface LoginService {
    /**
     * Find by username login.
     *
     * @param username the username
     * @return the login
     */
    Login findByUsername(String username);
}
