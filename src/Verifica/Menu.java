package Verifica;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Poligono p;
        int valore, n;
        float l;

        do {
            System.out.println("MENU");
            System.out.println("1 - Costruttore senza parametri");
            System.out.println("2 - Costruttore con parametri");
            System.out.println("3 - calcolare il perimetro");
            System.out.println("4 - Per usire dal menu");

            System.out.print("inserire il valore desiderato: ");
            valore = in.nextInt();

            switch (valore) {
                case 1:
                    p = new Poligono();
                    break;
                case 2:
                    System.out.print("inserire il numero dei lati: ");
                    n = in.nextInt();
                    System.out.print("inserire il lato: ");
                    l = in.nextFloat();
                    
                    p = new Poligono(n,l);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("\nscelta errata\n");
            }
        } while (valore != 4);

    }

}
