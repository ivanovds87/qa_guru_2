package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestAutomationPracticeForm {
    String firstName = "Иванов";
    String lastName = "Иван";
    String userEmail = "test@test.test";
    String gender = "Male";
    String mobile = "7999999999";
//    String birthDate = "01 Apr 1990";
    String bDate = "01";
    String bMonth = "April";
    String bYear = "1990";
    String subject1 = "Maths";
    String subject2 = "Physics";
    String hobbies1 = "Sports";
    String hobbies2 = "Reading";
    String hobbies3 = "Music";
    String pictures = "test.jpg";
    String currentAddress = "Неизвестен";
    String state = "Rajasthan";
    String city = "Jaipur";

    @BeforeAll
    static void setup() {
        System.out.println("setup");
        Configuration.startMaximized = true;

    }

    @Test
    void someTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $(byText(gender)).click();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(bMonth);
        $(".react-datepicker__year-select").selectOptionByValue(bYear);
        $(".react-datepicker__day.react-datepicker__day--0" + bDate).click();
        $("#userNumber").setValue(mobile);
        $("#subjectsInput").setValue(subject1).pressEnter();
        $("#subjectsInput").setValue(subject2).pressEnter();
        $(byText(hobbies1)).click();
        $(byText(hobbies2)).click();
        $(byText(hobbies3)).click();
        $("#uploadPicture").uploadFromClasspath(pictures);
        $("#currentAddress").setValue(currentAddress);
        $("#react-select-3-input").setValue(state).pressEnter();
        $("#react-select-4-input").setValue(city).pressEnter();
        $("#submit").click();
        $x("//tbody/tr[1]/td[2]").shouldHave(text(firstName + " " + lastName));
        $x("//tbody/tr[2]/td[2]").shouldHave(text(userEmail));
        $x("//tbody/tr[3]/td[2]").shouldHave(text(gender));
        $x("//tbody/tr[4]/td[2]").shouldHave(text(mobile));
        $x("//tbody/tr[5]/td[2]").shouldHave(text(bDate + " " + bMonth + "," + bYear));
        $x("//tbody/tr[6]/td[2]").shouldHave(text(subject1 + ", " + subject2));
        $x("//tbody/tr[7]/td[2]").shouldHave(text(hobbies1 + ", " + hobbies2 + ", " + hobbies3));
        $x("//tbody/tr[8]/td[2]").shouldHave(text(pictures));
        $x("//tbody/tr[9]/td[2]").shouldHave(text(currentAddress));
        $x("//tbody/tr[10]/td[2]").shouldHave(text(state + " " + city));


        System.out.println("debug");
    }

}
