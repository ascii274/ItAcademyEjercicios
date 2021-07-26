package com.jobs.domain;

public class Employee extends AbsStaffMember {
	// generamos clase hija y redefnimos su metodos
	
	//0:Boss 1:Manager 2: Employee 3:Senior 4:Mid 5:Junior 6:Volunteer 
	protected int tipoEmpleado;
	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected double netMonthlySalary;
	protected double grossMonthlySalary;
	protected double netAnnualSalary;
	protected double grossAnnualSalary;		

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate,int tipoEmpleado) throws Exception {
		super(name, address, phone);
		//lanzar y captura en jobsController
		
		switch (tipoEmpleado) {
		case 0: // boss
			if(salaryPerMonth <= 8000) throw new Exception();
			break;
		case 1: // manager
			if(salaryPerMonth < 3000 || salaryPerMonth >5000) throw new Exception();
			break; 
		case 2:// employee
			if(salaryPerMonth > 0) throw new Exception();
			break;
		case 3:// senior
			if(salaryPerMonth <= 2700 || salaryPerMonth >=4000) throw new Exception();
			break;
		case 4://Mid
			if(salaryPerMonth <= 1800 || salaryPerMonth >=25000) throw new Exception();
			break;
		case 5://junior
			if(salaryPerMonth <= 900 || salaryPerMonth >=1600) throw new Exception();
			break;
			
		}
		
		

		
		
		
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;		
		
	}
	
	// redefinimos por heredar de una clase abstracta 
	public String toString() {
		return "Emp [name=" + name + ",\taddress:" + address + ",\tphone:" + phone 
				+ ",\tsalaryPerMonth=" + salaryPerMonth + ",\ttotalP=" + paymentRate.pay(salaryPerMonth)
				+ "]\n";
	}

	/*
	 * Nivel3
	 * -Redefinimos hereda de clase abstracta 
	 */
	@Override
	public void pay() {
		netMonthlySalary = paymentRate.payNetMonthly(salaryPerMonth);
		grossMonthlySalary = paymentRate.payGrossMonthly(salaryPerMonth);
		netAnnualSalary = netMonthlySalary *12;
		grossAnnualSalary = grossMonthlySalary *12;
		System.out.println("Pagos["
				+ "Nombre:" + name 
				+ " ,\tSalario neto:" + netMonthlySalary
				+ " ,\tSalario bruto:" + grossMonthlySalary
				+ " ,\tSalario neto anual:" + netAnnualSalary
				+ " ,\tSalar bruto anual:" + grossAnnualSalary + "]");		
	}
	
	// redefinimos metodos
	public void setBonus() {
		salaryPerMonth = salaryPerMonth * 1.10;
	}
	
	

}
