package mcm_ConvBinToDec;

import java.util.Scanner;

public class Mcm {

    private String numeri;

    public Mcm() {
    }

    public Mcm(String numeri) {
        this.numeri = numeri;
    }

    public String getNumeri() {
        return numeri;
    }

    public void setNumeri(String numeri) {
        this.numeri = numeri;
    }

    public int calcoloMCM() {
        int mcm;
        String[] stringhe = this.numeri.split(",");
        int[] numeri = new int[stringhe.length];
        for (int i = 0; i < stringhe.length; i++) {
            numeri[i] = Integer.parseInt(stringhe[i]);
        }
        int y = 0;
        mcm = numeri[0];
        boolean ripeti;
        do {
            y++;
            ripeti = false;
            for (int i = 1; i < numeri.length; i++) {
                if ((mcm * y) % numeri[i] != 0) {
                    ripeti = true;
                }
            }
        } while (ripeti);
        mcm *= y;
        return mcm;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String testo;

        System.out.println("Inserisci il valore dei numeri separati da una virgola");
        testo = in.nextLine();

        Mcm m = new Mcm(testo);

        System.out.println("Il minimo comune multiplo é : " + m.calcoloMCM());
    }

}
