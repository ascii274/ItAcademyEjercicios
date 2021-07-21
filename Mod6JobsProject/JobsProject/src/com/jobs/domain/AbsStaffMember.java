package com.jobs.domain;

public abstract class AbsStaffMember {
	//generamos clase base

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double totalPaid=0;

	

	private static int COUNTER_MEMBERS = 1;

	public AbsStaffMember(String name, String address, String phone) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();

		this.name = name;
		this.address = address;
		this.phone = phone;
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}
	
	// generamos metodos sin cuerpo para que sea redefinido en clases hijos.
	public abstract void pay();
	public abstract String toString();
	//nivell 3
	public abstract void setBonus();
	
	
}
