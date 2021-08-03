package com.vehicles.domain;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Nivel 2 Fase 2 
 */
public class Licencia {
	protected int id=0;
	private static int idSiguiente=1;// accesos solo en la propia clase
	private String tipoLicencia;
	private String nomComplet;
	private Date fechaCaducitat;
	
	public Licencia(String tipoLicencia, String nomComplet, int yearExpired, int monthExpired, int dayExpired) {
		this.tipoLicencia = tipoLicencia;
		this.nomComplet = nomComplet;
		GregorianCalendar calendar = new GregorianCalendar(yearExpired, monthExpired, dayExpired);
		fechaCaducitat = calendar.getTime();
		id += idSiguiente;// id=id+idSiguiente
		idSiguiente ++;
	}
	
	public String toString() {
		return "Lic[Id:" + id + ", Tipo licencia:" + tipoLicencia + 
				" , Nom Complet: " + nomComplet + ", fecha caducitat:" + fechaCaducitat +"]\n";
	}

	public String getTipoLicencia() {
		return tipoLicencia;
	}

	public int getId() {
		return id;
	}
	
	
	
	
}
