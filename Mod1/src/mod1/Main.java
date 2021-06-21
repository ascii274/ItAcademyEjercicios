
package mod1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nivell 1 fase 1     
        mostraDadesMessi(scanner);  
    }
    
       static void mostraDadesMessi(Scanner scanner){     
        // fase 1
        String  nom = "Lionel",
                cognom1 = "Cuccittini",
                cognom2 = "Messi";
        int dia =24,
            mes = 6, 
            any = 1987;    
        System.out.println("\n***** Dades Messi *****");
        System.out.println( cognom1 + " " + cognom2 + ", " + nom);
        System.out.println(dia + "/" + mes + "/" + any);        
    }
    
}
