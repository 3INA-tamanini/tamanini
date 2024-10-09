package biglietti;

import java.util.Scanner;
public class BigliettoFerroviarioTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float costo;
        String condizione;
        
        System.out.print("P = pensionato: \n" + "S = studente \n" + "D = disoccupato \n" + "non premere niente se non sei \n" + "inserisci: ");
        condizione = in.nextLine();

        System.out.print("inserisci il costo del biglietto: ");
        costo = in.nextFloat();

        BigliettoFerroviario b = new BigliettoFerroviario(costo, condizione);
        System.out.println(b.info());
        System.out.println("il costo finale del biglietto è: " + b.costoTot() + " euro");
        in.close();
    }
    
}
