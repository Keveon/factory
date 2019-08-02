package com.keveon.factory;

import com.keveon.factory.model.Contact;
import com.keveon.factory.model.Point;
import com.keveon.factory.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * The type Application.
 */
@Slf4j
@SpringBootApplication
public class FactoryManagerApplication {

    @Autowired
    private ContactRepository repository;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(FactoryManagerApplication.class, args);
    }

    @Bean
    @ConditionalOnProperty(name = "debug", havingValue = "true")
    CommandLineRunner initializeTestData() {
        return (String[] args) -> {
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
            repository.save(contact);
        };
    }
}