package com.keveon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.RequireJS;

/**
 * Created by Keveon on 2017/3/19.
 * Web jars controller
 */
@RestController
public class WebJarController {

    @RequestMapping(value = "/webjarsjs", produces = "application/javascript")
    public String webjarjs() {
        return RequireJS.getSetupJavaScript("/webjars/");
    }
}
