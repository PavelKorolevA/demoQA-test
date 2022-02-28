package Сomponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Calendar {

    public void setDate(String day, String month, String year) {
        $("#currentAddress-label").scrollTo();
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__year-select").selectOption("1996");
        $("[aria-label$='" + month + " " + day + "th, " + year + "']").click();

    }

}

