package org.foobarspam.cotxox.test;

import static org.junit.Assert.*;



import org.junit.Test;

import junit.framework.Assert;


import org.foobarspam.cotxox.carrera.Carrera;



public class CarreraTest {

	@Test
	public void testConstructorDefecto() {
		Carrera carrera = new Carrera();
		assertEquals("0000000000000000", carrera.getTarjetaCredito());
		
	}
	
	
	
	@Test
	public void testCosteEsperado() {
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito, origen,destino,distancia,tiempoEsperadoMinutos);
		assertEquals(13.96, carrera.getCosteEsperado(), 0.1);
		
	}
	
	
	
	

}
