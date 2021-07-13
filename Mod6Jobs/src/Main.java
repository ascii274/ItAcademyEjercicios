
public class Main {

	public static void main(String[] args) {
		// inicio Nivell 1
		
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
		
		
		
	}

}
