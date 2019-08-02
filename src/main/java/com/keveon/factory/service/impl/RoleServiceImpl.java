package com.keveon.factory.service.impl;

import com.keveon.factory.model.Roles;
import com.keveon.factory.repository.RolesRepository;
import com.keveon.factory.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Keveon on 2017/3/10.
 * Role service impl
 */
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RolesRepository rolesRepository;

    @Override
    public Boolean authorized(String username, String serializable, String permission) {
        Set<Roles> rolesSet = getRoles(username);
        boolean hasPermission = false;
        for (Roles roles : rolesSet) {
            if (roles.getRole().equals("ROLE_" + permission.toUpperCase())) {
                hasPermission = true;
                break;
            }
        }
        return hasPermission;
    }

    @Override
    public Set<Roles> getRoles(String username) {
        return rolesRepository.findByUserUsername(username);
    }
}
