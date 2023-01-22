package teste;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import drivers.Drivers;
import elementos.Elementos;
import metodos.Metodos;
import runner.Executa;

public class BuscarCepTeste extends Drivers{
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador(false); 
		
	}
	@Test
	public void buscarCepValido() {
		metodo.validarPopUp(el.btnCookie, 3);
		metodo.scroll();
		metodo.escrever(el.buscaCpf," 06462210");
		metodo.clicar(el.btnLupaBusca);
		metodo.pause(3000);
		metodo.mudarAba();
		metodo.pause(6000);
		assertEquals(el.resultadoRua,"Rua Di Cavalcanti");
		assertEquals(el.resultadoBairro,"Parque Imperial");
		assertEquals(el.resultadoCidade,"Barueri/SP");
		assertEquals(el.resultadoCep,"06462-210");
		System.out.println("Navegador aberto com susseco");
	
		Executa.fechsrNavegador();
	
	}
	
}
