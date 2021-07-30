package com.vehicles.domain;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Nivel 2 Fase 2 
 */
public class Licencia {
	protected String tipoLicencia;
	protected String nomComplet;
	protected Date fechaCaducitat;
	
	public Licencia(String tipoLicencia, String nomComplet, int yearExpired, int monthExpired, int dayExpired) {
		this.tipoLicencia = tipoLicencia;
		this.nomComplet = nomComplet;
		GregorianCalendar calendar = new GregorianCalendar(yearExpired, monthExpired, dayExpired);
		fechaCaducitat = calendar.getTime();
		
	}
	
}
