package Frequenze;

import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Frequenze2 {

    private int totElementi;
    private int nElementi;

    public Frequenze2(int totElementi, int nElementi) {
        this.totElementi = totElementi;
        this.nElementi = nElementi;
    }

    Frequenze2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTotElementi() {
        return totElementi;
    }

    public void setTotElementi(int totElementi) {
        this.totElementi = totElementi;
    }

    public int getnElementi() {
        return nElementi;
    }

    public void setnElementi(int nElementi) {
        this.nElementi = nElementi;
    }

    public String frequenza() {
        Formatter f = new Formatter();
        Random r = new Random();
        String testo = "N. - FA  -  FR%  -  FP\n";

        int contatore = 0;
        int differenza = totElementi;

        for (int i = 0; i < nElementi; i++) {
            if (i < nElementi - 1) {
                contatore = r.nextInt(differenza);
            } else {
                contatore = differenza;
            }

            double fR = (double) contatore / totElementi;
            double fP = fR * 100;

            f.format("%d    %2d    %4.2f    %5.2f\n", (i + 1), contatore, fR, fP);

            differenza = differenza - contatore;
        }
        testo += f;
        f.close();
        return testo;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot, n;

        System.out.print("inserisci il totale degli elementi: ");
        tot = in.nextInt();

        System.out.print("inserisci il numero di elementi: ");
        n = in.nextInt();

        Frequenze2 f = new Frequenze2(tot, n);

        System.out.println(f.frequenza());
        in.close();
    }
}
