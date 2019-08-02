package com.keveon.factory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Keveon on 2017/3/22.
 * Admin layer jump controller
 */
@Controller
//@PreAuthorize("authenticated and hasPermission('hello', 'admin')")
public class AdminController {
    /**
     * Admin string.
     *
     * @return the string
     */
    @GetMapping({"admin", "admin.html"})
    public String admin() {
        return "admin";
    }

    /**
     * Search string.
     *
     * @return the string
     */
    @GetMapping("search.html")
    public String search() {
        return "search";
    }

    /**
     * Profile string.
     *
     * @return the string
     */
    @GetMapping("profile.html")
    public String profile() {
        return "profile";
    }

    /**
     * Mailbox main string.
     *
     * @return the string
     */
    @GetMapping("mailbox-main.html")
    public String mailboxMain() {
        return "mailbox-main";
    }

    /**
     * Mailbox message string.
     *
     * @return the string
     */
    @GetMapping("mailbox-message.html")
    public String mailboxMessage() {
        return "mailbox-message";
    }

    /**
     * Mailbox compose string.
     *
     * @return the string
     */
    @GetMapping("mailbox-compose.html")
    public String mailboxCompose() {
        return "mailbox-compose";
    }
}
