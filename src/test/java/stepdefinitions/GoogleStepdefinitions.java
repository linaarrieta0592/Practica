package stepdefinitions;


import org.hamcrest.Matchers;

import Utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.Validar;
import question.ValidarResultados;
import tasks.Buscar;
import tasks.Seleccionar;
import userinterface.PaginaInicial;

public class GoogleStepdefinitions {

	@Before
	public void prepararEscenario() {
		OnStage.setTheStage(new OnlineCast());
	
	}
	
	
	@Given("^el usuario ingresa a google$")
	public void elUsuarioIngresaAGoogle() {
		OnStage.theActorCalled("Lina").can(BrowseTheWeb.with(Driver.chrome()));
	    
	}

	@When("^realiza la busqueda de pruebaz$")
	public void realizaLaBusquedaDePruebaz(String palabra) {
		OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.LaPalabra(palabra));
	   
	}

	@When("^realiza la busqueda de la palabra (.*)$")
	public void realizaLaBusquedaDeLaPalabra(String palabra) {
		OnStage.theActorInTheSpotlight().attemptsTo(Buscar.LaPalabra(palabra));
	 
	}

	@When("^selecciona la palabra correcta (.*)$")
	public void seleccionaLaPalabraCorrecta(String palabra) {
		OnStage.theActorInTheSpotlight().attemptsTo(Seleccionar.LaPalabra(palabra));
	  
	}

	@Then("^valida que la cantidad de resultados sea mayor a (\\d+)$")
	public void validaQueLaCantidadDeResultaosSeaMayorA(int numero) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarResultados.dePruebas(),Matchers.greaterThan(numero)));
	}
	
	@Then("^valida que  el mensaje de correccion sea (.*)$")
	public void valida_que_el_mensaje_de_correccion_sea_pruebas(String pruebas) {
	   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.LaBusqueda(PaginaInicial.PALABRA_CORRECTA),Matchers.equalTo(pruebas)));
	}

	
	
}
