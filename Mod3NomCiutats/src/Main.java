import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		//enterCitutaImostra(scanner); // nivell 1 fase 1
		//ordenaCiutat(scanner); // nivell 1 fase 2
		cambiaNomsPelNumero(scanner); // nivell 1 fase 3

	}
	
	// nivell 1 fase 1
	static void enterCitutaImostra(Scanner scanner) {
		String nom1,nom2,nom3,nom4,nom5,nom6;
		
		System.out.println("Introduce un nombre de ciudad 1/6: ");
		nom1 = scanner.nextLine();
		System.out.println("Introduce un nombre de ciudad 2/6: ");
		nom2 = scanner.nextLine();
		System.out.println("Introduce un nombre de ciudad 3/6: ");
		nom3 = scanner.nextLine();
		System.out.println("Introduce un nombre de ciudad 4/6: ");
		nom4 = scanner.nextLine();
		System.out.println("Introduce un nombre de ciudad5 5/6: ");
		nom5 = scanner.nextLine();
		System.out.println("Introduce un nombre de ciudad6: 6/6");
		nom6 = scanner.nextLine();
		
		System.out.println("\n***** Las ciudades introducidas son *****");
		System.out.println("La ciudad 1: " + nom1);
		System.out.println("La ciudad 2: " + nom2);
		System.out.println("La ciudad 3: " + nom3);
		System.out.println("La ciudad 4: " + nom4);
		System.out.println("La ciudad 5: " + nom5);
		System.out.println("La ciudad 6: " + nom6);
		
		
	}
	
	// metode per guardar ciutats en un array i retorna array
	static ArrayList<String> enterCiutatArray(Scanner scanner){		
		ArrayList<String> misCiudades = new ArrayList<String>();		
		String nomCiutat;
		int cantCiutat;
		System.out.println("Introduce la cantidad de ciudad a introducir:");
		cantCiutat = scanner.nextInt();
		scanner.nextLine();		
		for(int i=0; i<cantCiutat; i++) {
			System.out.println("Itroduce el nombre de la ciudad:");
			nomCiutat = scanner.nextLine();
			misCiudades.add(nomCiutat);
		}
		return misCiudades;		
	}
	
	// nivell 1 fase 2
	static void ordenaCiutat(Scanner scanner ) {
		ArrayList<String> misCiudades = new ArrayList<String>();
		// llamamos metodo
		misCiudades = enterCiutatArray(scanner);		
		Collections.sort(misCiudades);
		System.out.println("\n***** Las ciudades ordenadas *****");
		for( String s:misCiudades) {
			System.out.println(s);
		}
		
	}
	
	// nivell 1 fase 3
	static void cambiaNomsPelNumero(Scanner scanner) {
		ArrayList<String> misCiudades = new ArrayList<String>();
		ArrayList<String> ciudadesModificadas = new ArrayList<String>();
		String nomCiudad;
		//rellenamos array ciudad
		misCiudades = enterCiutatArray(scanner);
		// recorremos array misciudades y volcamos a nuevo array
		for (int j = 0; j < misCiudades.size(); j++) {
			nomCiudad = misCiudades.get(j).replace('a', '4');
			ciudadesModificadas.add(nomCiudad);
		}
		Collections.sort(ciudadesModificadas);
		System.out.println("\n ***** Cambiando caracter a por 4 *****");
		for (String c : ciudadesModificadas) {
			System.out.println(c);
		}
		
	}

}
