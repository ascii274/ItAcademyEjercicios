import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		enterCitutaImostra(scanner); // nivell 1 fase 1
		ordenaCiutat(scanner); // nivell 1 fase 2
		cambiaNomsPelNumero(scanner); // nivell 1 fase 3
		ciutatsNomInvertits(); // nivell 1 fase 4
		notesAlumnes(scanner); // nivell 2
		sequenciaFibonacci(); // nivell 4
		System.out.println("\n***** Fin Programa ****");
	}
	
	// nivell 1 fase 1
	static void enterCitutaImostra(Scanner scanner) {
		String nom1,nom2,nom3,nom4,nom5,nom6;
		System.out.println("\n ***** Intro de ciudades *****");

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
	/*
	 * metode per guardar ciutats en un array i retorna array
	 */
	static ArrayList<String> enterCiutatArray(Scanner scanner){		
		ArrayList<String> misCiudades = new ArrayList<String>();		
		String nomCiutat;
		int cantCiutat;
		System.out.println("\nIntroduce la cantidad de ciudad a introducir:");
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
		// ordenamos el nuevo array ciudadesModificadas.
		Collections.sort(ciudadesModificadas);
		System.out.println("\n ***** Cambiando caracter a por 4 *****");
		for (String c : ciudadesModificadas) {
			System.out.println(c);
		}
	}

	static void ciutatsNomInvertits(){
		ArrayList<String>  misCiudades = new ArrayList<String>();
		misCiudades.add("Roma");
		misCiudades.add("Lisboa");
		misCiudades.add("Napoles");
		misCiudades.add("Berlin");
		misCiudades.add("Barcelona");
		misCiudades.add("Madrid");
		char[] roma	= new char [misCiudades.get(0).length()];
		//pasamos textos a array
		System.out.println("\n***** Ciutats invertits *****");
		for ( String m:misCiudades){
			char[] miChar = new char[m.length()];
			m.getChars(0,m.length(),miChar,0);
			System.out.print(m + "-" );
			verCiudadReves(miChar);
		}
	}

	/*
	 * muestra el contenido de array de revés
	 */
	static void verCiudadReves(char[] miCharArray){
		for(int i = miCharArray.length-1; i>=0;i--){
			System.out.print(miCharArray[i]);
		}
		System.out.println();
	}

	// nivell 2
	static void notesAlumnes(Scanner scanner){
		double notas [][] = new double[5][3];
		int numAlumno=0, opc=-1;
		while(opc !=0){
			System.out.println("\n ***** Registro notas *****");
			System.out.println("1.Alta notas.");
			System.out.println("0.Salir.");
			opc = scanner.nextInt();
			switch (opc){
				case 1:
					//System.out.println("Hola");
					if(numAlumno < 5){
						introNotas(scanner,notas,numAlumno);
						numAlumno ++;
					}else {
						System.out.println("Todas las notas están introducidas.");
					}
					break;
				default:
					System.out.println("Debe selecionar una opción.");
			}
			mediaNotas(notas);
		}
	}
	/*
	 * pide las notas e introduce en el array
	 */
	static void introNotas(Scanner scanner, double misNotas[][], int alumno){
		double nota;
		int contadorNotas = 0;
		for(int i=0; i<3; i++){
			System.out.println("Introduce la nota: ");
			nota = scanner.nextDouble();
			misNotas[alumno][i]=nota;
		}
	}

	/*
	 * recorre el array y muestra la media de las notas
	 */
	static void mediaNotas( double misNotas[][]){
		double mediaNota=0.0;
		int numAlumno=0;
		for(int i=0; i<misNotas.length;i++){
			for(int j=0;j<misNotas[i].length;j++){
				mediaNota = mediaNota + misNotas[i][j];
			}
			numAlumno = i+1;
			mediaNota = mediaNota / 3;
			if(mediaNota >=5 && mediaNota<= 10){
				System.out.println("L'alumne " + numAlumno + " ha aprovat amb " + mediaNota);
			}else {
				System.out.println("L'alumne " + numAlumno + " ha suspés amb " + mediaNota);
			}
			mediaNota = 0.0;
		}
	}

	// nivell 3
	static void sequenciaFibonacci(){
		ArrayList<Integer> misNumeros = new ArrayList<Integer>();
		int siguienteNumero;
		misNumeros.add(0);
		misNumeros.add(1);
		for(int i=0;i<5;i++){
			siguienteNumero = misNumeros.get(misNumeros.size()-2) + misNumeros.get(misNumeros.size()-1);
			misNumeros.add(siguienteNumero);
		}

		System.out.println("\n***** Sequència Fibonacci *****");
		for(int j=0;j<misNumeros.size();j++){
			System.out.print(misNumeros.get(j) + " ");
		}
	}

}
