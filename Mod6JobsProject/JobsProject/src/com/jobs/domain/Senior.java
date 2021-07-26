package com.jobs.domain;

public class Senior extends Employee{
	public Senior (String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate, int tipoEmpleado) throws Exception{
		super(name, address, phone, salaryPerMonth, paymentRate, tipoEmpleado);
	}
	
	public String toString() {
		return "Sen [name=" + name + ",\taddress:" + address +", phone:" + phone 
				+ ",\tsalaryPerMonth=" + salaryPerMonth + ",\ttotalP=" + paymentRate.pay(salaryPerMonth)
				+"]\n";
	}

}
