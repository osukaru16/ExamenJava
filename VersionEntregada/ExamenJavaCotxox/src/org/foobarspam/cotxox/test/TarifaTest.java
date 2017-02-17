package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;


import org.junit.Test;
import org.foobarspam.cotxox.tarifa.Tarifa;



public class TarifaTest {

	@Test
	public void testGetCosteDistancia() {
		Tarifa tarifa = new Tarifa();
		int distancia = 5;
		
		assertEquals(6.75, tarifa.getCosteDistancia(distancia), 0.1);
		double comprobador = 0;
		for(distancia = 0 ; distancia <= 50; distancia++){
			comprobador = 0;
			comprobador = distancia * 1.35;
			assertEquals(comprobador, tarifa.getCosteDistancia(distancia), 0.1);
		}
		
		

	}
	
	
	
	@Test
	public void testGetCostetiempo() {
		Tarifa tarifa = new Tarifa();
		int tiempo = 5;
		
		assertEquals(1.75, tarifa.getCosteTiempo(tiempo), 0.1);
		assertEquals(17.5, tarifa.getCosteTiempo(50), 0.1);
		
		
		/*
		double comprobador = 0;
		for(tiempo = 0 ; tiempo <= 50; tiempo++){
			comprobador = 0;
			comprobador = tiempo * 0.35;
			assertEquals(comprobador, tarifa.getCosteDistancia(tiempo), 0.1);
		}
		*/
	}

	
	
	
	
	
	
}
