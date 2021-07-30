package com.vehicles.application;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.domain.Persona;

public class PersonaController {
	private static List<Persona> misPersonas = new ArrayList<Persona>();
	

	public void addPersona(Persona persona) throws Exception{
		if (persona==null) throw new Exception();
		misPersonas.add(persona);	
		
	}
	
	public void getPersona(String nom) {
		Persona myPersona;
		for(int i=0;i<misPersonas.size();i++) {
			System.out.println(misPersonas.get(i).getName());
		}
	}
	
	
}
