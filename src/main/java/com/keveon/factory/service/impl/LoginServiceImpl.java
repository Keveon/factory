package com.keveon.factory.service.impl;

import com.keveon.factory.model.bo.Login;
import com.keveon.factory.service.LoginService;
import com.keveon.factory.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Keveon on 2017/3/10.
 * Login service implement
 */
@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {
    private final UserService userService;

    @Override
    public Login findByUsername(String username) {
        return new Login(userService.findByUsername(username));
    }
}
