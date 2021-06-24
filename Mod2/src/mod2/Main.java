package mod2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
    	
        mostraCharNom(); // fase 1 -> ok
        mostraVocalConsonant(); // fase 2 : ->ok
        mostraApareixCaracter(); //fase 3 -> ok
    	fusionarLlistes(); // fase 4 -> ok
    	dibujoNumero(); //nivell 2  fase 1 -> ok
    	System.out.println("\n***** Fin Programa ****");
    }
    
    // nivell 1 fase1
    static void mostraCharNom(){
        int i = 0;        
        char[] misChars = {'J', 'O', 'E', 'L', ' ', 'C', 'A', 'B', 'A', 'T', 'A', 'Y',};
        
        System.out.println("\n***** Mostra nom ***** ");
        while (i < misChars.length) {
            System.out.print(misChars[i] + " ");
            i++;
        }       
        System.out.println("");
    }
    
    // nivell 1 fase 2
    static void mostraVocalConsonant(){
        ArrayList<Character> myArrayList = new ArrayList<Character>();
        String nom = "leo messi";
        int esNumero, contadorNumero=0;
        boolean tieneNumero=false;
        Character myChar;
        System.out.println("\n***** Mostra vocal/consonant *****");
        
        //añadimos las letras al array
        anadimosDatosAarray(nom,myArrayList);	
		// recoremos arrayList
        for (int i = 0; i < myArrayList.size(); i++) {
			myChar = myArrayList.get(i);			
			if (Character.isLetter(myChar)) {
				switch (myChar) {
				case 'a': case 'e': case 'i':case 'o':case'u':				
					System.out.println(myChar + " VOCAL");
					break;
				default:
					System.out.println(myChar + " CONSONANT");
				}
			}
			if(Character.isDigit(myChar)) {
				tieneNumero = true;				
			}
        }
        if(tieneNumero) {
        	System.out.println("El noms contenen números.");
        }
    }
    
    // nivell 1 fase 3
    static void mostraApareixCaracter() {
        HashMap<Integer,Character> myHashmap = new HashMap<Integer,Character>();
        Character miLetra, comparo;
        int contador=0;        
        myHashmap.put(1,'l');
        myHashmap.put(2,'e');
        myHashmap.put(3,'o');                
        myHashmap.put(4, ' ');
        myHashmap.put(5,'m');
        myHashmap.put(6,'e');
        myHashmap.put(7,'s');
        myHashmap.put(8,'s');
        myHashmap.put(9,'i');        
        System.out.println("\n***** Mostra quantitat caracter *****");
        
        for(int i=1; i <= myHashmap.size() ;i++){
            miLetra = myHashmap.get(i);
            contador=0;            
            for(int j=1; j <= myHashmap.size() ; j++){
            	comparo = myHashmap.get(j);

                if(Character.compare(miLetra, comparo)==0){
                    contador ++;
                    // aqui borrar las letras repetidas?
                }
                
            }
                System.out.println("La letra " + miLetra + " aparece: " + contador);
        }
    
    }
    
    // nivell 1 fase 4    
    static void fusionarLlistes() {
    	ArrayList<Character> myArrayNom = new ArrayList<Character>();
    	ArrayList<Character> myArrayCognom = new ArrayList<Character>();
    	String nom = "LEO";
    	String cognom = "MESSI";   
    	int contador=0;
    	
    	// llamamos metodo para llenar array
    	anadimosDatosAarray(nom,myArrayNom);
    	anadimosDatosAarray(cognom,myArrayCognom);
    	
    	// añadimos contenido arrayCognom a nom
    	for(int i=0;i < myArrayCognom.size(); i++) {
    		myArrayNom.add(myArrayCognom.get(i));
    	}
    	System.out.println("\n***** Fusionar Llistes *****");
    	for(Character i: myArrayNom) {
    		System.out.print(i);
    		// despues de la tercera letra añadimos espacio
    		if(contador==2) {
    			System.out.print(" ");
    		}
    		contador ++;
    	}
    	System.out.println(" ");
    }
    
    // metodo para rellenar el array
    static void anadimosDatosAarray(String nom, ArrayList myArray) {
    	for(int i=0;i < nom.length(); i++ ) {
    		myArray.add(nom.charAt(i));
    	}    	
    }
    
 
    static void dibujoNumero() {    	
    	int cant;
    	cant =Integer.parseInt( JOptionPane.showInputDialog("Introduce la cantidad a dibujar: "));
    	for(int i=1; i <= cant; i++) {
    		for(int j=1; j <= i;j++) {
    			System.out.print(j);    			
    		}
    		System.out.println("");
    	}    	
    	System.out.println();   	
    }
    
    
}



















