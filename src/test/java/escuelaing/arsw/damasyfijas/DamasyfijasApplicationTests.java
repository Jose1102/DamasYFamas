package escuelaing.arsw.damasyfijas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import escuelaing.arsw.damasyfijas.service.IServiceTablero;

@SpringBootTest
class DamasyfijasApplicationTests {

	@Autowired
	IServiceTablero service;
	
	
	
	/**
	 * Prueba que calcula el número de picas para un número 1
	 */
	@Test
	void calcularPicasNumero1() {
		service.setValor("4231");
		int picas = service.calculatePicas(4231);
		assertEquals(picas,4);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 2
	 */
	@Test
	void calcularPicasNumero2() {
		service.setValor("1234");
		int picas = service.calculatePicas(1243);
		assertEquals(picas,2);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 3
	 */
	@Test
	void calcularPicasNumero3() {
		service.setValor("5876");
		int picas = service.calculatePicas(2341);
		assertEquals(picas,0);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 4
	 */
	@Test
	void calcularPicasNumero4() {
		service.setValor("6372");
		int picas = service.calculatePicas(4278);
		assertEquals(picas,1);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 1
	 */
	@Test
	void calcularFamasNumero1() {
		service.setValor("1874");
		int picas = service.calculatePicas(4231);
		int famas = service.getFamas();
		assertEquals(famas,2);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 2
	 */
	@Test
	void calcularFamasNumero2() {
		service.setValor("4567");
		int picas = service.calculatePicas(1243);
		int famas = service.getFamas();
		assertEquals(famas,1);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 3
	 */
	@Test
	void calcularFamasNumero3() {
		service.setValor("4137");
		int picas = service.calculatePicas(2341);
		int famas = service.getFamas();
		assertEquals(famas,3);
	}
	
	
	/**
	 * Prueba que calcula el número de famas para un número 4
	 */
	@Test
	void calcularFamasNumero4() {
		service.setValor("9613");
		int picas = service.calculatePicas(4278);
		int famas = service.getFamas();
		assertEquals(famas,0);
	}
	
	
	/**
	 * Prueba que deberia perder jugador
	 */
	@Test
	void deberiaPerder() {
		service.setValor("1234");
		int picas = service.calculatePicas(4213);
		boolean isWin = service.isGanador();
		assertEquals(isWin,false);	
	}
	
	
	/**
	 * Prueba que deberia ganar jugador
	 */
	@Test
	void deberiaGanar() {
		service.setValor("4213");
		int picas = service.calculatePicas(4213);
		boolean isWin = service.isGanador();
	}
}
