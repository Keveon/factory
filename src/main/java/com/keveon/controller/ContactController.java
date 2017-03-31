package com.keveon.controller;

import com.keveon.model.Contact;
import com.keveon.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Keveon on 2017/3/24.
 * .
 */
@Slf4j
@RestController
@RequestMapping("contact-info.html")
@RequiredArgsConstructor
//@PreAuthorize("authenticated and hasPermission('hello', 'admin')")
public class ContactController {
    private final ContactService service;

    @GetMapping
    public ModelAndView contact(HttpSession session) {
        session.setAttribute("contact", service.findOne());
        return new ModelAndView("contact-info");
    }

    @PatchMapping
    public ResponseEntity<String> updateContact(@ModelAttribute Contact contact) {
        service.save(contact);
        return new ResponseEntity<>("修改成功!", HttpStatus.ACCEPTED);
    }
}
