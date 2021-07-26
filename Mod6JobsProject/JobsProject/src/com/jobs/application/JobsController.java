package com.jobs.application;



import java.io.IOException;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;




public class JobsController {
	/*
	 *  - Aquí creamos todas las instancias de cada empleado y aplicamos todos los metodos abstractos 
	 *  heredados de la clase AbsStaffMember( clase padre).
	 *  - De aquí ya podremos invocarlos desde el main.
	 *  
	 */

	private EmployeeRepository repository = new EmployeeRepository();	
	public JobsController(){
		
	}
	// throws-> lanzara una exception el try catch
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{
		//0:Boss 1:Manager 2: Employee 3:Senior 4:Mid 5:Junior 6:Volunteer
		try {
			Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss(),tipoEmpleado);
			repository.addMember(boss);			
		}catch(Exception e) {
			System.out.println("El salario de  Boss debe ser mayor de 8000.");			
		}
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{
		//0:Boss 1:Manager 2: Employee 3:Senior 4:Mid 5:Junior 6:Volunteer
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee(),tipoEmpleado);
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{		
		try {
			Employee managerEmployee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager(),tipoEmpleado);
			repository.addMember(managerEmployee);			
		}catch(Exception e) {
			System.out.println("El salario de  Manager debe ser mayor de 3000 y menor igual de 5000.");			
		}		
	}
	
	public void createVolunteerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		try {
			Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth);
			repository.addMember(volunteer);
			
		}catch(Exception e) {
			System.out.println("El salario de  volunteer debe ser 0.");
		}				
	}
	
	
	public void createJuniorEmployee (String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{	
		try {
			Junior junior = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJunior(),tipoEmpleado);
			repository.addMember(junior);
			
		}catch(Exception e) {
			System.out.println("El salario de Junior debe ser mayor de 900 y menor igual de 1600");
		}		
	}
	
	public void createMidEmployee (String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{
		try {
			Mid mid = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMid(),tipoEmpleado);
			repository.addMember(mid);			
		}catch(Exception e) {
			System.out.println("El salario de Mid debe ser mayor de 1800 y menor o igual de 2500");			
		}
	}
	
	public void createSeniorEmployee (String name, String address, String phone, double salaryPerMonth, int tipoEmpleado) throws Exception{
		try {
			Senior senior = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSenior(),tipoEmpleado);
			repository.addMember(senior);			
		}catch (Exception e) {
			System.out.println("El salario de Senior debe ser mayor de 2700 y menor o igual de 4000");
			
		}
		
	}

	public String getAllEmployees() {
		List<AbsStaffMember> lista = repository.getAllMembers();
		String datos="";	
		for(AbsStaffMember absMember:lista) {
			datos = datos + absMember ;	
		}
		return datos;
	}
	
	//nivel 3 ?
	public void payAllEmployeers() {
		List<AbsStaffMember> lista = repository.getAllMembers();		
		for(AbsStaffMember absStaffMember:lista) {
			absStaffMember.pay();
		}
	}
	//nivel 3
	public void bonusAllEmployees() {
		List<AbsStaffMember> lista = repository.getAllMembers();		
		for(AbsStaffMember absStaffMember:lista) {
			absStaffMember.setBonus();
		}
		
	}

}
