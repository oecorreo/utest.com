package co.com.utest.tasks;

import co.com.utest.userinterface.UTestLastPage;
import co.com.utest.userinterface.UTestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Last implements Task {

    private String password;
    private String confirmPassword;
    private int informed;
    private int terms;
    private int privacy;

    public Last(String password, String confirmPassword, int informed, int terms, int privacy) {
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.informed = informed;
        this.terms = terms;
        this.privacy = privacy;
    }

    public static Last onThePage(String password, String confirmPassword, int informed, int terms, int privacy) {
        return Tasks.instrumented(Last.class,password,confirmPassword,informed, terms, privacy);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(password).into(UTestLastPage.INPUT_PASSWORD),
                Enter.theValue(confirmPassword).into(UTestLastPage.INPUT_CONFIRMEDPASSWORD),
                Click.on(UTestLastPage.INPUT_INFORMATION),
                Click.on(UTestLastPage.INPUT_TERM),
                Click.on(UTestLastPage.INPUT_PRIVACY),
                Click.on(UTestLastPage.BUTTON_COMPLETE)
                );
    }
}
