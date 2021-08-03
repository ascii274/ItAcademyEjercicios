package com.vehicles.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

//Nivel 2 Fase 2
public class Persona {
	private String name;
	private String surname;	
	private Date birthDay;	
	private boolean haveLicense;
	protected List<Licencia> licencias = new ArrayList<Licencia>();
	
	
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

	public String getSurname() {
		return surname;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setHaveLicense(boolean haveLicense) {
		this.haveLicense = haveLicense;
	}
	
	
	
	public List<Licencia> getLicencias() {
		return licencias;
	}


	public String getLicense() {
		String dato="";
		for(Licencia l:licencias) {
			dato = dato + l;
		}			
		return dato;
	}
	
	public boolean tieneLicencia(String tipoLicencia) {
		boolean tieneTipoCarnet = false;
		for(Licencia l:licencias) {
			if(l.getTipoLicencia().equals(tipoLicencia)) {
				tieneTipoCarnet = true;
			}
		}		
		return tieneTipoCarnet;
		
	}


	
	

}
