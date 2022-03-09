package components;


import static com.codeborne.selenide.Selenide.$;

public class Calendar {

    public void setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $("#hobbies-checkbox-1").scrollTo();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
    }

}

