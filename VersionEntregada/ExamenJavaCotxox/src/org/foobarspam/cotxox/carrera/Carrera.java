package org.foobarspam.cotxox.carrera;


import org.foobarspam.cotxox.tarifa.Tarifa;
import org.foobarspam.cotxox.conductores.*;


public class Carrera {

	private String origen = null;
	private String destino = null;
	private String tarjetaCredito = null;
	private double distancia = 0;
	private int tiempoEsperado = 10;
	private double costeTotal = 0;
	
	
	
	
	
	//construcctores
	
	
	public Carrera() {
		this.tarjetaCredito = "0000000000000000";
		
	}
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	public Carrera(String tarjetaCredito, String destino, String origen, double distancia,int tiempoEsperado) {
		this.tarjetaCredito = tarjetaCredito;
		this.destino = destino;
		this.origen = origen;
		this.distancia = distancia;
		this.tiempoEsperado = tiempoEsperado;

	}

	
	
	// Sets
	
	public void setOrigen(String origen){
		this.origen = origen;
	}
	
	public void setDestino(String destino){
		this.destino = destino;
	}
	
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	
	
	public void setTiempoEsperado(int tiempoEsperado){
		this.tiempoEsperado = tiempoEsperado;
	}
	
	
	
	
	
	
	
	//Gets
	
	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	
	public String getDestino(){
		return this.destino;
	}
	
	
	public String getOrigen(){
		return this.origen;
	}
	
	public double getDistancia(){
		return this.distancia;
	}
	
	
	public double getCosteEsperado(){
		saberCosteEsperado();
		return this.costeTotal;
	}
	
	public int getTiempoEsperado(){
		return this.tiempoEsperado;
	}
	
	
	
	
	
	
	public Conductor asignarConductor(PoolConductores conductores){
		Conductor driver = new Conductor();
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// metodos privados
	
	
	private void saberCosteEsperado(){
		Tarifa tarifa = new Tarifa();
		this.costeTotal = tarifa.getCosteTotalEsperado(this);
		
		
	}
	
	
	
	
	
	
	
	
}
