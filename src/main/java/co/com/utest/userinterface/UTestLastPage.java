package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestLastPage extends PageObject {

    public static final Target INPUT_PASSWORD = Target.the("Ingresar la Contrasena").located(By.id("password"));

    public static final Target INPUT_CONFIRMEDPASSWORD = Target.the("Ingresar nuevamente la Contrasena").located(By.id("confirmPassword"));

    public static final Target INPUT_INFORMATION = Target.the("Seleccionar Informacion").located(By.name("newsletterOptIn"));

    public static final Target INPUT_TERM = Target.the("Seleccionar Terminos").located(By.id("termOfUse"));

    public static final Target INPUT_PRIVACY = Target.the("Seleccionar Politica").located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE = Target.the("Da click para Completar Creacion").located(By.xpath("//*[@id=\"laddaBtn\"]"));

}
