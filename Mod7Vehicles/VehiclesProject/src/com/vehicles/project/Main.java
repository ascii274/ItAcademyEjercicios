package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {	

	public static void main(String[] args) {
		List<Wheel> myWheels = new ArrayList<Wheel>();
		
		int opc;		
		/**
		 * Nivel 1: Fase 1,2,3.
		 */
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opción a crear: \n [1:Coche \n 2:Moto]"));
		switch (opc) {
		case 1:
			crearCoche();
			break;
		case 2:
			crearMoto(myWheels);			
			break;
			default:JOptionPane.showMessageDialog(null,"Solo opciones:1-2");
		}			

	}
	
	/**
	 *  - Nivel 1 fase 1
	 *  - Mejora codigo Nivel 1 fase 2
	 */
	static void crearCoche() {
		// llamada a todos los metodos para la creacion de coche
		Car myCar;
		try {
			myCar = pideDatosCoche();
			myCar.addTwoWheels(pideDatosRuedaDelanteraCoche());
			myCar.addTwoWheels(pideDatosRuedasTraserasCoche());
			System.out.println(myCar.toString());
			System.out.println(myCar.getAllWheels());
			//System.out.println("Tamaños listado:" + myCar.wheels.size());			
		} catch (Exception e) {
			System.out.println("Error al crear Coche.");
		}
		
	}
	static Car pideDatosCoche() throws Exception {	
		Car myCar;
		String plateNumber, brand, colour;
		do {
			plateNumber = JOptionPane.showInputDialog("Introduce la matricula:");			
			if(!validarMatricula(plateNumber)) {
				JOptionPane.showMessageDialog(null,"Error con el formato de matricula[0000AAA]:");			
			}
			
		} while (!validarMatricula(plateNumber));		
		
		brand = JOptionPane.showInputDialog("Introduce la marca:");
		colour = JOptionPane.showInputDialog("Introduce el color:");
		myCar = new Car(plateNumber, brand, colour);	
		//System.out.println(myCar.toString());
		return myCar;
	}
	
	static List<Wheel> pideDatosRuedaDelanteraCoche() throws Exception {
		String wheelBrand;
		double wheelDiameter;
		List<Wheel>myWheels = new ArrayList<Wheel>();
		Wheel wheel;
		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas delanteras:");
		do {
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
			if(!validarDiametroRueda(wheelDiameter)) {
				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
			}			
		} while (!validarDiametroRueda(wheelDiameter));	
		wheel = new Wheel(wheelBrand, wheelDiameter);
		myWheels.add(wheel);//añadimos dos veces porque han de ser iguales.
		myWheels.add(wheel);
		return myWheels;//devolvemos array.
	}
	
	static List<Wheel> pideDatosRuedasTraserasCoche() throws Exception {
		String wheelBrand;
		double wheelDiameter;
		List<Wheel> myWheels = new ArrayList<Wheel>();		
		Wheel wheel;
		
		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas traseras:");
		do {
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda traseras:"));
			if(!validarDiametroRueda(wheelDiameter)) {
				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
			}			
		} while (!validarDiametroRueda(wheelDiameter));	
		
		wheel = new Wheel(wheelBrand, wheelDiameter);
		myWheels.add(wheel);//añadimos dos veces porque han de ser iguales.
		myWheels.add(wheel);
		return myWheels;//devolvemos array.
	}
	
	/**
	 * - Nivel 1 fase 2
	 * - Validacion matricula y diametro de ruedas delanteras y traseras
	 */
	static boolean validarMatricula(String plateNumber)  throws Exception{
		//validamos formato matricula
		plateNumber = plateNumber.toUpperCase();
	    return plateNumber.matches("^[0-9]{4}[A-Z]{3}$");
	}
	
	static boolean validarDiametroRueda(double diametro) {	
		// validamos formato diametro
		return diametro > 0.4 && diametro < 4.0;
	}
	
	/**
	 * - Nivel 1 fase 3
	 * - Creación Moto
	 */
	static void crearMoto(List<Wheel> myWheels) {
		//aqui llamamos todos los metodos para la creacion de la moto
		Bike myBike;
		try {
			myBike = pideDatosMoto();
			pideDatosRuedasDelanteraMoto(myWheels);
			pideDatosRuedasTraseraMoto(myWheels);
			myBike.addWheels(myWheels);
			System.out.println(myBike.toString());
			System.out.println(myBike.getAllWheels());
			System.out.println("Tamaños listado ruedas:" + myBike.wheels.size());			
		} catch (Exception e) {			
			System.out.println("Error al crear Moto");
		}
	}
	
	static Bike pideDatosMoto() throws Exception {
		Bike myBike;
		String plateNumber, brand, colour;
		do {
			plateNumber = JOptionPane.showInputDialog("Introduce la matricula:");			
			if(!validarMatricula(plateNumber)) {
				JOptionPane.showMessageDialog(null,"Error con el formato de matricula[0000AAA]:");		
			}
			
		} while (!validarMatricula(plateNumber));
		brand = JOptionPane.showInputDialog("Introduce la marca:");
		colour = JOptionPane.showInputDialog("Introduce el color:");
		myBike = new Bike(plateNumber, brand, colour);	
		//System.out.println(myBike.toString());
		return myBike;		
	}
	
	static void pideDatosRuedasDelanteraMoto(List<Wheel> myWheels){
		//lo pido una vez, por norma general son iguales delanteras y traseras.
		String wheelBrand;
		double wheelDiameter;		
		Wheel wheel;
		
		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas delanteras:");
		do {
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
			if(!validarDiametroRueda(wheelDiameter)) {
				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
			}			
		} while (!validarDiametroRueda(wheelDiameter));	
		wheel = new Wheel(wheelBrand, wheelDiameter);
		myWheels.add(wheel);
	}
	
	static void pideDatosRuedasTraseraMoto(List<Wheel> myWheels){
		//lo pido una vez, por norma general son iguales delanteras y traseras.
		String wheelBrand;
		double wheelDiameter;		
		Wheel wheel;		
		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas traseras:");
		do {
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
			if(!validarDiametroRueda(wheelDiameter)) {
				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
			}			
		} while (!validarDiametroRueda(wheelDiameter));	
		wheel = new Wheel(wheelBrand, wheelDiameter);
		myWheels.add(wheel);		
		//return myWheels;//devolvemos array.
	}
	
	
}
