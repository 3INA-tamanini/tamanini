package Data;

import java.util.Scanner;

public class DataTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("inserisci il giorno: ");
        int g = in.nextInt();
        System.out.print("inserisci il mese: ");
        int m = in.nextInt();
        System.out.print("inserisci l'anno: ");
        int a = in.nextInt();

        Data d = new Data();

        d.setG(g);
        d.setM(m);
        d.setA(a);
        System.out.println(Data.isValida());
        System.out.println(Data.info());

        System.out.print("inserisci l'altro giorno: ");
        int g2 = in.nextInt();
        System.out.print("inserisci l'altro mese: ");
        int m2 = in.nextInt();
        System.out.print("inserisci l'altro anno: ");
        int a2 = in.nextInt();

        System.out.println("tra il " + Data.info() + " e il " + Data.info2(g2, m2, a2) + " sono passati "
                + Data.nGiorni(g2, m2, a2) + " giorni");
    in.close();}
}
