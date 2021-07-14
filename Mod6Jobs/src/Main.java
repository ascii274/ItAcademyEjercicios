
public class Main {	

	public static void main(String[] args) {
				
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
		
		Employees myVoluteer = new Volunteer("Shiva Volunteer", "Calle paris 1", 603333333);
		myVoluteer.calcularPlus(0);
		myVoluteer.verDatosEmpleado();
		//myVoluteer.verSalarioEmpleado(myVoluteer.getSalaryPerMonth(), 0);	
	}
}
