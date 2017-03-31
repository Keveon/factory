package com.keveon.controller;

import com.keveon.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Keveon on 2017/3/21.
 * .
 */
@Controller
@RequiredArgsConstructor
public class MainController {
    private final ContactService contactService;

    @GetMapping({"/", "index.html"})
    public String index(HttpSession session) {
        session.setAttribute("contact", contactService.findOne());
        return "index";
    }

    @GetMapping("products.html")
    public String products() {
        return "products";
    }

    @GetMapping("contact.html")
    public String contact() {
        return "contact";
    }

    @GetMapping("about.html")
    public String about() {
        return "about";
    }

    @GetMapping("single.html")
    public String single() {
        return "single";
    }

    @GetMapping("events.html")
    public String error() {
        return "404";
    }
}
