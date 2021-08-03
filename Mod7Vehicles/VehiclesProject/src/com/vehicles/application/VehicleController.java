package com.vehicles.application;


import java.util.List;
import com.vehicles.domain.Bike;
import com.vehicles.domain.Car;
import com.vehicles.domain.Truck;
import com.vehicles.domain.Vehicle;
import com.vehicles.persistance.VehicleRepository;

public class VehicleController {
	
	private VehicleRepository myVehicleRepository = new VehicleRepository();
	public VehicleController() {		
	}
	

	public void createCar(String plate, String brand, String color) {
		try {
			Car car = new Car(plate, brand, color);
			if(car.validarMatricula(plate)) {
				car.addWheels(car.pideDatosRuedas(0), car.pideDatosRuedas(1));
				myVehicleRepository.addVehicle(car);				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public void createBike (String plate, String brand, String color)  {
		try {
			Bike bike = new Bike(plate, brand, color);
			if(bike.validarMatricula(plate)) {
				bike.addWheels(bike.pideDatosRuedas(0),bike.pideDatosRuedas(1));
				myVehicleRepository.addVehicle(bike);			
			}
							
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void createTruck (String plate, String brand, String color) {
		try {
			Truck truck = new Truck(plate, brand, color);
			if(!truck.validarMatricula(plate)) throw new Exception();			
			myVehicleRepository.addVehicle(truck);
			
		} catch (Exception e) {
			System.out.println("Error al crear el Camión");
		}
	}
	
	public String mostrarVehiculos() throws Exception{
		//mostrar ruedas? -> lo muestro para saber que todo funciona bien
		List<Vehicle> myVehicles = myVehicleRepository.getAllVehicles();
		String datos="";
		for(Vehicle v:myVehicles) {
			datos = datos + v + v.getAllWheels();
		}
		return datos;
	}
	


}
