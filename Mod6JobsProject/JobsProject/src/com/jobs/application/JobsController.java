package com.jobs.application;


import java.util.List;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;


public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{	
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee managerEmployee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(managerEmployee);		
	}
	public void createVolunteer(String name, String address, String phone) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone);
		repository.addMember(volunteer);		
	}

	public void payAllEmployeers() {
		// TODO Auto-generated method stub
	
	}

	public String getAllEmployees() {
		List<AbsStaffMember> lista = repository.getAllMembers();
		String datos="";		
		//for(int i=0;i<lista.size();i++) {
		//	System.out.println(lista.get(i));
		//}
		for(AbsStaffMember absMember:lista) {
			datos = datos + absMember ;	
		}
		return datos;
	}	

	
}
