package com.keveon;

import com.keveon.model.Contact;
import com.keveon.model.Point;
import com.keveon.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.math.BigDecimal;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Autowired
    private ContactService contactService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //    @PostConstruct
    public void init() {
        Contact contact = new Contact(
                null,
                "phone",
                "example@mail.com",
                "qq",
                "qq url",
                "WeChat",
                "country",
                "",
                "city",
                "community",
                "street",
                new Point(
                        new BigDecimal("56.123"),
                        new BigDecimal("60.89")
                ));
        contactService.save(contact);
    }
}