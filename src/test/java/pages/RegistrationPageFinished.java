package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPageFinished {
    //components


    // locators
    private SelenideElement
            headerTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#gender-radio-1"),
            mobileInput = $("#userNumber"),
            // дата
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input");




    //actions
    public RegistrationPageFinished openPage() {
        open("/automation-practice-form");
        headerTitle.shouldHave(text("Student Registration Form"));

        return this;
    };

    public RegistrationPageFinished setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPageFinished setLastName(String lastName) {
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegistrationPageFinished setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationPageFinished setGender(String gender) {
        $("#genterWrapper").$(byText("Male")).click();

        return this;
    }

    public RegistrationPageFinished setMobile(String mobile) {
        mobileInput.setValue(mobile);


        return this;
    }




    // Date









    public RegistrationPageFinished setSubjects(String subjects) {
        subjectsInput.setValue(subjects)
                .pressEnter();


        return this;
    }

    public RegistrationPageFinished setHobbies(String hobbies) {
        $("#hobbiesWrapper").$(byText("Reading")).click();


        return this;
    }

    public RegistrationPageFinished setPicture(String picture) {
        $("#uploadPicture").uploadFromClasspath("1.jpg");


        return this;
    }

    public RegistrationPageFinished setAddress(String address) {
        addressInput.setValue(address);


        return this;
    }

    public RegistrationPageFinished setState(String state) {
        stateInput.setValue(state)
                .pressEnter();


        return this;
    }
    public RegistrationPageFinished setCity(String city) {
        cityInput.setValue(city)
                .pressEnter();


        return this;
    }



}
