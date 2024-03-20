package Verifica;

import java.util.Scanner;

/**
 * @version 1.0
 * @author tamanini
 */
public class DivisoriMultipli {

    /**
     * metodo statico per calcolare il numero di divisori positivi di un numero
     *
     * @param n
     * @return int
     */
    public static int numeroDivisori(int n) {
        int i = 1;
        int cont = 0;
        while (i <= n) {
            if (n % i == 0) {
                cont++;
            }
            i++;
        }
        return cont;
    }

    /**
     * metodo statico per calcolare la somma dei primi n multipli di un numero
     *
     * @param n
     * @param m
     * @return int
     */
    public static int sommaMultipli(int n, int m) {
        int somma = 0;
        int multipli = n;
        for (int i = 1; i <= m; i++) {
            multipli +=n;
            somma+=multipli;
        }
        return somma;
    }

    public static void main(String[] args) {
        int scelta = 0;
        int n;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1 - calcolare il numero dei divisori");
            System.out.println("2 - calcolare la somma dei primi m multipli");
            System.out.println("3 - esci");
            System.out.print("inserisci l'opzione: ");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("inserisci il numero: ");
                    n = in.nextInt();
                    System.out.println("i divisori sono " + DivisoriMultipli.numeroDivisori(n));
                    break;
                case 2:
                    System.out.print("inserisci il numero: ");
                    n = in.nextInt();
                    System.out.print("inserisci quanti multipli sommare: ");
                    int m = in.nextInt();
                    System.out.println("la somma è: " + DivisoriMultipli.sommaMultipli(n, m));
                case 3:
                    break;
                default:
                    System.out.println("numero errato, riprova");
                    scelta = 0;
            }
        } while (scelta < 3);

    }

}