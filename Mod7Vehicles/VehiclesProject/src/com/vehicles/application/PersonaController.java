package com.vehicles.application;



import java.util.List;
import com.vehicles.domain.Conductor;
import com.vehicles.domain.Licencia;
import com.vehicles.domain.Persona;
import com.vehicles.domain.Titular;
import com.vehicles.persistance.PersonaRepository;

public class PersonaController {
	PersonaRepository myPersonaRepository = new PersonaRepository();
	
	public PersonaController() {		
	}
	
	public void crearTitular(String name, String surname, int day, int month, int year, boolean haveLicense, boolean seguro, boolean garajePropio,boolean esConductor) throws Exception{
		try {
			Titular titular = new Titular(name, surname, day, month, year, haveLicense, seguro, garajePropio,esConductor);
			myPersonaRepository.addPersona(titular);
			
		} catch (Exception e) {
			System.out.println("Error al crear Titular");				
		}
	}
	
	public void crearConductor (String name, String surname, int day, int month, int year, boolean haveLicense) throws Exception {
		try {
			Conductor conductor = new Conductor(name, surname, day, month, year, haveLicense);
			myPersonaRepository.addPersona(conductor);			
			
		} catch (Exception e) {
			System.out.println("Error al crear Conductor");
		}		
	}

	
	public void agregarLicenciaTitular(String name,String tipoLicencia, String nomComplet, int yearExpired, int monthExpired, int dayExpired) throws Exception {
		Titular titular = (Titular) myPersonaRepository.existePersona(name);
		if(titular == null) throw new Exception("El titular no existe.");
		if(!titular.isHaveLicense()) throw new Exception("El titular no tiene licencia");
		Licencia licencia = new Licencia(tipoLicencia, nomComplet, yearExpired, monthExpired, dayExpired);
		titular.addLicencia(licencia);
	}
	
	public void agregarLicenciaConductor(String nomBuscar,String tipoLicencia, String nomComplet, int yearExpired, int monthExpired, int dayExpired) throws Exception {
		// si existe el conductor y tiene licencia añadimos una
		Conductor conductor = (Conductor) myPersonaRepository.existePersona(nomBuscar);
		if (conductor == null)throw new Exception("El conductor no existe");
		if (!conductor.isHaveLicense()) throw new Exception("El conductor no tiene licencia");
		Licencia licencia = new Licencia(tipoLicencia, nomComplet, yearExpired, monthExpired, dayExpired);
		conductor.addLicencia(licencia);
	}
	
	
	public boolean personaConCarnet(String nom,String carnet) throws Exception {
		//devuelve true si el nombre buscado tien carnet buscado
		boolean tieneCarnet = myPersonaRepository.existeCarnet(nom, carnet);
		if(!tieneCarnet) throw new Exception(nom + " no tiene carnet");
		return tieneCarnet;
	}
	

	
	public String mostrarDatosPersona() {
		// metodo para mostrar todos los datos con su carnet de una persona
		List<Persona> myPersonas = myPersonaRepository.getAllPersonas();
		String dato = "";
		for(Persona p:myPersonas) {
			dato = dato + p ;
		}
		return dato;		
	}

	
	public String mostrarSoloNombres() {
		//mostramos solo los nombres que hay en BBDD para seleccionar uno en el main.
		List<Persona> myPersonas = myPersonaRepository.getAllPersonas();
		String dato ="";
		for(Persona p:myPersonas) {
			dato = dato +  p.getName() + "\n";	
		}
		return dato;		
	}
	
	// Nivell 2 Fase 3.
	public void esTitularConductor(String nomBuscar) {
		try {
			Titular titular;
			titular = (Titular) myPersonaRepository.existePersona(nomBuscar);
			if(titular !=null) {
				titular.setEsConductor(true);
			}
			
		} catch (Exception e) {
			System.out.println("Error al asignar titular como conductor.");
		}
	}


	
}
