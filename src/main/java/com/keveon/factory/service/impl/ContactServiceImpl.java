package com.keveon.factory.service.impl;

import com.keveon.factory.model.Contact;
import com.keveon.factory.repository.ContactRepository;
import com.keveon.factory.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Keveon on 2017/3/24.
 * Contact service implement
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository repository;

    @Override
    public Contact save(Contact contact) {
        log.debug("ContactServiceImpl.save");
        Contact temp = findOne();
        BeanUtils.copyProperties(contact, temp);
        return repository.save(temp);
    }

    @Override
    public Contact findOne() {
        log.debug("ContactServiceImpl.findOne");
        return repository.getOne(1);
    }
}
