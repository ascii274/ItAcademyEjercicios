package com.jobs.domain;

public class Junior extends Employee{
	
	public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate);
	}
	
	public String toString() {
		return "Jun [name=" + name + ",\taddress:" + address +",\tphone:" + phone 
				+ ",\tsalaryPerMonth=" + salaryPerMonth + ",\ttotalP=" + paymentRate.pay(salaryPerMonth)				
				+"]\n";
	}
	

}
