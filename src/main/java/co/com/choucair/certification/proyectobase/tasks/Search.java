package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certification.proyectobase.useInterface.SearchCoursePage.*;

public class Search implements Task {
    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course){
        return Tasks.instrumented(Search.class,course);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_FIRST ),
                Click.on(BUTTON_SECOND),
                Click.on(BUTTON_THRID),
                Click.on(BUTTON_CARRITO),
                Click.on(BUTTON_REMOVE_FIRST),
                Click.on(BUTTON_REMOVE_SECOND),
                Click.on(BUTTON_REMOVE_THRID),
                Click.on(BUTTON_CONUE),

                Enter.theValue("Marlon").into(INPUT_NAME),
                Enter.theValue("Salcedo").into(INPUT_LAST_NAME),
                Enter.theValue("55605").into(INPUT_POSTAL_CODE),
                Click.on(BUTTON_CONUE_IMPORT));
                //Enter.theValue(course).into(INPUT_COURSE),
               // Click.on(BUTTON_GO),
                //Click.on(SELECT_COURSE));

    }
}
