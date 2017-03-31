package com.keveon.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/2/19.
 * User bean
 */
@Entity
@Data
@RequiredArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 4027515435011174332L;

    @Id
    @GeneratedValue
    Integer id;

    /**
     * 用户名
     */
    @Column(nullable = false, length = 50)
    String username;

    /**
     * 密码
     */
    @Column(nullable = false, length = 60)
    String password;

    /**
     * 是否启用
     */
    @Column(nullable = false)
    Boolean enabled;
}
