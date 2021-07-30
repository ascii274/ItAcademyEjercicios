package com.vehicles.domain;

import java.util.List;


// Nivel 2 Fase 1
public class Truck extends Vehicle{
	
	public Truck (String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}
	public String toString(){
		return "Truck[Plate:" + plate + " ,Brand:" + brand + ", Color:" + color +"]\n";
	}

	public String getAllWheels() {
		String datos="";
		for(Wheel w:wheels) {
			datos = datos + w;
		}
		return datos;
	}

	
	
}
