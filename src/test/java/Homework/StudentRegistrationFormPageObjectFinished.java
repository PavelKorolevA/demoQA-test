package Homework;

import Testbase.TestBase;
import org.junit.jupiter.api.Test;
import pages.RegistrationPageFinished;
import Сomponents.Calendar;


import static com.codeborne.selenide.Condition.textCaseSensitive;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class StudentRegistrationFormPageObjectFinished extends TestBase {

    RegistrationPageFinished registrationPageFinished = new RegistrationPageFinished();

    private String
            firstName = "Pavel",
            lastName = "Korolev",
            email = "pavelkorolev@corp.com",
            gender = "genterWrapper",
            mobile = "1234567894",
    // дата
            subjects = "Biology",
            hobbies = "hobbiesWrapper",
            address = "Samara",
            state = "Haryana",
            city = "Panipat";

    @Test
    void successFillTest() {
       registrationPageFinished
               .openPage()
               .setFirstName(firstName)
               .setLastName(lastName)
               .setEmail(email)
               .setGender(gender)
               .setMobile(mobile)
               //дата
               .setSubjects(subjects)
               .setHobbies(hobbies)
               .setAddress(address)
               .setState(state)
               .setCity(city);



        $("#react-select-3-input").pressEnter(); //как это записать?
      //  $("#submit").click();



        $("#example-modal-sizes-title-lg").shouldHave((textCaseSensitive("Thanks for submitting the form")));
        $(".table-responsive").shouldHave(
                textCaseSensitive("Student Name"),    textCaseSensitive("Pavel Korolev"),
                textCaseSensitive("Student Email"),   textCaseSensitive("pavelkorolev@corp.com"),
                textCaseSensitive("Gender"),          textCaseSensitive("Male"),
                textCaseSensitive("Mobile"),          textCaseSensitive("1234567894"),
                textCaseSensitive("Date of Birth"),   textCaseSensitive("19 November,1996"),
                textCaseSensitive("Subjects"),        textCaseSensitive("Biology"),
                textCaseSensitive("Hobbies"),         textCaseSensitive("Sports"),
                textCaseSensitive("Picture"),         textCaseSensitive("1.jpg"),
                textCaseSensitive("Address"),         textCaseSensitive("Samara"),
                textCaseSensitive("State and City"),  textCaseSensitive("Haryana Panipat")
        );

        $("#closeLargeModal").parent().click();



    }
}