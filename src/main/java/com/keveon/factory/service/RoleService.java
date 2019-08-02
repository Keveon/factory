package com.keveon.factory.service;

import com.keveon.factory.model.Roles;

import java.util.Set;

/**
 * Created by Keveon on 2017/3/10.
 * Role service
 */
public interface RoleService {
    /**
     * Authorized boolean.
     *
     * @param username     the username
     * @param serializable the serializable
     * @param permission   the permission
     * @return the boolean
     */
    Boolean authorized(String username, String serializable, String permission);

    /**
     * Gets roles.
     *
     * @param username the username
     * @return the roles
     */
    Set<Roles> getRoles(String username);
}
