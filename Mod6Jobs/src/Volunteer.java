import javax.sound.midi.Soundbank;

public class Volunteer extends Employees{
	String descripcio;
	public Volunteer(String name, String address,int phone) {
		super(name, address, phone);	
		descripcio="No cobra";
	}
	
	
	public double ayudaGobernamental() {
		return 300;
	}
	
	public void verDatosEmpleado() {
		// sobreescritura super.metodo para mostrar datos propios de la clase
		super.verDatosEmpleado();
		System.out.println("Ayuda governamental: " + ayudaGobernamental());
	}
	

}
