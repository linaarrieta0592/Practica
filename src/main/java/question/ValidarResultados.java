package question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.Driver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarResultados implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		WebDriver driver= Driver.driver;
		List<WebElement> listaElement = driver.findElements(By.xpath("//div[@class='srg']//h3[@class='LC20lb']"));
		System.out.println("=================== "+ listaElement.size());
		return listaElement.size();
		
	}

	
	
	public static  ValidarResultados dePruebas (){
		return new ValidarResultados();
		
	}
}
