package com.vehicles.application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultRowSorter;
import javax.swing.JOptionPane;

import com.vehicles.domain.Bike;
import com.vehicles.domain.Car;
import com.vehicles.domain.Truck;
import com.vehicles.domain.Vehicle;
import com.vehicles.domain.Wheel;
import com.vehicles.persistance.VehicleRepository;

public class VehicleController {
	//aqui creare todos los vehiculos
	private VehicleRepository myVehicleRepository = new VehicleRepository();
	public VehicleController() {		
	}
	
	public void createCar(String plate, String brand, String color)  throws Exception {
		try {
			Car car = new Car(plate, brand, color);			
			// validamos matricula			
			if(!car.validarMatricula(plate)) throw new Exception();
			//agregamos ruedas.
				car.addWheels(car.pideDatosRuedas(0),car.pideDatosRuedas(1));			
				myVehicleRepository.addVehicle(car);
		} catch (Exception e) {
			System.out.println("Error al crear Coche");
		}			
	}
	
	public void createBike (String plate, String brand, String color)  throws Exception {
		try {
			Bike bike = new Bike(plate, brand, color);
			if(!bike.validarMatricula(plate)) throw new Exception();
				bike.addWheels(bike.pideDatosRuedas(0),bike.pideDatosRuedas(1));
				myVehicleRepository.addVehicle(bike);			
		} catch (Exception e) {
			System.out.println("Error al crear la Motocicleta.");
		}
	}
	
	public void createTruck (String plate, String brand, String color)  throws Exception {
		try {
			Truck truck = new Truck(plate, brand, color);
			if(!truck.validarMatricula(plate)) throw new Exception();			
			myVehicleRepository.addVehicle(truck);
			
		} catch (Exception e) {
			System.out.println("Error al crear el Camión");
		}
	}
	
	
	
	public String mostrarVehiculos() {
		//mostrar ruedas? -> lo muestro para saber que todo funciona bien
		List<Vehicle> myVehicles = myVehicleRepository.getAllVehicles();
		String datos="";
		for(Vehicle v:myVehicles) {
			datos = datos + v + v.getAllWheels();
		}
		return datos;
	}
	


}
