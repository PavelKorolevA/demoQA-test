package homework;

import testbase.TestBase;
import org.junit.jupiter.api.Test;
import pages.RegistrationPageFinished;


import static com.codeborne.selenide.Selenide.$;


public class StudentRegistrationFormPageObjectFinished extends TestBase {

    RegistrationPageFinished registrationPageFinished = new RegistrationPageFinished();

    private String
            firstName = "Pavel",
            lastName = "Korolev",
            email = "pavelkorolev@corp.com",
            gender = "Male",
            mobile = "1234567894",
            day = "19",
            month = "November",
            monthTitle = "November",
            year = "1996",
            subjects = "Biology",
            hobby = "Sports",
            picture = "1.jpg",
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
                .selectGender(gender)
                .setMobile(mobile)
                .setDate(day, month, year)
                .setSubjects(subjects)
                .setHobby(hobby)
                .setPicture(picture)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .clickSubmit();


        registrationPageFinished
                .checkForm("Student Name", firstName + " " + lastName)
                .checkForm("Student Email", email)
                .checkForm("Gender", gender)
                .checkForm("Mobile", mobile)
                .checkForm("Date of Birth", "Date of Birth" + " " +day + " " + monthTitle + "," + year)
                .checkForm("Subjects", subjects)
                .checkForm("Hobbies", hobby)
                .checkForm("Picture", picture)
                .checkForm("Address", address)
                .checkForm("State and City", state + " " + city);


        //$("#example-modal-sizes-title-lg").shouldHave((textCaseSensitive("Thanks for submitting the form")));
        //$(".table-responsive").shouldHave(
        // textCaseSensitive("Student Name"),    textCaseSensitive("Pavel Korolev"),
        //   textCaseSensitive("Student Email"),   textCaseSensitive("pavelkorolev@corp.com"),
        //  textCaseSensitive("Gender"),          textCaseSensitive("Male"),
        // textCaseSensitive("Mobile"),          textCaseSensitive("1234567894"),
        //  textCaseSensitive("Date of Birth"),   textCaseSensitive("19 November,1996"),
        // textCaseSensitive("Subjects"),        textCaseSensitive("Biology"),
        //    textCaseSensitive("Hobbies"),         textCaseSensitive("Sports"),
        //    textCaseSensitive("Picture"),         textCaseSensitive("1.jpg"),
        //    textCaseSensitive("Address"),         textCaseSensitive("Samara"),
        //    textCaseSensitive("State and City"),  textCaseSensitive("Haryana Panipat")
        // );
    }
}