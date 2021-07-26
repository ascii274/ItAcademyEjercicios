package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	// generamos otra clase hija y redefinimos metodos abstractos de la clase super;
	protected double salaryPerMonth;
	private final String description;// valor constante
	protected int bonus;

	//public Volunteer(String name, String address, String phone, String description) throws Exception {
	public Volunteer(String name, String address, String phone, double salaryPerMonth) throws Exception {
		super(name, address, phone);
		
		if(salaryPerMonth > 0) throw new Exception();				
		salaryPerMonth = 0;
		//inicializamos propiedad final description		
		description="No cobra!";	
		
		
	}
	
	@Override
	public void pay() {
		totalPaid=0;		
	}
	
	
	/* Nivel 3. 
	 * - ayuda economica
	 */
	public double governmentEconomicAid() {
		return 300.0;
	}
	

	public String toString() {
		return "Vol [name=" + name + ",\taddress:" + address + ",\tphone:" + phone 
				+ ",\tdescripció=" + description  + ", totalP=" +  totalPaid 
				+ " , Ajut=" + governmentEconomicAid()+ "]\n";
		
	}
	
	public void setBonus() {
		bonus=0;		
	}

}
