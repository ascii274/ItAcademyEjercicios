package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected static List<Wheel> wheels = new ArrayList<Wheel>();
	
	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}	
	//abstract method
	public abstract String toString();
	public abstract String getAllWheels();
	
	
	/**
	 * - Nivel 1 fase 2
	 * - Validacion matricula 
	 */
	public boolean validarMatricula(String plateNumber)  throws Exception{
		//validamos formato matricula
		plateNumber = plateNumber.toUpperCase();
	    return plateNumber.matches("^[0-9]{4}[A-Z]{3}$");
	}
	

	


}
