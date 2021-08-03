package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * - Nivel 2 Fase 2
 * - Titular de un vehiculo 
 * 
 */
public class Titular extends Persona{	
	private boolean esConductor;
	private boolean seguro;
	private boolean garajePropio;
	
	public Titular (String name, String surname, int day, int month, int year, boolean haveLicense, boolean seguro, boolean garajePropio, boolean esConductor) {
		super(name, surname, day, month, year, haveLicense);
		
		this.seguro = seguro;
		this.garajePropio = garajePropio;
		this.esConductor = esConductor;
	}
	
	public void addLicencia(Licencia licencia) throws Exception{
		if(licencia==null) throw new Exception();
		licencias.add(licencia);			
	}
	
	
	public String toString() {
		//muestra todos los datos con las licencias
		return "\nTit[ Nombre:" + super.getName() +" ,Apellidos:" + super.getSurname()
				+ " ,Fecha nacimiento:" + super.getBirthDay() + " ,Carnet:" + super.isHaveLicense() 
				+ " ,Seguro:" + seguro +  " ,Garaje Propio:" + garajePropio 
				+ ", Es conductor: " + esConductor  + "]\n" + getLicense();
						
	}
	
	public String getLicense() {
		// muestra todas la licencias que tiene el titular
		String dato="";
		for(Licencia l:licencias) {
			dato = dato + l;
		}
		
		return dato;
	}

	public boolean isEsConductor() {
		return esConductor;
	}

	public void setEsConductor(boolean esConductor) {
		this.esConductor = esConductor;
	}
	


	
	
	

}
