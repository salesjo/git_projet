package metodos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
	}

	/*
	 * Metodo para fechar mensagem de acordo com a contidade de cliks
	 * 
	 * @param elemento
	 * 
	 * @param qtdClicks
	 */
	public void validarPopUp(By elemento, int qtdClicks) {
		WebElement popUp = driver.findElement(elemento);

		do {
			clicar(elemento);
			qtdClicks--;
		} while (popUp.isDisplayed() && qtdClicks > 0);
	}
	// criar um metodo para fechar o pop-up usando do while

	public void pause(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void mudarAba() {
		String abaPrincipal = driver.getWindowHandle();
		Set<String> todasJanelas = driver.getWindowHandles();
		Iterator<String> iterator = todasJanelas.iterator();

		while (iterator.hasNext()) {
			String abaFilha = iterator.next();
			if (!abaFilha.equalsIgnoreCase(abaFilha)) {
				driver.switchTo().window(abaFilha);
			}
		}
	}

	
	
}
