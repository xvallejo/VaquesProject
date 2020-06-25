/**
 * 
 */
package net.xaviersala.Vaca.Model;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author xavier
 *
 */
public class RacaTests {

	Raca sut;
	
	@BeforeEach
	public void setUp() throws Exception {
		
	}


	/*
	 * Comprova que es retorna el nom que hem posat
	 */
	@ParameterizedTest
	@ValueSource(strings = {"Holdstein", "X", "XXXXXXXXXX"})
	public void testQueElNomEsElQueLiHemDonat(String nom) {
		sut = new Raca(nom, 5);
		assertEquals( nom, sut.getNom(), "El nom de la Raça no s'esta inicialitzant bé");
	}
	
	/*
	 * Comprova que si rep null retorna raça desconeguda
	 */
	@Test
	public void testQueSiNoLiDonemNomLaMarcaDesconeguda() {
		sut = new Raca(null, 10);
		assertEquals(Raca.desconeguda, sut.getNom());
	}
	
	@Test
	public void testQueSiElNomEsBuitRetornaRaçaDesconeguda() {
		sut = new Raca("", 10);
		assertEquals(Raca.desconeguda, sut.getNom());
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"  ", "\t", "\n"})
	public void testQueElsNomsBuitsRetornenDesconeguda(String nom) {
		sut = new Raca(nom, 10);
		assertEquals(Raca.desconeguda, sut.getNom());
	}

}
