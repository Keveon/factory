package com.keveon.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * The type Application tests.
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
class FactoryManagerApplicationTests {

    @Value("${random.int(5)}")
    private int num;

    /**
     * Context loads.
     */
    @RepeatedTest(5)
    void contextLoads() {
        Assertions.assertTrue(() -> num >= 0 && num <= 5);
    }
}
