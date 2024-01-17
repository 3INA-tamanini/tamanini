package Verifica;

import java.util.Scanner;

public class PoligonoTest2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Poligono p = new Poligono();

        int nLati;
        float lato;

        do {
            System.out.print("inserisci il numero di lati: ");
            nLati = in.nextInt();
            p.setN(nLati);

            System.out.print("inserisci il lato: ");
            lato = in.nextFloat();
            p.setL(lato);
        } while (!p.isPoligono());

        System.out.println(p.info());
        System.out.println(p.tipo());
        System.out.println(p.perimetro());
    }

}
