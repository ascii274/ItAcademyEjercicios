import java.util.ArrayList;

public class Main {
	

	public static void main(String[] args) {
		// inicio Nivell 1
		System.out.println("\n***** Inicio nivel 1 *****");		
		Employees myEmployees1 = new Employees("Pepe Boss", "Calle Molona",666666666 , 100);
		myEmployees1.plus(3);// 1:Employee 2:Manager 3:Boss		
		Employees myEmployees2 = new Employees("Pedro Employe","Calle molona 2", 665266666, 40);
		myEmployees2.plus(1);
		Employees myEmployees3 = new Employees("Laura Employe", "Calle molona 3", 625266666,45);
		myEmployees3.plus(1);
		Employees myEmployees4 = new Employees("Juan Volunteer", "Calle molona 4", 614266666);
		
		// puede ser que pedro sea Manager? porque en el ejercicio esl salario sube 10%
		Employees myEmployees5 = new Employees("Pedro Employee", "Calle molona 2", 665226666, 80);
		myEmployees5.plus(2);		
		//muestro datos
		myEmployees1.verDatosEmpleado();
		myEmployees2.verDatosEmpleado();
		myEmployees3.verDatosEmpleado();
		myEmployees4.verDatosEmpleado();
		myEmployees5.verDatosEmpleado();
		System.out.println("***** Fin nivel 1 *****");
		
		// fin nivell 1
		// inicio nivell 2
		System.out.println("\n***** Inicio nivel 2 *****");
		
		Employees myBoss = new Employees("Pepe Boss", "Calle Molona",666666666 , 80000);
		myBoss.plus(3);// 1:Employee 2:Manager 3:Boss
		myBoss.verDatosEmpleado();
		
		Employees myManager = new Employees("Pedro Manager", "Calle molona 2", 665226666, 4500);
		myManager.plus(2);
		myManager.verDatosEmpleado();
		
		Senior mySenior = new Senior("Oscar Senior", "Calle molona 8", 606666000, 3300);
		mySenior.verDatosEmpleado();
		
		Mid myMid = new Mid("Marta Mid", "Calle Gran via 200", 605555555, 2150);
		myMid.verDatosEmpleado();
		
		Junior myJunior = new Junior("Joel Junior", "Calle gran via 30", 604444444, 1350);
		myJunior.verDatosEmpleado();
		
		Employees myVoluteerEmployees = new Employees("Shiva Volunteer", "Calle paris 1", 603333333,0);
		myVoluteerEmployees.verDatosEmpleado();
	
	}

}
