package com.vehicles.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.vehicles.application.VehicleController;
import com.vehicles.domain.Bike;
import com.vehicles.domain.Car;
import com.vehicles.domain.Titular;
import com.vehicles.domain.Wheel;

/**
 *  Historico ejercicio: 
 * -Nivel 1 Fase 1,2,3 ok
 * -Nivel 2 Fase 1 ok
 * -Nivel 2 Fase 2 ok
 * -Nivel 2 Fase 3 pdte: 
 */
public class Main {	
	
	private static VehicleController myVehicleController = new VehicleController();
	
	public static void main(String[] args) throws Exception {	
		int opc;
		/**
		 * - Nivel 1: Fase 1,2,3.
		 * - Nivel 2: Fase1,2,
		 */
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opcion:\n [1:Crer Coche\n 2:Crear Moto]"));
		
		switch (opc) {
		case 1://crear coche
			pedirDatosVehiculo(0);
			break;
		case 2:
			pedirDatosVehiculo(1);
			break;
		default:
			System.out.println("Solo opciones 1-2");
			break;
		}
		
		//pideDatosVehiculo(0);
		System.out.println(myVehicleController.mostrarVehiculos());//recuerda toString en clase 

	}
	
	
	/**
	 * 
	 * @param tipoVehiculo 0:Car 1:Bike 3:Truck
	 * @throws Exception
	 */

	static void pedirDatosVehiculo(int tipoVehiculo) throws Exception {
		//tipoVehiculo 0:Car 1:Bike 3:Truck
		Car myCar;
		String plateNumber, brand, colour;
		plateNumber =JOptionPane.showInputDialog("Introduce la matricula:");		
		brand = JOptionPane.showInputDialog("Introduce la marca:");
		colour = JOptionPane.showInputDialog("Introduce el color:");
		switch (tipoVehiculo) {
		case 0:
			myVehicleController.createCar(plateNumber, brand, colour);			
			break;
		case 1:
			myVehicleController.createBike(plateNumber, brand, colour);
			break;
		case 2:
			myVehicleController.createTruck(plateNumber, brand, colour);
			break;
		default:
			System.out.println("Solo valores de 0-2");
			break;
		}
				
	}
	

	
	
//	/**
//	 * - Nivel 1 fase 3
//	 * - Creación Moto
//	 */
//	static void crearMoto(List<Wheel> myWheels) {
//		//aqui llamamos todos los metodos para la creacion de la moto
//		Bike myBike;
//		try {
//			myBike = pideDatosMoto();
//			pideDatosRuedasDelanteraMoto(myWheels);
//			pideDatosRuedasTraseraMoto(myWheels);
//			myBike.addWheels(myWheels);
//			System.out.println(myBike.toString());
//			System.out.println(myBike.getAllWheels());
//			System.out.println("Tamaños listado ruedas:" + myBike.wheels.size());			
//		} catch (Exception e) {			
//			System.out.println("Error al crear Moto");
//		}
//	}
//	
//	static Bike pideDatosMoto() throws Exception {
//		Bike myBike;
//		String plateNumber, brand, colour;
//		do {
//			plateNumber = JOptionPane.showInputDialog("Introduce la matricula:");			
//			if(!validarMatricula(plateNumber)) {
//				JOptionPane.showMessageDialog(null,"Error con el formato de matricula[0000AAA]:");		
//			}
//			
//		} while (!validarMatricula(plateNumber));
//		brand = JOptionPane.showInputDialog("Introduce la marca:");
//		colour = JOptionPane.showInputDialog("Introduce el color:");
//		myBike = new Bike(plateNumber, brand, colour);	
//		//System.out.println(myBike.toString());
//		return myBike;		
//	}
//	
//	static void pideDatosRuedasDelanteraMoto(List<Wheel> myWheels){
//		//lo pido una vez, por norma general son iguales delanteras y traseras.
//		String wheelBrand;
//		double wheelDiameter;		
//		Wheel wheel;
//		
//		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas delanteras:");
//		do {
//			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
//			if(!validarDiametroRueda(wheelDiameter)) {
//				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
//			}			
//		} while (!validarDiametroRueda(wheelDiameter));	
//		wheel = new Wheel(wheelBrand, wheelDiameter);
//		myWheels.add(wheel);
//	}
//	
//	static void pideDatosRuedasTraseraMoto(List<Wheel> myWheels){
//		//lo pido una vez, por norma general son iguales delanteras y traseras.
//		String wheelBrand;
//		double wheelDiameter;		
//		Wheel wheel;		
//		wheelBrand = JOptionPane.showInputDialog ("Introduce la marca ruedas traseras:");
//		do {
//			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog ("Introduce el diametro de la rueda delantera:"));
//			if(!validarDiametroRueda(wheelDiameter)) {
//				JOptionPane.showMessageDialog(null,"El diametro debe ser mayor de 0.4 y menor de 4");
//			}			
//		} while (!validarDiametroRueda(wheelDiameter));	
//		wheel = new Wheel(wheelBrand, wheelDiameter);
//		myWheels.add(wheel);		
//		//return myWheels;//devolvemos array.
//	}
//	
	
}
