package com.jobs.domain;

public class Employee extends AbsStaffMember {

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

	
	@Override
	public void pay() {
		netMonthlySalary = paymentRate.payNetMonthly(salaryPerMonth);
		grossMonthlySalary = paymentRate.payGrossMonthly(salaryPerMonth);
		netAnnualSalary = netMonthlySalary *12;
		grossAnnualSalary = grossMonthlySalary *12;
		
	}
	
	// redefinimos por heredar de una clase abstracta 
	public String toString() {
		return "Emp [name=" + name + " ,address:" + address +" ,phone:" + phone 
				+ " ,salaryPerMonth=" + salaryPerMonth + " ,totalP=" + paymentRate.pay(salaryPerMonth) 				
				+ " ,salaryGrossMonthly=" + paymentRate.payGrossMonthly(salaryPerMonth) 
				+ " ,salaryNetMonthly=" + paymentRate.payNetMonthly(salaryPerMonth)
				+ " ,salaryGrossYearly=" + paymentRate.payGrossMonthly(salaryPerMonth)*12 
				+ " ,salaryNetYearly=" + paymentRate.payNetMonthly(salaryPerMonth)*12				
				+ "]\n";
	}

}
