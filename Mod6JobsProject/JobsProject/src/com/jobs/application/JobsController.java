package com.jobs.application;


import java.util.List;
import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
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
	public void createVolunteerEmployee(String name, String address, String phone) throws Exception{
		Volunteer volunteer = new Volunteer(name, address, phone);
		repository.addMember(volunteer);		
	}
	
	
	public void createJuniorEmployee (String name, String address, String phone, double salaryPerMonth) throws Exception{
		Junior junior = new Junior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateJunior());
		repository.addMember(junior);
	}
	
	public void createMidEmployee (String name, String address, String phone, double salaryPerMonth) throws Exception{
		Mid mid = new Mid(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateMid());
		repository.addMember(mid);
	}
	
	public void createSeniorEmployee (String name, String address, String phone, double salaryPerMonth) throws Exception{
		Senior senior = new Senior(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateSenior());
		repository.addMember(senior);
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
