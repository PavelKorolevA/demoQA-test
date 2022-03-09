package pages;

import com.codeborne.selenide.SelenideElement;
import components.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class RegistrationPageFinished {
    //components
    public Calendar calendar = new Calendar();

    // locators
    private SelenideElement
            headerTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            gender = $("#gender-radio-1"),
            mobileInput = $("#userNumber"),

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

    public RegistrationPageFinished selectGender(String value) {
        $(byText(value)).click();
        //$(String.format("input[value = %s]", value)).sibling(0).click();
        return this;
    }

    public RegistrationPageFinished setMobile(String mobile) {
        mobileInput.setValue(mobile);
        return this;
    }

    public RegistrationPageFinished setDate(String day, String month, String year) {
        new Calendar().setDate(day, month, year);
        return this;
    }

    public RegistrationPageFinished setSubjects(String subjects) {
        subjectsInput.setValue(subjects)
                .pressEnter();
        return this;
    }

    public RegistrationPageFinished setHobby(String hobby) {
        $("#hobbiesWrapper").$(byText(hobby)).click();
        return this;
    }

    public RegistrationPageFinished setPicture(String picture) {
        $("#uploadPicture").uploadFromClasspath(picture);
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

    public RegistrationPageFinished clickSubmit() {
        $("#react-select-3-input").pressEnter();
        //  $("#submit").click();
        return this;
    }

    public RegistrationPageFinished checkForm(String label, String value) {
        $(".table-responsive")
                .$(byText(label))
                .parent()
                .shouldHave(text(value));
        return this;
    }

}
