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
            mobileInput = $("#userNumber");






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

}
