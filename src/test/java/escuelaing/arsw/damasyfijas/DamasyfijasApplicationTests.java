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
		int picas = service.calculatePicas(4231);
		assertEquals(picas,2);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 2
	 */
	@Test
	void calcularPicasNumero2() {
		int picas = service.calculatePicas(1243);
		assertEquals(picas,2);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 3
	 */
	@Test
	void calcularPicasNumero3() {
		int picas = service.calculatePicas(2341);
		assertEquals(picas,0);
	}
	
	/**
	 * Prueba que calcula el número de picas para un número 4
	 */
	@Test
	void calcularPicasNumero4() {
		int picas = service.calculatePicas(4278);
		assertEquals(picas,1);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 1
	 */
	@Test
	void calcularFamasNumero1() {
		int picas = service.calculatePicas(4231);
		int famas = service.getFamas();
		assertEquals(famas,2);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 2
	 */
	@Test
	void calcularFamasNumero2() {
		int picas = service.calculatePicas(1243);
		int famas = service.getFamas();
		assertEquals(famas,2);
	}
	
	/**
	 * Prueba que calcula el número de famas para un número 3
	 */
	@Test
	void calcularFamasNumero3() {
		int picas = service.calculatePicas(2341);
		int famas = service.getFamas();
		assertEquals(famas,4);
	}
	
	
	/**
	 * Prueba que calcula el número de famas para un número 4
	 */
	@Test
	void calcularFamasNumero4() {
		int picas = service.calculatePicas(4278);
		int famas = service.getFamas();
		assertEquals(famas,1);
	}
	/**
	 * Prueba que deberia ganar jugador
	 */
	@Test
	void deberiaGanar() {
		int picas = service.calculatePicas(1234);
		boolean isWin = service.isGanador();
		assertEquals(true,isWin);
	}
	
	/**
	 * Prueba que deberia perder jugador
	 */
	@Test
	void deberiaPerder() {
		int picas = service.calculatePicas(1243);
		boolean isWin = service.isGanador();
		assertEquals(false,isWin);
	}
}
