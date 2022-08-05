package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Openup;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefintions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than marlon eants to learn automation at the academy Choucair$")
    public void thanMarlonEantsToLearnAutomationAtTheAcademyChoucair() throws Throwable {
        OnStage.theActorCalled("Marlon").wasAbleTo(Openup.thePage());

    }

    @When("^he search for the course (.*) on the choucair academy plataform$")
    public void heSearchForTheCourseRecursoAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(String course) throws Throwable {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.onThePage());

    }

    @Then("^he finds the course called resources recursos (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) throws Throwable {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));

    }
}
