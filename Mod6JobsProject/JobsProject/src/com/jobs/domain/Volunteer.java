package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	private final String description;// valor constante

	//public Volunteer(String name, String address, String phone, String description) throws Exception {
	public Volunteer(String name, String address, String phone) throws Exception {
		super(name, address, phone);
		
		//inicializamos propiedad final description
		
		description="No cobra!";
		totalPaid = 0;
	}

	
	@Override
	public void pay() {
		//TODO
		
	}
	

	public String toString() {
		return "Vol [name=" + name + ", address:" + address +", phone:" + phone 
				+ ", descripció=" + description  + ", totalP=" +  totalPaid + "]\n";
		
	}

}
