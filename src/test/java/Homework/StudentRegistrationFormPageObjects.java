package Homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentRegistrationFormPageObjects {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void successFillTest() {
        registrationPage.openPage()
                .setFirstName("Pavel")
                .setLastName("Korolev")
                .setuserEmail("pavelkorolev@corp.com");

        $("#genterWrapper").$(byText("Male")).click();

        $("#userNumber").setValue("1234567894");

        registrationPage.setBirthDate("30", "November", "1996");

        $("#subjectsInput").setValue("Biology").pressEnter();
        $("#subjectsInput").setValue("Chemistry").pressEnter();

        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("1.jpg");

        $("#currentAddress").setValue("Samara");

        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Panipat").pressEnter();
        $("#submit").click();


        $("#example-modal-sizes-title-lg").shouldHave((textCaseSensitive("Thanks for submitting the form")));
        $(".table-responsive").shouldHave(
                textCaseSensitive("Student Name"),    textCaseSensitive("Pavel Korolev"),
                textCaseSensitive("Student Email"),   textCaseSensitive("pavelkorolev@corp.com"),
                textCaseSensitive("Gender"),          textCaseSensitive("Male"),
                textCaseSensitive("Mobile"),          textCaseSensitive("1234567894"),
                textCaseSensitive("Date of Birth"),   textCaseSensitive("07 November,1996"),
                textCaseSensitive("Subjects"),        textCaseSensitive("Biology, Chemistry"),
                textCaseSensitive("Hobbies"),         textCaseSensitive("Reading"),
                textCaseSensitive("Picture"),         textCaseSensitive("1.jpg"),
                textCaseSensitive("Address"),         textCaseSensitive("Samara"),
                textCaseSensitive("State and City"),  textCaseSensitive("Haryana Panipat")
        );

        $("#closeLargeModal").click();

    }
}
