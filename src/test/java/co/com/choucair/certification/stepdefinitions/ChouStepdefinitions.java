package co.com.choucair.certification.stepdefinitions;

import co.com.choucair.certification.tasks.Registro;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


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
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.RegistroUsuario());
    }

    @When("^ingreso los datos del formulario$")
    public void ingresoLosDatosDelFormulario() {

    }


}

