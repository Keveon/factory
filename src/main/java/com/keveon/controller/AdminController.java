package com.keveon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Keveon on 2017/3/22.
 * Admin layer jump controller
 */
@Controller
//@PreAuthorize("authenticated and hasPermission('hello', 'admin')")
public class AdminController {
    @GetMapping({"admin", "admin.html"})
    public String admin() {
        return "admin";
    }

    @GetMapping("search.html")
    public String search() {
        return "search";
    }

    @GetMapping("profile.html")
    public String profile() {
        return "profile";
    }

    @GetMapping("mailbox-main.html")
    public String mailboxMain() {
        return "mailbox-main";
    }

    @GetMapping("mailbox-message.html")
    public String mailboxMessage() {
        return "mailbox-message";
    }

    @GetMapping("mailbox-compose.html")
    public String mailboxCompose() {
        return "mailbox-compose";
    }
}
