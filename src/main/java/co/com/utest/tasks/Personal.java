package co.com.utest.tasks;

import co.com.utest.userinterface.UTestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Personal implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private int day;
    private int year;


    public Personal(String firstName, String lastName, String email, String month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static Personal onThePage(String firstName, String lastName, String email, String month, int day, int year) {
        return Tasks.instrumented(Personal.class,firstName,lastName,email, month, day, year);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(UTestPersonalPage.INPUT_NAME),
                Enter.theValue(lastName).into(UTestPersonalPage.INPUT_LASTNAME),
                Enter.theValue(email).into(UTestPersonalPage.INPUT_EMAIL),

                SelectFromOptions.byVisibleText(month).from(UTestPersonalPage.INPUT_MONTH),
                SelectFromOptions.byIndex(day).from(UTestPersonalPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(Integer.toString(year)).from(UTestPersonalPage.INPUT_YEAR),
                Click.on(UTestPersonalPage.BUTTON_LOCATION)
                );
    }
}
