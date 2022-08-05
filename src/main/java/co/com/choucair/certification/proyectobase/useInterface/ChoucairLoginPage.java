package co.com.choucair.certification.proyectobase.useInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NAME = Target.the("button that shows us the form to login").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("button that shows us the form to login").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("button that shows us the form to login").located(By.id("email"));
    public static final Target ENTER_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//a[@aria-label='Next step - define your location']"));
    public static final Target INPUT_MES = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));
    public static final Target INPUT_DIA = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target INPUT_ANO = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target INPUT_CIUDAD = Target.the("button that shows us the form to login").located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("button that shows us the form to login").located(By.id("zip"));
    public static final Target INPUT_CONTENEDOR = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target INPUT_PAIS = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target ENTER_BUTTON_DIRECCION = Target.the("button that shows us the form to login").located(By.xpath("//div[@class='pull-right next-step']"));
    //*public static final Target INPUT_WINDOWS = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    //*public static final Target INPUT_VERSION = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    //* public static final Target INPUT_LENGUAJE = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_CONTENEDOR_DEVICE = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_YOUR_MOBILE_DEVICE = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_CONTENEDOR_MODEL = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_CONTENEDOR_SYSTEMA = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_OPERATING_SYSTEM = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static final Target ENTER_BUTTON_DEVICES = Target.the("button that shows us the form to login").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_PASSWORK = Target.the("button that shows us the form to login").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWOR = Target.the("button that shows us the form to login").located(By.id("confirmPassword"));
    public static final Target ACCEPT_UNO = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACCEPT_DOS = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_TRES = Target.the("button that shows us the form to login").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target ENTER_BUTTON_COMPLETE = Target.the("button that shows us the form to login").located(By.xpath("//a[@class='btn btn-blue']"));

}
