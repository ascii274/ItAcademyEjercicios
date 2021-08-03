package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}
	
	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 1)
			throw new Exception();

		Wheel frontOrBackWheel = wheels.get(0);
		this.wheels.add(frontOrBackWheel);
		
	}
	
	public String toString(){
		return "Bike [Plate:" + plate + " ,Brand:" + brand + ", Color:" + color +"]\n";
	}
	
	public String getAllWheels() {
		String datos="";
		for(Wheel w:super.wheels) {
			datos = datos + w ;
		}
		return datos;
	}
	
	/** 
	 * @param delanteraTrasera 0:Delantera 1:Trasera
	 * @return
	 * @throws Exception
	 */
	public List<Wheel> pideDatosRuedas(int delanteraOTrasera) throws Exception {
		//pido datos de rueda y devuelvo el listado con 1 rueda.
		List<Wheel> myWheels = new ArrayList<Wheel>();		
		String wheelBrand="";
		double wheelDiameter = 0.0;
		Wheel wheel;
		if(delanteraOTrasera==0) {//pregunta para rueda delantera
			wheelBrand = JOptionPane.showInputDialog ("Introduce la marca rueda delantera:");			
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
		}
		if(delanteraOTrasera==1) {// pregunta para reuda trasera
			wheelBrand = JOptionPane.showInputDialog ("Introduce la marca rueda trasera:");
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda trasera:"));
		}		
		
		wheel = new Wheel(wheelBrand, wheelDiameter);
		if(!wheel.validarDiametroRueda(wheelDiameter))throw new Exception("El diametro debe ser mayor 0.4 y menor de 4.");		
		myWheels.add(wheel);// 
		
		return myWheels;
	}
	
}
