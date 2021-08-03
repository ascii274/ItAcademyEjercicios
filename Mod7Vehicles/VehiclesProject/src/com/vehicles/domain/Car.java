package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
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
		return "Car [Plate:" + plate + " ,Brand:" + brand + ", Color:" + color +"]\n";
	}
	
	public String getAllWheels() {
		String datos="";
		for(Wheel w:wheels) {
			datos = datos + w;
		}
		return datos;
	}
	
	public List<Wheel> pideDatosRuedas(int delanteraOTrasera) throws Exception {
		List<Wheel> myWheels = new ArrayList<Wheel>();		
		String wheelBrand="" ;
		double wheelDiameter = 0.0;
		Wheel wheel;
		if(delanteraOTrasera==0) {//pregunta para rueda delantera
			wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas delanteras:");			
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delanteras:"));
		}
		if(delanteraOTrasera==1) {// pregunta para reuda trasera
			wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas traseras:");
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda traseras:"));
		}		
		
		wheel = new Wheel(wheelBrand, wheelDiameter);
		if(!wheel.validarDiametroRueda(wheelDiameter))throw new Exception("El diametro debe ser mayor 0.4 y menor de 4.");
		myWheels.add(wheel);// dos veces porque las ruedas deben ser iguales a la par
		myWheels.add(wheel);		
		return myWheels;
	}
	
	


}
