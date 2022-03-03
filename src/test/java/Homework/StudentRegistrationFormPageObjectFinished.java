package Homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class StudentRegistrationFormPageObjectFinished {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }



    @Test
    void successFillTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Pavel");
        $("#lastName").setValue("Korolev");
        $("#userEmail").setValue("pavelkorolev@corp.com");

        $("#gender-radio-1").parent().click();

        $("#userNumber").setValue("1234567894");

        $("#dateOfBirthInput").click();

        $("#hobbies-checkbox-1").scrollTo();

        $(".react-datepicker__month-select").selectOptionByValue("10");
        $(".react-datepicker__year-select").selectOptionByValue("1996");
        $(".react-datepicker__day--019").click();

        $("#subjectsInput").setValue("Biology").pressEnter();

        $("#hobbies-checkbox-1").parent().click();

        $("#uploadPicture").uploadFromClasspath("1.jpg");

       $("#currentAddress").setValue("Samara");

        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Panipat").pressEnter();

        $("#react-select-3-input").click();
        $("#submit").click();





    }
}