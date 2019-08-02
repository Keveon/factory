package com.keveon.factory.service;

import com.keveon.factory.model.Contact;

/**
 * Created by Keveon on 2017/3/24.
 * Contact service
 */
public interface ContactService {
    /**
     * 保存联系信息
     *
     * @param contact 联系信息
     * @return the contact
     */
    Contact save(Contact contact);

    /**
     * 获取联系信息
     *
     * @return the contact
     */
    Contact findOne();
}
