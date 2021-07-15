

public class Employees {
	// modificadores acceso private solo a la misma clase. desde otro accedemos get/set 	
	private String name;
	private String address;
	private int phone;
	private double salaryPerMonth;
	private double totalP;
	
	public Employees(String name, String address, int phone, int salaryPerMonth) {
		// constructor con nómina
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salaryPerMonth = salaryPerMonth;
		totalP = 0.0;		
	}
	
	public Employees(String name, String address,int phone) {		
		//constructor sin nómina		
		this.name = name;
		this.address = address;
		this.phone = phone;		
		salaryPerMonth = 0.0;
		totalP = 0.0;
	}	

		
	public double calcularPlus(int tipoEmpleado) {		
		//0:volunteer plus 1:Employee 2:Manager 3:Boss1
		double totalPlus=0.0;
		try {	
			switch (tipoEmpleado) {		
				case 0:// volunteer
					totalPlus = 0;
				
				case 1:// employee			
					totalPlus = salaryPerMonth * 0.15;
					break;
				case 2://Manager
					totalPlus = salaryPerMonth * 0.10;
					break;
				case 3://Boss
					totalPlus = salaryPerMonth * 0.50;
					break;	
				}
		} catch (Exception e) {
			System.out.println("Problema para calcular plus de empleado.");
		}
		
		return totalPlus;		
	}
	
	// datos basicos a mostrar
	public void verDatosEmpleado() {
		System.out.println("\nNom:" + name);
		System.out.println("Direcció: " + address);
		System.out.println("Telefón:" + phone);				
	}
	
	// datos salario a mostrar
	public void verSalarioEmpleado(double salarioBase, int tipoEmpleado) {
		//0:Voluntari  1:Employee 2:Manager 3:Boss 4:Senior 5:Mid 6:Junior
		double souNetMensual = 0.0;
		double souBrutMensual = 0.0;	
		double souBrutAnual = 0.0;
		double souNetAnual = 0.0;		
		salaryPerMonth = salarioBase + calcularPlus(tipoEmpleado); 
		System.out.println("Salari base:" + salaryPerMonth);
		souNetMensual = salaryPerMonth - (salaryPerMonth * restarIrpf(tipoEmpleado)/100);
		souBrutMensual = salaryPerMonth;	
		souNetAnual = souNetMensual * 12;
		souBrutAnual = souBrutMensual * 12;
		
		System.out.println("Sou net mensual:" + souNetMensual);
		System.out.println("Sou brut mensual:" + souBrutMensual);
		System.out.println("Sou net Anual:" + souNetAnual);
		System.out.println("Sou brut Anual:" + souBrutAnual);
		System.out.println("Bonus para el año en curso:" + bonus(tipoEmpleado,souBrutAnual));		
	}

	//getter
	public double getSalaryPerMonth() {
		return salaryPerMonth;
	}
	
	// nivell 3
	public double bonus(int tipoEmpleado, double salaryAnual) {
		double bonus=0.0;
		
		try {		
			//bonus =(salaryAnual * 10 ) / 100;
			bonus =salaryAnual * 0.10 ;
			//return bonus;
			salaryPerMonth = salaryPerMonth + bonus;	
		} catch (Exception e) {
			System.out.println("Problemas al aplicar bonus.");
		}		
		return bonus;		
	}
	
	
	// aplicamos irpf dependiendo del trabajador.
	public int restarIrpf(int tipoTrabajador) {
		int irpf=0;
		// funcion que asigna valores de salario en funcion del tipo de trabajador.
		//0:Voluntari?  1:Employee 2:Manager 3:Boss 4:Senior 5:Mid 6:Junior
		try {
			switch (tipoTrabajador) {			
			case 1: // employee: no tiene reducción
				irpf = 0;
				break;
			case 2: // manager
				irpf = 26;
				break;
			case 3: // boss
				irpf = 32;
				break;
			case 4: // Senior
				irpf = 24;
				break;
			case 5: // mid
				irpf = 15;
				break;
			case 6: // junior
				irpf = 2;
				break;
				default:System.out.println("Tipo de empleado inexistente.");
			}
			
		} catch (Exception e) {
			System.out.println("Problemas con método restarIrpf");
		}
		return irpf;
	}	
	

}
