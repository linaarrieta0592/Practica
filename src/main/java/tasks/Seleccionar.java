package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PaginaInicial;

public class Seleccionar implements Task {

	private String palabra;

	public Seleccionar(String palabra) {

		this.palabra = palabra;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(PaginaInicial.PALABRA_CORRECTA.of(palabra))
			

		);
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Seleccionar LaPalabra(String palabra) {

		return new Seleccionar(palabra);

	}

}
