package tris;

import java.util.Scanner;

public class Tamanini2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci il nome del giocatore con la X: ");
        String giocatoreX = in.next();
        System.out.println("inserisci il nome del giocatore con la O: ");
        String giocatoreO = in.next();
        TrisErrato t = new TrisErrato(3, giocatoreX, giocatoreO);
        int x, y;
        String vinto = "";
        do {
            System.out.println("inserisci la X");
            x = in.nextInt();
            System.out.println("inserisci la Y");
            y = in.nextInt();
            vinto = t.gioca(x, y);
            System.out.println(t.info());
        } while (vinto.equals(""));

        if (vinto.equals("X"))
            System.out.println("vince " + giocatoreX);
        if (vinto.equals("O"))
            System.out.println("vince " + giocatoreO);
        if (vinto.equals("="))
            System.out.println("pareggio");
        in.close();
    }

}
