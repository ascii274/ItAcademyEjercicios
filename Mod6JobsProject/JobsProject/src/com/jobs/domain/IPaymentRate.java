package com.jobs.domain;

public interface IPaymentRate {
	//ojo interface. sin constructor y métodos sin cuerpo 
	public double pay(double salaryPerMonth);	
	public double payGrossMonthly(double salaryPerMonth);
	public double payNetMonthly(double salaryPerMonth);
	//public void yearlyBonus(double salaryPerMonth);

	/*pregunto a mi mismo: 
	Aqui puedo crear los métodos para los salarios brutos,netos.?
	*/
	
}
