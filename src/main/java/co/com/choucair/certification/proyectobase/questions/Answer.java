package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.useInterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.proyectobase.useInterface.SearchCoursePage.BUTTON_FINISH;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_PAGO).viewedBy(actor).asString();
        if (!nameCourse.isEmpty()){
            result = true;
        }else{
            result = true;
        }
        Click.on(BUTTON_FINISH);
        return true;
    }
}
