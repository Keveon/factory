package com.keveon.service.impl;

import com.keveon.model.Contact;
import com.keveon.repository.ContactRepository;
import com.keveon.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * Created by Keveon on 2017/3/24.
 * Contact service implement
 */
@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository repository;

    @Override
    public Contact save(Contact contact) {
        System.err.println("ContactServiceImpl.save");
        Contact temp = findOne();
        BeanUtils.copyProperties(contact, temp);
        return repository.save(temp);
    }

    @Override
    public Contact findOne() {
        System.err.println("ContactServiceImpl.findOne");
        return repository.findOne(1);
    }
}
