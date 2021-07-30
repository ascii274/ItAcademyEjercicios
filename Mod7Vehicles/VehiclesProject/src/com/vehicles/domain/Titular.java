package com.vehicles.domain;

/**
 * - Nivel 2 Fase 2
 * - Titular de un vehiculo 
 * 
 */
public class Titular extends Conductor{
	private boolean seguro;
	private boolean garajePropio;
	
	public Titular (String name, String surname, int day, int month, int year, boolean haveLicense, boolean seguro, boolean garajePropio) {
		super(name, surname, day, month, year, haveLicense);
		this.seguro = seguro;
		this.garajePropio = garajePropio;
	}
	
	// 
	public void addLicencia(String tipoLicencia, String nomComplet, int yearExpired, int monthExpired, int dayExpired){
		Licencia licencia = new Licencia(tipoLicencia, nomComplet, yearExpired, monthExpired, dayExpired);
		licencias.add(licencia);		
	}
	
	
	

}
