package com.jobs.domain;

public class Mid extends Employee {
	public Mid (String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, int tipoEmpleado) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate, tipoEmpleado);
		
	}
	public String toString() {
		return "Mid [name=" + name + ",\taddress:" + address +",\tphone:" + phone 
				+ ",\tsalaryPerMonth=" + salaryPerMonth + ",\ttotalP=" + paymentRate.pay(salaryPerMonth)
				+"]\n";
	}
}
