package pages;

import com.codeborne.selenide.SelenideElement;
import Сomponents.Calendar;
import Сomponents.CheckForm;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
//components
    public Calendar Calendar = new Calendar();
    private CheckForm checkForm = new CheckForm();


    // locators
    private SelenideElement
            headerTitle = $(".main-header"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            mobileInput = $("#userNumber"),
            BirthDate = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#react-select-3-input"),
            cityInput = $("#react-select-4-input"),
            submitInput = $("#submit");



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

       public RegistrationPage setEmail(String email) {
           emailInput.setValue(email);


           return this;
       }

       public RegistrationPage setGender(String gender) {
           $("#genterWrapper").$(byText("Male")).click();


           return this;
       }

       public RegistrationPage setMobile(String mobile) {
           mobileInput.setValue(mobile);


           return this;
       }

       public RegistrationPage setSubjects(String subjects) {
           subjectsInput.setValue(subjects)
                   .pressEnter();


           return this;
       }


       public RegistrationPage setBirthDate(String day, String month, String year) {
           Calendar.setDate(day, month, year);

           return this;
       }

       public RegistrationPage setHobbies(String hobbies) {
           $("#hobbiesWrapper").$(byText("Reading")).click();


        return this;
       }

       public RegistrationPage setPicture(String picture) {
           $("#uploadPicture").uploadFromClasspath("1.jpg");


        return this;
       }

       public RegistrationPage setAddress(String address) {
           addressInput.setValue(address);


        return this;
       }

        public RegistrationPage setState(String state) {
            $("#stateCity-label").scrollTo();
            stateInput.setValue(state)
                .pressEnter();


        return this;
       }
        public RegistrationPage setCity(String city) {
            cityInput.setValue(city)
                .pressEnter();


        return this;
       }

    public RegistrationPage setSubmit(String submit) {
        $("#submit").scrollTo();
        $("#submit").click();


        return this;
    }

    public RegistrationPage checkCheckForm(String label, String value) {
        checkForm
                .checkTableRow(label, value);

        return this;
    }



}