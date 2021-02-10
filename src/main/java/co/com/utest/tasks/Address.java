package co.com.utest.tasks;

import co.com.utest.userinterface.UTestAddressPage;
import co.com.utest.userinterface.UTestJoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Address implements Task {


    public static Address onThePage() {
        return Tasks.instrumented(Address.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /* Se diligencia de forma Automatica */

        actor.attemptsTo(Click.on(UTestAddressPage.BUTTON_DEVICES)
        );
    }

}
