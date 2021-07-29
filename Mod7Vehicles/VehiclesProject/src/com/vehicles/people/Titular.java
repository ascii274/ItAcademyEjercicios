package com.vehicles.people;

public class Titular extends Conductor{
	private boolean seguro;
	private boolean garajePropio;
	
	
	public Titular (String name, String surname, int day, int month, int year, boolean license, boolean seguro, boolean garajePropio) {
		super(name, surname, day, month, year, license);
		this.seguro = seguro;
		this.garajePropio = garajePropio;
	}
	
	
	
	//método añadir licencias
	public void addLicense(String tipoLicense) {
		super.licencias.add(tipoLicense);
	}
	

}
