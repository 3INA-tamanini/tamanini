/*
Scrivere una classe e il relativo test con menù che, dato un numero n, preveda due metodi:
1 - crea una stringa con i primi n numeri dispari (for)
2 - crea una stringa con i primi n numeri pari (while)
 */
package numeriPariEDispari;

public class NumeriPariEDispari {

    

    public String primiNumeriDispari(int n) {
        String testo = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                testo = testo + i + "\n ";
            }
        }
        return testo;
    }

    public String primiNumeriPari(int n) {
        String testo = "";
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                testo = testo + i + "\n ";
            }
            i++;
        }
        return testo;
    }

    public static String primiNumeriDispari1(int n) {
        String testo = "";
        int ris = 1;
        for (int i = 0; i < n; i++) {
            testo += ris + "\n";
            ris += 2;
        }
        return testo;
    }
    
    public static String primiNumeriPari1(int n) {
        String testo = "";
        int ris = 0;
        int i = 1;
        while (i <= n) {
            testo += ris + "\n";
            ris += 2;
            i++;
        }
        return testo;

    }
}