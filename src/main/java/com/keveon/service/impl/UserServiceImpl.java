package com.keveon.service.impl;

import com.keveon.model.User;
import com.keveon.repository.UserRepository;
import com.keveon.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Keveon on 2017/3/15.
 * .
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
