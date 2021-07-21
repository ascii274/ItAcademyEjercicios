package com.jobs.domain;

public interface IPaymentRate {
	//ojo interface. sin constructor y métodos sin cuerpo 
	public double pay(double salaryPerMonth);	
	public double payGrossMonthly(double salaryPermont);
	public double payNetMonthly(double salaryPerMont);

	/*preguntar: 
	Aqui puedo crear los métodos paa los salarios brutos,netos.?
	- tendria que modificar PaymentFactory.java-> como?
	*/
	
	
	
}
