package co.com.choucair.certification.proyectobase.useInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("WHERE DO WE WRITE THE USER").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("WHERE DO WE WRITE THE PASSWORD").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("BOTTON TO CONFIRM LOGIN").located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));


}
