package Verifica;

import java.util.Scanner;
import java.time.LocalTime;

/**
 * @version 1.0
 * @author tamanini
 */
public class OrarioGiusto {

    private int o, m, s;

    public OrarioGiusto() {
        LocalTime adesso = LocalTime.now();
        o = adesso.getHour();
        m = adesso.getMinute();
        s = adesso.getSecond();
    }

    public OrarioGiusto(int o, int m, int s) {
        setO(o);
        setM(m);
        setS(s);
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
    final public void setO(int o) {
        if (isValida()) {
            this.o = o;
        }
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
    final public void setM(int m) {
        if (isValida()) {
            this.m = m;
        }
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
    final public void setS(int s) {
        if (isValida()) {
            this.s = s;
        }
    }

    /**
     * metodo info per visualizzare l'orario in formato "oo:mm:ss"
     *
     * @return String
     */
    public String info() {
        String testo = "";
        if (isValida()) {
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
        valida = isValida(o, m, s);
        return valida;
    }

    public static boolean isValida(int o, int m, int s) {
        boolean valida = false;
        if ((s < 60 && s > 0) && (m < 60 && m > 0) && (o < 24 && o > 0)) {
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
        secondi = secondiEquivalenti(o, m, s);

        return secondi;
    }

    public static int secondiEquivalenti(int o, int m, int s) {
        int secondi = 0;
        if (isValida(o, m, s)) {
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
        int differenzaSecondi = 0;
        if (isValida() && isValida(o2, m2, s2)) {
            differenzaSecondi = Math.abs((secondiEquivalenti() - secondiEquivalenti(02, m2, s2)));
        }
        return differenzaSecondi;
    }

    public int differenzaOrari2(OrarioGiusto ora) {
        int differenzaSecondi = 0;

        int o2 = ora.getO();
        int m2 = ora.getM();
        int s2 = ora.getS();

        if (isValida() && isValida(o2, m2, s2)) {
            differenzaSecondi = Math.abs((secondiEquivalenti() - secondiEquivalenti(02, m2, s2)));
        }
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
        OrarioGiusto orario = new OrarioGiusto(ore, minuti, secondi);

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
        in.close();
    }
}
