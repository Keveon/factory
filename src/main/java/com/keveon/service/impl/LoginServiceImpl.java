package com.keveon.service.impl;

import com.keveon.model.bo.Login;
import com.keveon.service.LoginService;
import com.keveon.service.UserService;
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
