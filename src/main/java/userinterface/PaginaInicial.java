package userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicial {
	
	public static final Target BUSCADOR= Target.the("Barra de Busqueda").locatedBy("//input[@name='q']");
	public static final Target BTN_BUSCAR= Target.the("Boton de Busqueda").locatedBy("(//input[@value='Buscar con Google'])[2]");
	public static final Target PALABRA_CORRECTA=Target.the("Palabra Correcta").locatedBy("//a[@id='fprsl']//i");
	public static final Target RESULTADO_BUSQUEDA =Target.the("Resultado de la busqueda").locatedBy("//div[@class='srg']//h3[@class='LC20lb']");

}
