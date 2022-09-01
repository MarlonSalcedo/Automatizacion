package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.proyectobase.useInterface.ChoucairLoginPage.*;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Enter.theValue("standard_user").into(INPUT_USER),
                 Enter.theValue("secret_sauce").into(INPUT_PASSWORD),
                 Click.on(ENTER_BUTTON));

    }
}
