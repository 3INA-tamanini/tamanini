package biglietti;

import java.util.Scanner;
public class BigliettoFerroviarioTest {

    
    public static void main(String[] args) {
        float costo;
        String condizione;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("inserisci un'eventuale condizione: ");
        condizione = in.nextLine();
        System.out.print("inserisci il costo del biglietto: ");
        costo = in.nextFloat();
       
        BigliettoFerroviario b = new BigliettoFerroviario(costo, condizione);
        System.out.println(b.info());
        System.out.println("il costo del biglietto  è: " + b.costoTot());
        
    }
    
}
