package Verifica;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Poligono p = null;
        int valore, n;
        float l;
        boolean istanza = false, set = false;
        do {
            System.out.println("MENU");
            System.out.println("1 - Costruttore senza parametri");
            System.out.println("2 - Costruttore con parametri");
            System.out.println("3 - calcolare il perimetro");
            System.out.println("4 - Per uscire dal menu");

            System.out.print("inserire il valore desiderato: ");
            valore = in.nextInt();

            switch (valore) {
                case 1:
                    p = new Poligono();
                    istanza = true;
                    break;
                case 2:
                    System.out.print("inserire il numero dei lati: ");
                    n = in.nextInt();
                    p.setN(n);
                    System.out.print("inserire il lato: ");
                    l = in.nextFloat();
                    p.setL(l);
                    set = true;
                    break;
                case 3:
                    if(p.isPoligono())
                        System.out.println("perimetro: "+ p.perimetro());
                    else
                        System.out.println("dati errati, reinserire");
                    break;
                default:
                    System.out.println("\nscelta errata\n");
            }
        } while (valore != 4);

    }

}