package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;

	public static WebDriver chrome() {
		driver = new ChromeDriver();
		// opt.setPageLoadStrategy(PageLoadStrategy.NONE);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com.co/");

		return driver;
	}

}
