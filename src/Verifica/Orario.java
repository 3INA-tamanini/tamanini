package Verifica;

import java.util.Scanner;

/**
 * @version 1.0
 * @author tamanini
 */
public class Orario {

    private int o, m, s;

    public Orario(int o, int m, int s) {
        this.o = o;
        this.m = m;
        this.s = s;
    }

    /**
     * metodo getter di o
     *
     * @return int
     */
    public int getO() {
        return o;
    }

    /**
     * metodo setter di o
     *
     * @param o
     */
    public void setO(int o) {
        this.o = o;
    }

    /**
     * metodo getter di m
     *
     * @return int
     */
    public int getM() {
        return m;
    }

    /**
     * metodo setter di m
     *
     * @param m
     */
    public void setM(int m) {
        this.m = m;
    }

    /**
     * metodo getter di s
     *
     * @return int
     */
    public int getS() {
        return s;
    }

    /**
     * metodo setter di s
     *
     * @param s
     */
    public void setS(int s) {
        this.s = s;
    }

    /**
     * metodo info per visualizzare l'orario in formato "oo:mm:ss"
     *
     * @return String
     */
    public String info() {
        String testo = "";
        if (o < 10) {
            testo += "0" + o + ":";
        } else {
            testo += o + ":";
        }

        if (m < 10) {
            testo += "0" + m + ":";
        } else {
            testo += m + ":";
        }

        if (s < 10) {
            testo += "0" + s;
        } else {
            testo += s;
        }

        return testo;
    }

    /**
     * metodo privato per verificare se la data è valida
     *
     * @return boolean
     */
    private boolean isValida() {
        boolean valida = false;
        if (s < 60 && m < 60 && o < 24) {
            valida = true;
        }
        return valida;
    }

    /**
     * metodo per calcolare i secondi equvalenti di un orario se l'orario non è
     * valido restituisce 0
     *
     * @return int
     */
    public int secondiEquivalenti() {
        int secondi = 0;
        if (isValida()) {
            secondi = s;
            secondi += (m * 60);
            secondi += (o * 3600);
        }

        return secondi;
    }

    /**
     * metodo per cacolare i minuti equivalenti di un orario se l'orario non è
     * valido restituisce 0
     *
     * @return float
     */
    public int minutiEquivalenti() {
        int minuti = 0;
        if (isValida()) {
            minuti = m;
            minuti += (o * 60);
            minuti += (s / 60);
        }
        return minuti;
    }

    /**
     * metodo per calcolae le ore equivalenti di un orario se l'orario non è
     * valido restituisce 0
     *
     * @return float
     */
    public int oreEquivalenti() {
        int ore = 0;
        if (isValida()) {
            ore = o;
            ore += (m / 60);
            ore += (s / 3600);
        }

        return ore;
    }

    /**
     * metodo per calcolare la differenza in secondi tra la prima Orario e un
     * altra inserita dall'utente se il secondo orario non è valido restituisce
     * solo il valore del primo
     *
     * @param o2
     * @param m2
     * @param s2
     * @return int
     */
    public int differenzaOrari(int o2, int m2, int s2) {
        int secondiPrimaOrario = secondiEquivalenti();
        int secondiSecondaOrario = 0;
        if (s2 < 60 && m2 < 60 && o2 < 24) {
            secondiSecondaOrario = s2 + (m2 * 60) + (o2 * 3600);
        }

        int differenzaSecondi = Math.abs((secondiPrimaOrario - secondiSecondaOrario));
        return differenzaSecondi;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ore, minuti, secondi;
        System.out.print("inserisci le ore: ");
        ore = in.nextInt();
        System.out.print("inserisci i minuti: ");
        minuti = in.nextInt();
        System.out.print("inserisci i secondi: ");
        secondi = in.nextInt();
        Orario orario = new Orario(ore, minuti, secondi);

        System.out.println(orario.info());
        System.out.println("i secondi equivalenti sono: " + orario.secondiEquivalenti());
        System.out.println("i minuti equivalenti sono: " + orario.minutiEquivalenti());
        System.out.println("le ore equivalenti sono: " + orario.oreEquivalenti());

        System.out.print("inserisci le ore della seconda data: ");
        ore = in.nextInt();
        System.out.print("inserisci i minuti della seconda data: ");
        minuti = in.nextInt();
        System.out.print("inserisci i secondi della seconda data: ");
        secondi = in.nextInt();

        System.out.println("la differenza in secondi è: " + orario.differenzaOrari(ore, minuti, secondi));

    }
}
