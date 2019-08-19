package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Validar implements Question<String>{
	
	private Target target;
	
	public  Validar (Target target) {
	this.target=target;
	}

	@Override
	public String answeredBy(Actor actor) {
		return (target).resolveFor(actor).getText().trim();
		
	
		
	}
	
	
	
	public static  Validar LaBusqueda(Target target) {
		return new Validar(target);
		
	}

}
