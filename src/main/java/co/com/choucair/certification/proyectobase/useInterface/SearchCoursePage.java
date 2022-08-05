package co.com.choucair.certification.proyectobase.useInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("buscar curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("DA CLICK PARA BUSCAR EL CURSO").located(By.id("//button[@class, 'btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("DA CLICK PARA BUSCAR EL CURSO").located(By.xpath("//h4[contains(text(), 'Recurso Automatizaciòn Bancombia')]"));
    public static final Target NAME_COURSE = Target.the("Extraer el nombre del curso").located(By.xpath("//h1[contains(text(), '!')]")) ;
}
