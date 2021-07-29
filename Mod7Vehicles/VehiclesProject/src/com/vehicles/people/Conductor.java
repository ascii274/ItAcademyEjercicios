package com.vehicles.people;

import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona{
	//protected: no acceden sin herencia, ni en clase en otro paquete 
		protected List<String> licencias = new ArrayList<String>();
		protected int id=0;
		private static int idSiguiente=1;// accesos solo en la propia clase
		//protected 

		public Conductor(String name, String surname, int day, int month, int year, boolean license) {
			super(name, surname, day, month, year, license);			
			id += idSiguiente;// id=id+idSiguiente
			idSiguiente ++;
			
			///falta definir licencia

		}


}
