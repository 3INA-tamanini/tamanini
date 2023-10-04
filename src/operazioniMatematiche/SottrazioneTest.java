
package operazioniMatematiche;

import java.util.Scanner;

public class SottrazioneTest {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float risultato;
        float n1, n2;
        System.out.print("inserisci il primo numero: ");
        n1 = input.nextFloat();
        System.out.print("inserisci il secondo numero: ");
        n2 = input.nextFloat();
        Sottrazione sottrazione = new Sottrazione(n1, n2);
        
        n1 = sottrazione.n1;
        n2 = sottrazione.n2;
        risultato = sottrazione.esegui();
        
        System.out.println("primo numero  : " + n1);
        System.out.println("secondo numero: " + n2);
        System.out.println("risultato      : " + risultato);
    }
    
}
