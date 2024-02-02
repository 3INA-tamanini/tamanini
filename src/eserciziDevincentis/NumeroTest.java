package eserciziDevincentis;

import java.util.Scanner;
import java.util.Random;

public class NumeroTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int scelta, n;
        Numero num = new Numero();
        Random r = new Random();
        do {
            System.out.println("1 - tabellina");
            System.out.println("2 - conta cifre");
            System.out.println("3 - fattoriale");
            System.out.println("4 - tavola pitagorica");
            System.out.println("5 - indovina numero");
            System.out.println("6 - esci");
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
                    int continua = 0;
                    int numero = 0;
                    int numCorretto = r.nextInt(11);
                    do {
                        while (num.indovinaNumero(numero, numCorretto) != "corretto" || continua==1) {
                            System.out.print("indovina il numero da 0 a 10: ");
                            numero = in.nextInt();
                            System.out.println(num.indovinaNumero(numero, numCorretto));
                        }
                        System.out.println("Vuoi continuare?[1=si/0=no]");
                        continua = in.nextInt();
                        if(continua == 1){
                            numCorretto = r.nextInt(11);
                        }
                    } while (continua == 1);
                    break;
                case 6:
                    break;
            }
        } while (scelta != 6);
    }

}