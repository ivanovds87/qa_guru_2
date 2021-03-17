package docs;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import java.sql.SQLOutput;

public class Junit5Examples {
    @BeforeAll
    static void setup() {
        System.out.println("setup");
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void each() {
        System.out.println("    each");
    }

    @Test
    void someTest() {
        System.out.println("        someTest");
    }

    @Test
    void anotherTest() {
        System.out.println("        anotherTest");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    each");
    }

    @AfterAll
    static void shutdown() {
        System.out.println("shutdown");
    }
}
