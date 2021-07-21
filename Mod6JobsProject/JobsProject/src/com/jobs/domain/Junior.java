package com.jobs.domain;

public class Junior extends Employee{
	
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate);
	}
	
	public String toString() {
		return "Jun [name=" + name + ", address:" + address +", phone:" + phone 
				+ ", salaryPerMonth=" + salaryPerMonth + ", totalP=" + paymentRate.pay(salaryPerMonth)
				+ " ,salaryGrossMonthly=" + paymentRate.payGrossMonthly(salaryPerMonth) 
				+ " ,salaryNetMonthly=" + paymentRate.payNetMonthly(salaryPerMonth)
				+ " ,salaryGrossYearly=" + paymentRate.payGrossMonthly(salaryPerMonth)*12 
				+ " ,salaryNetYearly=" + paymentRate.payNetMonthly(salaryPerMonth)*12
				
				+"]\n";
	}
	

}
