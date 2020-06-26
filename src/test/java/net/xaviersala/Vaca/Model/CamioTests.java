/**
 * 
 */
package net.xaviersala.Vaca.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

/**
 * @author xavier
 *
 */
public class CamioTests {

	Camio sut;

	@BeforeEach
	void setUp() throws Exception {
	}

	/*
	 * Controla que pot entrar una Vaca
	 * Simulem amb un camió de 3500 Kg i 2 espais.
	 */
	@Test
	public void testQueEntriUnaVacaEnUnCamioBuit() {
		
		// ARRANGE
		Vaca vacaFalsa = Mockito.mock(Vaca.class);
		Mockito.when(vacaFalsa.getPes()).thenReturn(500.00);
		
		sut = new Camio(3500.00, 2);

		// ACT
		Boolean resultat = sut.EntraVaca(vacaFalsa);

		// ASSERT
		assertTrue(resultat, "No ha pogut entrar la vaca al camió");
	}

	/*
	 * Controla que pot entrar i sortir una Vaca
	 * Simulem amb un camió de 3500 Kg i 2 espais
	 */
	@Test
	public void testQueSurtiUnaVacaEnUnCamio() {
		
		// ARRANGE
		Vaca vacaFalsa = Mockito.mock(Vaca.class);
		Mockito.when(vacaFalsa.getPes()).thenReturn(500.00);
		
		sut = new Camio(3500.00, 2);

		// ACT
		Boolean resultat = sut.EntraVaca(vacaFalsa);
		Boolean resultat2 = sut.TreuVaca(vacaFalsa);

		// ASSERT
		assertTrue(resultat, "No ha pogut entrar la vaca al camió");
		assertTrue(resultat2, "No ha pogut sortir la vaca al camió");
	}
	
	/*
	 * Controla el pes maxim d'un camió
	 * Simulem un camió de pes màxim 400Kg i una Vaca de 600Kg (ha de fallar)
	 */
	@Test
	public void testQueLaVacaPesaMassa() {
		
		// ARRANGE
		Vaca vacaFalsa = Mockito.mock(Vaca.class);
		Mockito.when(vacaFalsa.getPes()).thenReturn(600.00);
		
		sut = new Camio(400.00, 2);

		// ACT
		Boolean resultat = sut.ComprovaVaca(vacaFalsa);

		// ASSERT
		assertFalse(resultat, "La vaca podria entrar i no ha d'entrar");
	}
	
	/*
	 * Controla la llet que porta el camió
	 * Si hi ha més d'una vaca, hi ha d'haver llet!
	 */
	@Test
	public void testQueContaLaLlet() {
		
		// ARRANGE
		Vaca vacaFalsa = Mockito.mock(Vaca.class);
		Mockito.when(vacaFalsa.GetLitres()).thenReturn(10.00);
		
		sut = new Camio(400.00, 2);

		// ACT
		Boolean resultat = sut.EntraVaca(vacaFalsa);
		Double litres = sut.GetLitres();

		// ASSERT
		assertTrue(resultat, "La vaca no ha entrat");
		assertEquals(10.00, litres, "Els litres no coincideixen");
	}

}
