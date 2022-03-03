package Сomponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Calendar {

    public void setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $("#hobbies-checkbox-1").scrollTo();
        $(".react-datepicker__month-select").selectOptionByValue("10");
        $(".react-datepicker__year-select").selectOptionByValue("1996");
        $(".react-datepicker__day--019").click();
    }

}

