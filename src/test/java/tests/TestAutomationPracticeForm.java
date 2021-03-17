package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestAutomationPracticeForm {
    @BeforeAll
    static void setup() {
        System.out.println("setup");
        Configuration.startMaximized = true;
    }

    @Test
    void someTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Иванов");
        $("#lastName").setValue("Иван");
        $("#userEmail").setValue("test@test.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("79999999999");
        $("#dateOfBirthInput").setValue("01 Apr 1990");
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#subjectsInput").setValue("ph").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("test.jpg");
        $("#currentAddress").setValue("Неизвестен");
        $("#react-select-3-input").setValue("raj").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();
        $("#submit").click();
    }

}
