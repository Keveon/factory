package com.keveon.factory.service.impl;

import com.keveon.factory.model.bo.Login;
import com.keveon.factory.service.LoginService;
import com.keveon.factory.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/10.
 * Permission evaluator implements
 */
@Service
@RequiredArgsConstructor
public class PermissionEvaluatorImpl implements PermissionEvaluator {
    private final LoginService loginService;
    private final RoleService roleService;

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        String username = authentication.getName();
        Login login = loginService.findByUsername(username).get();
        return roleService.authorized(login.getUsername(), targetDomainObject.toString(), permission.toString());
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        // not supported
        return false;
    }
}
