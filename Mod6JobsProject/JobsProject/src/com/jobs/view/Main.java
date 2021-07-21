package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		// nivell 1 lo comento porque con los datos de abajo son suficientes.
		//controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0,0.32);
		//controller.createEmployee("Pedro Employee", "Dirección molona 2", "665266666", 40.0,0);
		//controller.createEmployee("Laura Employee", "Dirección molona 3", "625266666", 45.0,0);
		//controller.createVolunteerEmployee("Juan Volunteer", "Dirección molona 4", "614266666");		
		//controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 80.0,0);
		
		
		//nivell 2 y 3
		controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 8000.0);
		controller.createManagerEmployee("Juan Manager", "Gran via 2", "55544433",4300.0);		
		controller.createSeniorEmployee("Joan Senior", "Gran via 90","6004004444",3000);
		controller.createMidEmployee("Marta Mid", "Gran via 60", "6005005555", 2200.0);
		controller.createJuniorEmployee("Joel Junior", "Gran via 30", "600600666", 1200.0);
		controller.createVolunteerEmployee("Silvia Volunteer", "Gran via 14", "333222111");
		
		controller.payAllEmployeers();
		String allEmployees=controller.getAllEmployees();
		System.out.println("EMPLOYEES:\n" + allEmployees);
	}

}
