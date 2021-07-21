package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	private final String description;// valor constante

	//public Volunteer(String name, String address, String phone, String description) throws Exception {
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);		
		//inicializamos propiedad final description		
		description="No cobra!";		
	}
	
	@Override
	public void pay() {
		totalPaid=0;		
	}
	
	// ayuda economica
	public double governmentEconomicAid() {
		return 300.0;
	}
	

	public String toString() {
		return "Vol [name=" + name + ", address:" + address +", phone:" + phone 
				+ ", descripció=" + description  + ", totalP=" +  totalPaid 
				+ " , Ajut=" + governmentEconomicAid()+ "]\n";
		
	}

}
