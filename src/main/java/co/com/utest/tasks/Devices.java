package co.com.utest.tasks;

import co.com.utest.userinterface.UTestDevicesPage;
import co.com.utest.userinterface.UTestPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Devices implements Task {

    private String computer;
    private String version;
    private String language;
    private String mobile;
    private String model;
    private String os;

    public Devices(String computer, String version, String language, String mobile, String model, String os) {
        this.computer = computer;
        this.version = version;
        this.language = language;
        this.mobile = mobile;
        this.model = model;
        this.os = os;
    }

    public static Devices onThePage(String computer, String version, String language, String mobile, String model, String os) {
        return Tasks.instrumented(Devices.class,computer,version,language,mobile,model,os);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(

                /* Se realiza de forma Automatica

                SelectFromOptions.byVisibleText(computer).from(UTestDevicesPage.INPUT_COMPUTER),
                SelectFromOptions.byVisibleText(version).from(UTestDevicesPage.INPUT_VERSION),
                SelectFromOptions.byVisibleText(language).from(UTestDevicesPage.INPUT_LANGUAGE),
                SelectFromOptions.byVisibleText(mobile).from(UTestDevicesPage.INPUT_MOBILE),
                SelectFromOptions.byVisibleText(model).from(UTestDevicesPage.INPUT_MODEL),
                SelectFromOptions.byVisibleText(os).from(UTestDevicesPage.INPUT_OS),*/
                Click.on(UTestDevicesPage.BUTTON_LAST)
                );
    }
}
