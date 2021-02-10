package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class UTestPersonalPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("Ingresar el Nombre").located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Ingresar el Apellido").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Ingresar el Correo").located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("Ingresar Mes").located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("Ingresar Mes").located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("Ingresar Mes").located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE = Target.the("Ingresar Lenguaje").located(By.id("languages"));

    public static final Target BUTTON_LOCATION = Target.the("Da click para continuar a Locacion").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
