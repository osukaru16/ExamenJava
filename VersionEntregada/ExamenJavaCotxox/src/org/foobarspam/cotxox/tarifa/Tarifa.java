package org.foobarspam.cotxox.tarifa;



import org.foobarspam.cotxox.carrera.Carrera;



public class Tarifa {

	private double costeMilla = 0;
	private double costeMinuto = 0;
	private double porcentajeComision = 0;
	
	private int costeMinimo = 0;
	
	
	public Tarifa() {
		this.costeMilla = 1.35;
		this.costeMinuto = 0.35;
		this.porcentajeComision = 0.2;
		this.costeMinimo = 5;
	}
	
	//gets
	
	public double getCosteMilla(){
		return this.costeMilla;
	}
	
	public double getCosteMinuto(){
		return this.costeMinuto;
	}
	
	
	
	
	public double getCosteDistancia(double distancia){
		return calculaCosteDistancia(distancia);
		
	}
	
	
	public double getCosteTiempo(int minutos){
		return calculaCosteTiempo(minutos);
	}
	
	
	
	
	public double getCosteTotalEsperado(Carrera carrera){
		return calculaCosteTotalEsperado(carrera);
	}
	
	public int getCosteMinimo(){
		return this.costeMinimo;
	}
	
	
	
	
	
	
	
	// Metodos privados
	
	private double calculaCosteDistancia(double distancia){
		return distancia * getCosteMilla();	
	}
	
	
	
	private double calculaCosteTiempo(int minutos){
		return minutos * getCosteMinuto();
	}
	
	
	
	private double calculaCosteTotalEsperado(Carrera carrera){
		double distancia = carrera.getDistancia();
		int minutos = carrera.getTiempoEsperado();
		double calculo = calculaCosteDistancia(distancia) + calculaCosteTiempo(minutos);
		if (calculo < getCosteMinimo()){
			calculo = getCosteMinimo();
		}
		return calculo;	
	}
	
	
	
	
	
	

}
