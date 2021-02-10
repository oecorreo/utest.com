package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestDevicesPage extends PageObject {

    public static final Target INPUT_COMPUTER = Target.the("Ingresar el Computador").located(By.id("firstName"));

    public static final Target INPUT_VERSION = Target.the("Ingresar el Version").located(By.id("lastName"));

    public static final Target INPUT_LANGUAGE = Target.the("Ingresar el Lenguaje").located(By.id("email"));

    public static final Target INPUT_MOBILE = Target.the("Ingresar el Movil").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target INPUT_MODEL = Target.the("Ingresar el Modelo del Movil").located(By.id("birthDay"));

    public static final Target INPUT_OS = Target.the("Ingresar Sistema Operativo").located(By.id("birthYear"));

    public static final Target BUTTON_LAST = Target.the("Da click para continuar a Locacion").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
