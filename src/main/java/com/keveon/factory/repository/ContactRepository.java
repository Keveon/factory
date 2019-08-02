package com.keveon.factory.repository;

import com.keveon.factory.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Keveon on 2017/3/24.
 * Contact repository
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}