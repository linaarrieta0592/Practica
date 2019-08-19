package tasks;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import userinterface.PaginaInicial;

public class Buscar implements Task {
	private  String palabra; 
	
	public  Buscar(String palabra) {
		this.palabra=palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo( 
				Enter.theValue(palabra).into(PaginaInicial.BUSCADOR),
				Hit.the(Keys.ENTER).into(PaginaInicial.BUSCADOR)
				
					);
		
	}
	
	public static Buscar LaPalabra(String palabra) {
		
		return new Buscar(palabra);
		
	}
	

}
