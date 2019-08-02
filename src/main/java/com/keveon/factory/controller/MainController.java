package com.keveon.factory.controller;

import com.keveon.factory.service.ContactService;
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

    /**
     * Index string.
     *
     * @param session the session
     * @return the string
     */
    @GetMapping({"/", "index.html"})
    public String index(HttpSession session) {
        session.setAttribute("contact", contactService.findOne());
        return "index";
    }

    /**
     * Products string.
     *
     * @return the string
     */
    @GetMapping("products.html")
    public String products() {
        return "products";
    }

    /**
     * Contact string.
     *
     * @return the string
     */
    @GetMapping("contact.html")
    public String contact() {
        return "contact";
    }

    /**
     * About string.
     *
     * @return the string
     */
    @GetMapping("about.html")
    public String about() {
        return "about";
    }

    /**
     * Single string.
     *
     * @return the string
     */
    @GetMapping("single.html")
    public String single() {
        return "single";
    }

    /**
     * Error string.
     *
     * @return the string
     */
    @GetMapping("events.html")
    public String error() {
        return "404";
    }
}
