/*
Scrivere una classe e il relativo test con menù che, dato un numero n, preveda due metodi:
1 - crea una stringa con i primi n numeri dispari (for)
2 - crea una stringa con i primi n numeri pari (while)
 */
package numeriPariEDispari;

public class NumeriPariEDispari {

    public NumeriPariEDispari() {

    }

    public String primiNumeriDispari(int n) {
        String testo = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                testo = testo + i + ", ";
            }
        }
        return testo;
    }

    public String primiNumeriPari(int n) {
        String testo = "";
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                testo = testo + i + ", ";
            }
            i++;
        }
        return testo;
    }
}
