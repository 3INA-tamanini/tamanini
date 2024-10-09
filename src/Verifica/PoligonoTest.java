package Verifica;

import java.util.Scanner;

public class PoligonoTest {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    float l;

    System.out.print("inserisci il numero dei lati: ");
    n = in.nextInt();

    System.out.print("inserisci il lato del poligono: ");
    l = in.nextFloat();

    Poligono p = new Poligono(n, l);

    System.out.println("il poligono è: " + p.tipo());
    System.out.println("il perimetro è: " + p.perimetro());
    in.close();

    }
}
