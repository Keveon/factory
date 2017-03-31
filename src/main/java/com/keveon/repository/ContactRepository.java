package com.keveon.repository;

import com.keveon.model.Contact;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Keveon on 2017/3/24.
 * Contact repository
 */
public interface ContactRepository extends CrudRepository<Contact, Integer> {
}