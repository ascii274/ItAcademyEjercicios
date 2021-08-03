package com.vehicles.view;


import javax.swing.JOptionPane;


import com.vehicles.application.PersonaController;
import com.vehicles.application.VehicleController;

/**
 *  Historico niveles hechos 
 * -Nivel 1 Fase 1,2,3 ok
 * -Nivel 2 Fase 1,2,3 ok
 * 
 */

public class Main {		
	private static VehicleController myVehicleController = new VehicleController();
	private static PersonaController myPersonaController = new PersonaController();
	
	public static void main(String[] args) throws Exception {			
		int opc;
		String usuario;
		
		//descomentar el deseado la licencia deseada.
		myPersonaController.crearTitular("Joel", "Cabatay", 18, 10, 1975, true, true, true,false);
		myPersonaController.agregarLicenciaTitular("Joel", "B1", "Joel Cabatay", 2025, 10, 15);
		//myPersonaController.agregarLicenciaTitular("Joel", "A1", "Joel Cabatay", 2025, 10, 15);
		//mostramos usuario registraods para su seleccion.
		usuario = JOptionPane.showInputDialog("Escribe el usuario que desea: \n" + myPersonaController.mostrarSoloNombres());		
		opc = Integer.parseInt(JOptionPane.showInputDialog("Escoge una opcion:\n [1:Crear Coche\n 2:Crear Moto]"));
		int dialogButton = JOptionPane.YES_NO_OPTION;
		int elUsuarioEsConductor;		
		
		try {
			//System.out.println(myVehicleController.mostrarVehiculos());//recuerda toString en clase
			switch (opc) {
				case 1:// crear coche
						// si la persona tiene carnet rellenamos los datos
					if (myPersonaController.personaConCarnet(usuario, "B1")) {
						pedirDatosVehiculo(0);
						// respuesta 0:si 1:no
						elUsuarioEsConductor = JOptionPane.showConfirmDialog(null, "Deseas que el usuario sea conductor?",
								"Warning", dialogButton);
						if (elUsuarioEsConductor == 0) { // 0:si
							myPersonaController.esTitularConductor(usuario);
						} else {// 1:no
								// creamos conductor y agregamos carnet de tipo A1
							JOptionPane.showMessageDialog(null, "Creando usuario Pedro..");
							myPersonaController.crearConductor("Pedro", "Sanchez", 18, 10, 1975, true);
							myPersonaController.agregarLicenciaConductor("Pedro", "A1", "Pedro Sanchez", 22, 2, 2024);
						}
					} else {// si no, creamos uno con el carnet
						JOptionPane.showMessageDialog(null, "El usuario no tiene carnet B1");
					}
				break;
				case 2:// crear moto
					if (myPersonaController.personaConCarnet(usuario, "A1")) {
						pedirDatosVehiculo(1);
						// respuesta 0:si 1:no
						elUsuarioEsConductor = JOptionPane.showConfirmDialog(null, "Deseas que el usuario sea conductor?",
								"Warning", dialogButton);
						if (elUsuarioEsConductor == 0) { // 0:si
							myPersonaController.esTitularConductor(usuario);
						} else {// 1:no
								// creamos conductor y agregamos carnet de tipo B1
							myPersonaController.crearConductor("Pedro", "Sanchez", 18, 10, 1975, true);
							myPersonaController.agregarLicenciaConductor("Pedro", "A1", "Pedro Sanchez", 22, 2, 2024);
						}
	
					} else {
						JOptionPane.showMessageDialog(null, "El usuario no tiene carnet A1");
					}
	
				break;
				default:
					System.out.println("Solo opciones 1-2");
				break;
				
			}
			System.out.println(myPersonaController.mostrarDatosPersona()); // mostramos todos los datos nuevamente para ver cambios
			System.out.println(myVehicleController.mostrarVehiculos());//recuerda toString en clase
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		 
	}
	
	
	/**
	 * 
	 * @param tipoVehiculo 0:Car 1:Bike 3:Truck
	 * @throws Exception
	 */

	static void pedirDatosVehiculo(int tipoVehiculo){
		//tipoVehiculo 0:Car 1:Bike 3:Truck
		String plateNumber, brand, colour;
		plateNumber =JOptionPane.showInputDialog("Introduce la matricula:");		
		brand = JOptionPane.showInputDialog("Introduce la marca:");
		colour = JOptionPane.showInputDialog("Introduce el color:");
		switch (tipoVehiculo) {
		case 0:
			try {
				myVehicleController.createCar(plateNumber, brand, colour);
			} catch (Exception e) {
				System.out.println("Error al pedir datos Coche");
			}			
			break;
		case 1:
			try {
				myVehicleController.createBike(plateNumber, brand, colour);
			} catch (Exception e) {
				System.out.println("Error al pedir datos Moto");
			}
			break;
		case 2:
			try {
				myVehicleController.createTruck(plateNumber, brand, colour);
			} catch (Exception e) {
				System.out.println("Error al pedir datos Camión");
			}
			break;
		default:
			System.out.println("Solo valores de 0-2");
			break;
		}
				
	}
	

}
