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
    private String
            firstname = "Pavel",
            lastName = "Korolev",
            email = "pavelkorolev@corp.com",
            gender = "genterWrapper",
            mobile = "1234567894",
            day = "19",
            dayCheck = "19",
            month = "November",
            year = "1996",
            subjects = "Biology",
            hobbies = "hobbiesWrapper",
            address = "Samara",
            state = "Haryana",
            city = "Panipat";

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void successFillTest() {
        registrationPage
                .openPage()
                .setFirstName(firstname)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setMobile(mobile)
                .Calendar.setDate(day, month, year);
        registrationPage
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setAddress(address)
                .setState(state)
                .setCity(city)
                .setSubmit("submit");


        //чек
        registrationPage
                .checkCheckForm("Student Name", firstname + " " + lastName)
                .checkCheckForm("Student Email", email)
                .checkCheckForm("Gender", gender)
                .checkCheckForm("Mobile", mobile)
                .checkCheckForm("Date of Birth", dayCheck + " " + month + "," + year)
                .checkCheckForm("Mobile", mobile)
                .checkCheckForm("Subjects", subjects)
                .checkCheckForm("Hobbies", String.join(", ", hobbies))
                .checkCheckForm("Address", address)
                .checkCheckForm("State and City", state + " " + city);
    }

    }
