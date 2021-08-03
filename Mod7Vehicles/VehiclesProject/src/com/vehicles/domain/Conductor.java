package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Nivel 2 Fase 2 
 */
public class Conductor extends Persona {

	public Conductor(String name, String surname, int day, int month, int year, boolean haveLicense) {
			super(name, surname, day, month, year, haveLicense);			
			
		}
		
		public void addLicencia(Licencia licencia) throws Exception{
			if(licencia==null) throw new Exception();
			licencias.add(licencia);			
		}
		
		public String toString() {
			return "Cond[ Nombre:" + super.getName() +" ,Apellidos:" + super.getSurname()
					+ " ,Fecha nacimiento:" + super.getBirthDay() + " ,Carnet:" + super.isHaveLicense() + 
					" ]\n" + getLicense();
		}
		
}
