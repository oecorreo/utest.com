package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestJoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to Join Today").located(By.xpath("//*[contains(text(),'Join')]"));
}
