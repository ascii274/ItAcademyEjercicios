package com.jobs.domain;

public class Employee extends AbsStaffMember {
	// generamos clase hija y redefnimos su metodos

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;	
	protected double netMonthlySalary;
	protected double grossMonthlySalary;
	protected double netAnnualSalary;
	protected double grossAnnualSalary;		

	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
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
