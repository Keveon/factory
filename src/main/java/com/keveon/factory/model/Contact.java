package com.keveon.factory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Keveon on 2017/3/24.
 * Contact Info
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
    private static final long serialVersionUID = -8497481211826592593L;

    /**
     * The Id.
     */
    @Id
    @GeneratedValue
    Integer id;

    /**
     * 联系电话
     */
    @Column(length = 14)
    String phone;

    /**
     * 邮箱
     */
    @Column(length = 50)
    String email;

    /**
     * QQ号
     */
    @Column(length = 11)
    String qq;

    /**
     * QQ在线链接
     */
    String qqUrl;

    /**
     * 微信号
     */
    @Column(length = 50)
    String wechat;

    /**
     * 国家
     */
    @Column(length = 100)
    String country;

    /**
     * 省
     */
    @Column(length = 100)
    String province;

    /**
     * 市
     */
    @Column(length = 100)
    String city;

    /**
     * 社区
     */
    @Column(length = 100)
    String community;

    /**
     * 街道
     */
    String street;

    /**
     * 坐标点
     */
    @Embedded
    Point point;
}