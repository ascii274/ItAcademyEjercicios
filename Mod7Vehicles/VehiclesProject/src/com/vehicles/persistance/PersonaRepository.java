package com.vehicles.persistance;

import java.util.ArrayList;
import java.util.List;
import com.vehicles.domain.Persona;

public class PersonaRepository {
	
	private static List<Persona> myPersonas = new ArrayList<Persona>();
	
	public PersonaRepository() {

	}
	
	public void addPersona(Persona myPersona) throws Exception{
		if(myPersona == null) throw new Exception();		
		myPersonas.add(myPersona);
	}
	
	public List<Persona> getAllPersonas(){
		return new ArrayList<>(myPersonas);
	}
	
	public Persona existePersona(String nomBucar) throws Exception{
		// buscamos persona si existe y devolver el objeto
		Persona persona=null;
		boolean encontrado = false;
		int i = 0;
		if (nomBucar.equals("")) throw new Exception("El nombre no coincide");
		
		if (myPersonas.size() > 0) {
			//while (!encontrado) {//false
			while(i < myPersonas.size()) {
				if (myPersonas.get(i).getName().equals(nomBucar)) {
					persona = myPersonas.get(i);
					encontrado = true;
				}
			i++;				
			}
		} 
		return persona;
	}
	
	
	public boolean existeCarnet(String nomBuscar, String tipoCarnetBuscar) throws Exception{
		//metodo que busca persona y su carnet, nos devuelve true si hay coincidencias
		Persona myPersona;
		boolean encontradoCarnet = false;
		myPersona = existePersona(nomBuscar);
		if(myPersona ==null) throw new Exception("La persona no existe");
		if(myPersona.getLicencias().size()>0) {
			for(int i=0;i<myPersona.getLicencias().size();i++) {
				if(myPersona.getLicencias().get(i).getTipoLicencia().equalsIgnoreCase(tipoCarnetBuscar)) {
					encontradoCarnet = true;					
				}
			}
		}		
		return encontradoCarnet;		
	}
	
			
}
