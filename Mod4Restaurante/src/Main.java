import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static private String plats[] = new String[10];
    static private int preus[]=new int[10];
    static private ArrayList<String> miPedido = new ArrayList<String>();

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int numPlat =-1, preuTotal=0;

        llenarCartaPrecios();
    	mostraCarta();
        System.out.println("\nUnidades pedidas: " + miPedido.size());
        do{            
            System.out.println("Escoja un plato:");
            numPlat = scanner.nextInt();
            //añadimos platos y controlamos error de numero de plato
            try {
                agregarPedido(numPlat);
            } catch (IOException e) {
                System.out.println("El número de plato No existe.");
            }

            numPlat=seguirPidiendo(scanner,numPlat);// si es 0:salir 1:continuamos pidiendo

           //muestro los platos? dejo el codigo.
            /*
            for(int k=0; k< miPedido.size();k++) {
            	System.out.println("Los platos: " + miPedido.get(k));
            }
            */
            preuTotal=verTotalPedido();
            // sumamos el pedido y mostramos
            //System.out.println("Preu total: "+ preuTotal);
            System.out.println("\nUnidades pedidas: " + miPedido.size());

        }while (numPlat !=0);
        pagar(preuTotal);

    	System.out.println("\n***** Fin Programa *****");
    	scanner.close();
    }

    //static int seguirPidiendo(Scanner scanner, int numeroPlato) throws IOException {
    static int seguirPidiendo(Scanner scanner, int numeroPlato) {
        int opcPedir = -1;
        do{
            try{
                System.out.println("Desea pedir mas? (1:Si/0:No)");
                opcPedir = scanner.nextInt();
                if (opcPedir == 0) { // forzamos salida si es el caso
                    numeroPlato = 0; // plato 0: salir del bucle
                } else if (opcPedir == 1) {
                    numeroPlato = 1;
                } else {
                    // fuerzo exception
                    throw new IOException();
                }
            }catch (Exception e){
                System.out.println("Solo opcones: 0 al 1.");
            }
        }while (opcPedir > 1);
        return numeroPlato; // plato 0: salir
    }

    static void agregarPedido(int numeroPlat) throws IOException{
        //añadimos platos
        if(numeroPlat > 0 && numeroPlat <=plats.length ) {
            // calculamos hasta 10 por la numeracion de los platos que empieza en 1
            miPedido.add(plats[numeroPlat-1]);// añadimos el nombre del plato
            System.out.println("Plato añadido: " + plats[numeroPlat-1]);
        } else {
            //System.out.println("El plato no existe");
            throw new IOException();
        }
    }

    static int verTotalPedido() {
        int totalPedido=0;
    	// comparamos listaPedido vs plats[]  mostramos el total del pedido
    	for(int i=0; i<miPedido.size();i++) {
    		for(int j=0; j<plats.length ;j++) {
    			if(miPedido.get(i).equals(plats[j])) { // true
                    totalPedido =totalPedido+ preus[j];//
    			}
    		}
    	}
        return totalPedido;
    }
    
    
    // mostramos carta, precioTotal
    static void mostraCarta(){
        int pTotal=0;
        if(plats != null && preus !=null){
            System.out.println("\n ***** Carta ******");
            for(int i=0; i< 10; i++){
                int j=i+1; // numeramos platos
                System.out.println(j+"."+plats[i] + " preu [" + preus[i] +"]");
            }
            System.out.println("0. Salir");
            // mostramos total pedido hasta ahora
            //System.out.println("Total pedido: " + pTotal + " euros.");
        }else {
            System.out.println("Carta vacía");
        }
    }

    // volcamos el contenido el HashMap a array: plats y preus
    static void llenarCartaPrecios(){
        int contador=0;
        HashMap<String,Integer> preuPlats = new HashMap<String,Integer>();
        preuPlats.put("Bufalina",12);
        preuPlats.put("4 Formaggi",12);
        preuPlats.put("Pino Daniele",18);
        preuPlats.put("Margharita",9 );
        preuPlats.put("Prosciutto",10);
        preuPlats.put("Parmigianna",11);
        preuPlats.put("Al tonno",13);
        preuPlats.put("Carbonara",11);
        preuPlats.put("Masimo Troise",17);
        preuPlats.put("Ortolana ",12);
        
        for (Map.Entry<String,Integer> entrada:preuPlats.entrySet()){
            plats[contador] = entrada.getKey();
            preus[contador] = entrada.getValue();
            contador++;//
        }
    }

    static void pagar(int preuTotal){
        int preuTotalInicial = preuTotal;
        int mUn=0, mDos=0, bCinco=0, bDiez=0, bVeinte=0, bCincuenta=0, bCien=0, bDoscien=0, bCincoCien = 0;
        System.out.println("\n***** Pagar con lo siguiente *****");
        if(preuTotal>=500){
            bCincoCien = preuTotal / 500;
            System.out.println(bCincoCien +" billetes de 500 ");
        }
        preuTotal = preuTotal % 500;

        if(preuTotal >= 200){
            bDoscien = preuTotal / 200;
            System.out.println(bDoscien + " billetes de 200 ");
        }
        preuTotal = preuTotal % 200;

        if(preuTotal >=100){
            bCien = preuTotal / 100;
            System.out.println(bCien + " billetes de 100 ");
        }
        preuTotal = preuTotal % 100;

        if(preuTotal >=50){
            bCincuenta = preuTotal / 50;
            System.out.println(bCincuenta + " billetes de 50 ");
        }
        preuTotal = preuTotal%50;

        if(preuTotal>=20){
            bVeinte = preuTotal / 20;
            System.out.println(bVeinte + " billetes de 20 ");
        }
        preuTotal  = preuTotal % 20;

        if(preuTotal>=10){
            bDiez = preuTotal / 10;
            System.out.println(bDiez + " billetes de 10 ");

        }
        preuTotal = preuTotal % 10;

        if(preuTotal >=5 ){
            bCinco = preuTotal / 5;
            System.out.println(bCinco + " billetes de 5 ");
        }
        preuTotal = preuTotal % 5;

        if(preuTotal >=2 ){
            mDos = preuTotal /2;
            System.out.println(mDos + " monedas de 2 ");
        }
        preuTotal = preuTotal % 2;

        if(preuTotal>=1){
            mUn = preuTotal/1;
            System.out.println(mUn + " monedas de 1 ");
        }
        System.out.println("Total: " + preuTotalInicial + " euros");
    }

}
