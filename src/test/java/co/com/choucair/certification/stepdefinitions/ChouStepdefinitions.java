package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.models.HomeModel;
import co.com.choucair.certification.questions.RegistroQuestion;
import co.com.choucair.certification.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ChouStepdefinitions {

    @Managed
    private WebDriver navegador;


    @Before
    public void Begin() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(navegador)));
        OnStage.theActorCalled("Edward");
    }


    @Given("^ingresar al boton jointoday$")
    public void ingresarAlBotonJointoday() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }

    @When("^ingreso los datos del formulario$")
    public void ingresoLosDatosDelFormulario(List <HomeModel> data)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.RegistroUsuario(
                data.get(0).getFirstName(),
                data.get(0).getLastName(),
                data.get(0).getEmail(),
                data.get(0).getPassword(),
                data.get(0).getConfirPassword()
        ));
    }


    @Then("^El usuario vera el siguente mensaje$")
    public void elUsuarioVeraElSiguenteMensaje(List <HomeModel> data) {

        OnStage.theActorInTheSpotlight().should(seeThat(RegistroQuestion.message(), Matchers.is(data.get(0).getMensaje())));
    }
}

