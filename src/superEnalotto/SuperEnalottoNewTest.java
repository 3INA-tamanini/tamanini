package superEnalotto;

import java.util.Scanner;

public class SuperEnalottoNewTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        SuperEnalottoNew s = new SuperEnalottoNew();

        int numeri[] = new int[6];
        int[] numeroCorretto = SuperEnalottoNew.superEnalottoNoNumeriRipetuti();
        for (int i = 0; i < numeri.length; i++) {
            System.out.print("inserisci un numero: ");
            n = in.nextInt();
            numeri[i] = n;
        }
        System.out.println("\n");
        System.out.print("la tua combinazione: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + " ");
        }
        System.out.println("\n");
        
        
        System.out.println("combinazione corretta: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeroCorretto[i] + " ");
        }
        System.out.println("\n");
        
        
        /*for (int i = 0; i < numeri.length; i++) {
            for (int j = 0; j < numeri.length; j++) {
                if (numeri[i] == numeroCorretto[j]) {
                    System.out.println("il numero " + (i + 1) + " è corretto");
                }
            }

        } */
        
        System.out.println(SuperEnalottoNew.isVinto(numeri));
    }
}