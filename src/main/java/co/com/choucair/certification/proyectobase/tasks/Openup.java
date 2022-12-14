package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.useInterface.ChoucairAcademypage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Openup implements Task {
    private ChoucairAcademypage choucairAcademypage;

    public static Openup thePage() {
        return Tasks.instrumented(Openup.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademypage));

    }

}
