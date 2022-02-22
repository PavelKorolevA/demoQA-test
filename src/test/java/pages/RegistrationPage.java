package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    // locators
    private SelenideElement
            headerTitle = $(".main-header"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail");



    // actions
       public RegistrationPage openPage() {
           open("/automation-practice-form");
           headerTitle.shouldHave(text("Practice Form"));

           return this;
    }

       public RegistrationPage setFirstName(String firstName) {
           firstNameInput.setValue(firstName);

           return this;
       }
       public RegistrationPage setLastName(String lastName) {
           lastNameInput.setValue(lastName);

           return this;
       }

       public RegistrationPage setuserEmail(String userEmail) {
           lastNameInput.setValue(userEmail);

           return this;
    }
}
