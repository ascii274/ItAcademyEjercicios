package com.vehicles.domain;

import java.util.Date;
import java.util.GregorianCalendar;

//Nivel 2 Fase 2
public class Persona {
	private String name;
	private String surname;	
	private Date birthDay;	
	private boolean haveLicense;
	
	
	public Persona(String name, String surname, int day, int month, int year, boolean haveLicense) {
		this.name = name;
		this.surname = surname;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		birthDay = calendar.getTime(); // asigno fecha
		this.haveLicense = haveLicense;
	}


	public boolean isHaveLicense() {
		return haveLicense;
	}
	
	public String getName() {
		return name;
	}
	

}
