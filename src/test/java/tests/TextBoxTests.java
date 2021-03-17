package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void setup() {
        System.out.println("setup");
        Configuration.startMaximized = true;
    }

   @Test
    void successfulFillTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Alex");
        $("[type=email]").setValue("test@test.test");
        $("[placeholder='Current Address']").setValue("12345");
        $(byId("permanentAddress")).setValue("54321");
        $(".btn.btn-primary").click();
       System.out.println("debug");
    }
}
