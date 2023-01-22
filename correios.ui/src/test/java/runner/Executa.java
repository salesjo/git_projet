package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers {
	/**
	 * Metodo para abrir navegador,se não quiser abrir o browser pasar o atributo false
	 * @param headless
	 */
	public static void abrirNavegador(boolean  headless) {
		String site = "https://www.correios.com.br/";
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		if(!headless) {
			chromeOptions.addArguments("--headless--");
		}
		
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(site);
	}
	
	public static void fechsrNavegador() {
		driver.quit();
	}

}
