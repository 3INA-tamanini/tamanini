package operazioniMatematiche;

import java.util.Scanner;

public class SommaTest {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float risultato;
        float n1,n2;
        
        System.out.print("inserisci il primo numero: ");
        n1 = input.nextFloat();
        System.out.print("inserisci il secondo numero: ");
        n2 = input.nextFloat();
        Somma somma = new Somma(n1, n2);
        
        
        n1 = somma.n1;
        n2 = somma.n2;
        risultato = somma.Esegui();
        
        System.out.println("numero 1: " + n1);
        System.out.println("numero 2: " + n2);
        System.out.println(risultato);
    }
    
}