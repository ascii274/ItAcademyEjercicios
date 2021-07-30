package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * Nivel 2 Fase 2 
 */
public class Conductor extends Persona {
	//protected: no acceden sin herencia, ni en clase en otro paquete 
		protected List<Licencia> licencias = new ArrayList<Licencia>();
		protected int id=0;
		private static int idSiguiente=1;// accesos solo en la propia clase
		//protected 

		public Conductor(String name, String surname, int day, int month, int year, boolean haveLicense) {
			super(name, surname, day, month, year, haveLicense);			
			id += idSiguiente;// id=id+idSiguiente
			idSiguiente ++;

		}
		
		public void addLicencia(Licencia licencia) throws Exception{
			if(licencia==null) throw new Exception();
			licencias.add(licencia);			
		}
		

		
		
		


}
