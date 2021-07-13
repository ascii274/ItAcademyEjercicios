
public class Main {	

	public static void main(String[] args) {
		// inicio Nivell 1 y Nivell 3
		System.out.println("\n***** Inicio nivel 1 y 3*****");		
		Employees myEmployees1 = new Employees("Pepe Boss", "Calle Molona",666666666 , 100);
		myEmployees1.calcularPlus(3);//0:volunteer 1:Employee 2:Manager 3:Boss
		myEmployees1.verDatosEmpleado();
		myEmployees1.verSalarioEmpleado(myEmployees1.getSalaryPerMonth(),3);//(salarioBase,tipoEmpleado)
		
		Employees myEmployees2 = new Employees("Pedro Employee","Calle molona 2", 665266666, 40);
		myEmployees2.calcularPlus(1);
		myEmployees2.verDatosEmpleado();
		myEmployees2.verSalarioEmpleado(myEmployees2.getSalaryPerMonth(),1);
		Employees myEmployees3 = new Employees("Laura Employee", "Calle molona 3", 625266666,45);
		myEmployees3.calcularPlus(1);		
		myEmployees3.verDatosEmpleado();
		myEmployees3.verSalarioEmpleado(myEmployees3.getSalaryPerMonth(),1);
		
		Employees myEmployees4 = new Employees("Juan Volunteer", "Calle molona 4", 614266666);
		myEmployees4.calcularPlus(0);
		myEmployees4.verDatosEmpleado();		
		myEmployees4.verSalarioEmpleado(myEmployees4.getSalaryPerMonth(),0);
		
		// puede ser que pedro sea Manager? porque en el ejercicio esl salario sube 10%
		Employees myEmployees5 = new Employees("Pedro Employee", "Calle molona 2", 665226666, 80);
		myEmployees5.calcularPlus(2);		
		myEmployees5.verDatosEmpleado();
		myEmployees5.verSalarioEmpleado(myEmployees5.getSalaryPerMonth(),2);
		System.out.println("\n***** Fin nivel 1 y 3*****");		
		// fin nivell 1
		
		// inicio nivell 2
		System.out.println("\n***** Inicio nivel 2 y 3 *****");		
		Employees myBoss = new Employees("Pepe Boss", "Calle Molona",666666666 , 80000);
		//0:Volunteer  1:Employee 2:Manager 3:Boss 4:Senior 5:Mid 6:Junior
		myBoss.calcularPlus(3);// 1:Employee 2:Manager 3:Boss 
		myBoss.verDatosEmpleado();
		myBoss.verSalarioEmpleado(myBoss.getSalaryPerMonth(), 3);
		
		Employees myManager = new Employees("Pedro Manager", "Calle molona 2", 665226666, 4500);
		myManager.calcularPlus(2);
		myManager.verDatosEmpleado();
		myManager.verSalarioEmpleado(myManager.getSalaryPerMonth(), 2);
		
		Senior mySenior = new Senior("Oscar Senior", "Calle molona 8", 606666000, 3300);
		//mySenior.calcularPlus(4);		
		mySenior.verDatosEmpleado();
		mySenior.verSalarioEmpleado(mySenior.getSalaryPerMonth(),4);
		
		Mid myMid = new Mid("Marta Mid", "Calle Gran via 200", 605555555, 2150);
		//myMid.calcularPlus(5);
		myMid.verDatosEmpleado();
		myMid.verSalarioEmpleado(myMid.getSalaryPerMonth(), 5);
		
		Junior myJunior = new Junior("Joel Junior", "Calle gran via 30", 604444444, 1350);
		//myJunior.calcularPlus(6);
		myJunior.verDatosEmpleado();
		myJunior.verSalarioEmpleado(myJunior.getSalaryPerMonth(), 6);
		
		Employees myVoluteer = new Employees("Shiva Volunteer", "Calle paris 1", 603333333,0);
		myVoluteer.calcularPlus(0);
		myVoluteer.verDatosEmpleado();
		myVoluteer.verSalarioEmpleado(myVoluteer.getSalaryPerMonth(), 0);	
	}
}
