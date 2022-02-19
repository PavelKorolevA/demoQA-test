package Homework;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class StudentRegistrationForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void successFillTest() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text("Practice Form"));

        $("#firstName").setValue("Pavel");
        $("#lastName").setValue("Korolev");
        $("#userEmail").setValue("pavelkorolev@corp.com");

        $("#genterWrapper").$(byText("Male")).click();

        $("#userNumber").setValue("+74587963581");

        $("#dateOfBirthInput").setValue("19 Nov 1996");

        $("#subjectsContainer").setValue("Biology, Chemistry");

        $("#").setValue("");
        $("#").setValue("");

        $("#").click();
    }
}
