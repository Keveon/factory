package com.keveon.service;

import com.keveon.model.User;

/**
 * Created by Keveon on 2017/3/15.
 * .
 */
public interface UserService {
    User findByUsername(String username);
}
