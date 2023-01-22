package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By buscaCpf = By.xpath("//input[@id='relaxation']");
	public By resultadoRua = By.xpath("//td[text()='Rua Di Cavalcanti']");
	public By resultadoBairro = By.xpath("//td[text()='Parque Imperial']");
	public By resultadoCidade = By.xpath("//td[text()='Barueri/SP']");
	public By resultadoCep= By.xpath("//td[text()='06462-210']");
	public By getResultadoRua() {
		return resultadoRua;
	}
	public By getResultadoBairro() {
		return resultadoBairro;
	}
	public By getResultadoCidade() {
		return resultadoCidade;
	}
	public By getResultadoCep() {
		return resultadoCep;
	}
	public By btnLupaBusca = By.xpath("//div[@class='card card-mais-acessados ordem'][2]//button");
	public By btnCookie = By.id("btnCookie");
	
	
	public By getBuscaCpf() {
		return buscaCpf;
	}
	public By getResultadoBusca() {
		return resultadoRua;
	}
	public By getBtnLupaBusca() {
		return btnLupaBusca;
	}
	public By getBtnCookie() {
		return btnCookie;
	}

	
	
}
