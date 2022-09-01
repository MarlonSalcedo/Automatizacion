package co.com.choucair.certification.proyectobase.useInterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_FIRST = Target.the("agregar al carro de compras").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static final Target BUTTON_SECOND = Target.the("agregar al carro de compras").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
    public static final Target BUTTON_THRID = Target.the("agregar al carro de compras").located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));
    public static final Target BUTTON_CARRITO = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    public static final Target BUTTON_REMOVE_FIRST = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
    public static final Target BUTTON_REMOVE_SECOND = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]"));
    public static final Target BUTTON_REMOVE_THRID = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]"));
    public static final Target BUTTON_CONUE = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"checkout\"]"));
    public static final Target INPUT_NAME = Target.the("WHERE DO WE WRITE THE USER").located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME= Target.the("WHERE DO WE WRITE THE USER").located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE = Target.the("WHERE DO WE WRITE THE USER").located(By.id("postal-code"));
    public static final Target BUTTON_CONUE_IMPORT = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"continue\"]"));
    public static final Target BUTTON_FINISH = Target.the("clic al carro de compras").located(By.xpath("//*[@id=\"finish\"]"));

    //public static final Target INPUT_COURSE = Target.the("buscar curso").located(By.id("coursesearchbox"));
    //public static final Target BUTTON_GO = Target.the("DA CLICK PARA BUSCAR EL CURSO").located(By.id("//button[@class, 'btn btn-secondary']"));
    //public static final Target SELECT_COURSE = Target.the("DA CLICK PARA BUSCAR EL CURSO").located(By.xpath("//h4[contains(text(), 'Recurso Automatizaciòn Bancombia')]"));
    public static final Target NAME_PAGO = Target.the("Extraer el PAGO").located(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]")) ;
}
