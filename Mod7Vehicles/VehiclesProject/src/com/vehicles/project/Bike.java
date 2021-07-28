package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel frontWheel = wheels.get(0);
		Wheel backWheel = wheels.get(1);
		
		// preguntar porque creo que las dos pueden ser diferentes
		//if (!frontWheel.equals(backWheel))
		//	throw new Exception();

		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	}
	
	public List<Wheel> obtenerRuedas(){		
		return new ArrayList<>(wheels);
	}
	
//	public String getAllWheels() {
//		String datos="";
//		for(Wheel w:super.wheels) {
//			datos = datos + w;
//		}
//		return datos;
//	}
}
