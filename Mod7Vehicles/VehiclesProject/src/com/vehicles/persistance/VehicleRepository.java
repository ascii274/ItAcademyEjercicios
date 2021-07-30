package com.vehicles.persistance;

import java.util.ArrayList;
import java.util.List;

import com.vehicles.domain.Vehicle;

public class VehicleRepository {
	
	private static List<Vehicle> myVehicles = new ArrayList<Vehicle>();
	
	public VehicleRepository() {
		
	}
	
	public void addVehicle (Vehicle myVehicle) throws Exception{
		if(myVehicle==null) throw new Exception();
		myVehicles.add(myVehicle);
		
	}
	
	public List<Vehicle> getAllVehicles(){
		return new ArrayList<>(myVehicles);
	}

}
