package forza4;

import java.util.Scanner;

public class Forza4 {

    private static final int RIGHE = 6, COLONNE = 7;
    private String[][] campo;
    private String giocatore = "X";

    public Forza4() {
        campo = new String[RIGHE][COLONNE];
        inizializzaCampo();
    }

    private String[][] inizializzaCampo() {

        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                campo[i][j] = " - ";

            }
        }
        return campo;
    }

    public String info() {
        String info = "";
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                info += campo[i][j];
            }
            info += "\n";
        }
        return info;
    }

    public void inserisciSimbolo(int colonna) {
        for (int i = 0; i < RIGHE; i++) {
            if (campo[i][colonna] == "O" || campo[i][colonna] == "X") {
                campo[i--][colonna] = giocatore;
            } else {
                if (campo[i][colonna] == " - " && campo[i][colonna] == "O" || campo[i][colonna] == "X") {
                    campo[i][colonna] = giocatore;
                    i++;
                }

            } 
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Forza4 f = new Forza4();
        int x;
        System.out.println(f.info());
        System.out.print("inserisci la colonna in cui inserire il simbolo: ");
        x = in.nextInt();
        f.inserisciSimbolo(x);
        System.out.println(f.info());
        in.close();
    }
}
