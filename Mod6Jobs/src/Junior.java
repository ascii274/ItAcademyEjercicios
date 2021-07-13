

public class Junior extends Employees {
	private double salaryPerMonth;
	public Junior(String name, String address,int phone,int salaryPerMonth) {
		super(name, address, phone);
		this.salaryPerMonth = salaryPerMonth;
	}
	
	public void verDatosEmpleado() {
		System.out.println("\nNombre:" + super.getName());
		System.out.println("Address: " + super.getAddress());
		System.out.println("Phone: " + super.getPhone());
		System.out.println("Salary per month: " + salaryPerMonth);
	}

	
	

}
