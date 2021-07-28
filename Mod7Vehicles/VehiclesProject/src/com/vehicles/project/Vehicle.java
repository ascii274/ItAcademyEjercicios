package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	
	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	

	public String toString() {
		return "Plate number:" + plate + " ,Brand:" + brand + ", Color:" + color;
	}
	
	public String getAllWheels() {
		String datos="";
		for(Wheel w:wheels) {
			datos = datos + w;
		}
		return datos;
	}

}
