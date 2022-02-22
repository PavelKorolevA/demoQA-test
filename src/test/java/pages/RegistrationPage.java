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
           userEmailInput.setValue(userEmail);


           return this;
    }
       public RegistrationPage setBirthDate(String day, String month, String year) {
               $("#dateOfBirthInput").click();
               $(".react-datepicker__month-select").selectOption("November");
               $(".react-datepicker__year-select").selectOption("1996");
               $("[aria-label$='November 19th, 1996']").click();

           return this;
    }
}
