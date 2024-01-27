package eserciziDevincentis;

import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int scelta, n;
        Numero num = new Numero();
        do {
            System.out.println("1 - tabellina");
            System.out.println("2 - conta cifre");
            System.out.println("3 - fattoriale");
            System.out.println("4 - tavola pitagorica");
            System.out.println("5 - esci");
            System.out.print("inserisci l'opzione: ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("inserisci un numero:");
                    n = in.nextInt();
                    System.out.println(num.tabellina(n));
                    break;
                case 2:
                    System.out.print("inserisci un numero: ");
                    n = in.nextInt();
                    System.out.println("il numero di cifre è: " + num.numeroCifre(n));
                    break;
                case 3:
                    System.out.print("inserisci un numero: ");
                    n = in.nextInt();
                    System.out.println("il fattoriale del numero è: " + num.fattoriale(n));
                    break;
                case 4:
                    System.out.println("tavola pitagorica: \n" + num.tavPitagorica());
                    break;
                case 5:
                    break;
            }
        } while (scelta != 5);
    }

}