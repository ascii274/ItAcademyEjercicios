
package mod1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nivell 1 fase 1     
        mostraDadesMessi(scanner);  
        //nivell 1  fase 2 
        anyTraspas();               
        //nivell 1 fase 3
        esAnyDeTraspas();           
        // nivell 1  fase 4
        mostraDadesIany(); 
        //nivell 2
        mostraCastingDades();        
        //nivell 3
        rotarArray();        
        System.out.println("\n********** Fin programa **********");
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
       
           static void anyTraspas(){
        // fase 2
        int any=1948, anyNaixement = 1987;
        int cantCicle=0;
        System.out.println("\n***** Any traspàs. *****");
        System.out.println("Anys de traspàs des de " + any + " fins " + anyNaixement +": ");        
        do {
            if(any % 4==0){
                System.out.print(any + " ");
                cantCicle++;
            }
            any ++;            
        } while (any <= anyNaixement);                
        System.out.println("\nNombre d'anys desde " + any +" fins " + anyNaixement +": " + cantCicle);
    }
    
    static void esAnyDeTraspas(){
        // fase3
        boolean anyTraspas = false;
        String esTraspas =  "L'any 1987 és traspàs.";
        String noEsTraspas = "L'any 1987 no es de traspàs.";
        System.out.println("\n***** Any de traspas. *****");
        if(1987 % 4==0){
            anyTraspas = true;
        }
        if(anyTraspas){
            System.out.println(esTraspas);
        }else{
            System.out.println(noEsTraspas);
        }
    }
    
    static void mostraDadesIany(){
        // fase 4
        String nomCognom = "Lionel Messi Cuccittini";
        String dataNeix = "24/06/1987";
        int any;
        System.out.println("\n***** Mostra dades i any *****");
        any = Integer.parseInt(dataNeix.substring(6, 10)); // sacamos el año y convertimos en integer
        System.out.println("El meu nom és: " + nomCognom);
        System.out.println("Vaig nèixer el: " + dataNeix);
        if(any % 4 == 0){
            System.out.println("L'any " + any +  " es de traspàs");
        }else{
            System.out.println("L'any " + any +  " no es de traspàs");
        }
    }
    
    static void mostraCastingDades(){
        //nivell 2
        double dNum = 3.1416;
        int iNum;
        float fNum;
        String strNum;        
        System.out.println("\n***** Casting dades *****");
        iNum = (int) dNum;
        fNum = (float) dNum;
        strNum = Double.toString(dNum);
        System.out.println("El integer de "+ dNum + " es: " + iNum);
        System.out.println("El float de " + dNum + " es: " + fNum);
        System.out.println("El String de " + dNum + " es: " + strNum);
    }
    static void rotarArray(){
        //M1:Exercici 3
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("\n***** Dades Array *****");
        System.out.println("El contenido del array es: ");        
        for(int i=0; i<9; i++){
            System.out.print(array[i] + " ");            
        }
        System.out.println(""); //salto linea       
        for(int j=9; j>=0; j--){
            System.out.print(array[j] + " ");                        
        }   
        System.out.println(""); //salto linea       
    }
    
}
