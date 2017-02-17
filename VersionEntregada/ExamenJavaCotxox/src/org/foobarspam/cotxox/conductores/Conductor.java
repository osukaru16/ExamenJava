package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	private String nombre= null;
	private String modelo = null;
	private String matricula = null;
	
	private boolean ocupado = false;
	
	private double mediaValoracion = 0;
	
	private ArrayList<Byte> valoracion = new ArrayList<>();;
	
	public Conductor() {
		this.nombre= "Nameless";
		
	}
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	// Sets
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	
	public void setValoracion(byte valoracion){
		this.valoracion.add(valoracion);
	}
	
	
	
	//Gets
	
	
	
	
	
	
	
	
	

}
