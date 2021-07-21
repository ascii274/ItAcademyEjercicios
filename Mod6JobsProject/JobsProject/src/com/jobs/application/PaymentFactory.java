package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {
	
	public static IPaymentRate createPaymentRateBoss(){
		/*
		 * Nota muy importante: repasarme esta forma de hacer un retorno
		 */
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
			//nivel 3. -> el salario bruto y neto lo asignamos directamente al toString ya que son todos iguales (* 12)
			//repasarme como hacerlo de forma que haya menos codigo.
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont)* 0.68;
			}
			
		};
		
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 1.10; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont)* 0.74;
			}
		};
	}
	
		
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.85; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont);
			}
		};
	}
	
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont);
			}
		};
	}
	

	public static IPaymentRate createPaymentRateJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.85; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont)* 0.98;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.90; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont)* 0.85;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth * 0.95; 
			}
			public double payGrossMonthly(double salaryPermont) {				
				return pay(salaryPermont);
			}
			public double payNetMonthly(double salaryPermont) {
				return pay(salaryPermont)* 0.76;
			}
		};
	}
	
	
}
