package com.vehicles.people;

import java.util.GregorianCalendar;

public class Persona {
	private String name;
	private String surname;
	private int day;// dia nacimiento
	private int month;
	private int year;
	private boolean license;
	
	
	public Persona(String name, String surname, int day, int month, int year, boolean license) {
		this.name = name;
		this.surname = surname;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day);
		this.license = license;
	}

}
