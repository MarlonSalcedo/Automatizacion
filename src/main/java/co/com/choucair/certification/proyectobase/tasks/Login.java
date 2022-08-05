package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.proyectobase.useInterface.ChoucairLoginPage.*;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(Click.on(LOGIN_BUTTON ),
                 Enter.theValue("Marlon").into(INPUT_NAME),
                 Enter.theValue("Salcedo").into(INPUT_LAST_NAME),
                 Enter.theValue("marlonsalcedo1004@gmail.com").into(INPUT_EMAIL),
                 SelectFromOptions.byVisibleText("July").from(INPUT_MES),
                 SelectFromOptions.byVisibleText("28").from(INPUT_DIA),
                 SelectFromOptions.byVisibleText("1996").from(INPUT_ANO),
                 Click.on(ENTER_BUTTON),

                 Enter.theValue("Ocana").into(INPUT_CIUDAD),
                 Hit.the(Keys.ARROW_DOWN).into(INPUT_CIUDAD),
                 Enter.theValue("546552").into(INPUT_POSTAL),
                 Hit.the(Keys.ARROW_DOWN).into(INPUT_POSTAL),
                 Click.on(INPUT_CONTENEDOR),
                 Enter.theValue("Colombia").into(INPUT_PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                 Click.on(ENTER_BUTTON_DIRECCION),

                //* Enter.theValue("Windows").into(INPUT_WINDOWS),
                 //* Hit.the(Keys.ARROW_DOWN).into(INPUT_WINDOWS),
                 //* Enter.theValue("10").into(INPUT_VERSION),
                 //* Hit.the(Keys.ARROW_DOWN).into(INPUT_VERSION),
                 //* Enter.theValue("Spanish").into(INPUT_LENGUAJE),
                 //* Hit.the(Keys.ARROW_DOWN).into(INPUT_LENGUAJE),
                 Click.on(INPUT_CONTENEDOR_DEVICE),
                 Enter.theValue("Motorola").into(INPUT_YOUR_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                 Click.on(INPUT_CONTENEDOR_MODEL),
                 Enter.theValue("Moto G6 plus").into(INPUT_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                 Click.on(INPUT_CONTENEDOR_SYSTEMA),
                 Enter.theValue("Android 10").into(INPUT_OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                 Click.on(ENTER_BUTTON_DEVICES),

                 Enter.theValue("Marlon123*").into(INPUT_PASSWORK),
                 Enter.theValue("Marlon123*").into(INPUT_CONFIRM_PASSWOR),
                 Click.on(ACCEPT_UNO),
                         Click.on(ACCEPT_DOS),
                         Click.on(ACCEPT_TRES),
                                 Click.on(ENTER_BUTTON_COMPLETE));
    }
}
