package Frequenze;

import java.util.Random;
import java.util.Formatter;
public class Frequenze3 {

    private int totNumeri;

    public Frequenze3(int totNumeri) {
        this.totNumeri = totNumeri;
    }

    public int getTotNumeri() {
        return totNumeri;
    }

    public void setTotNumeri(int totNumeri) {
        this.totNumeri = totNumeri;
    }

    private float frequenzaRelativa(int n) {
        float frequenzaRelativa = (float) n / totNumeri;
        return frequenzaRelativa;
    }

    private float frequenzaPercentuale(int n) {
        return frequenzaRelativa(n) * 100;
    }

    public String frequenze() {
        String testo = "";
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n;
        Random r = new Random();
        for (int i = 0; i < totNumeri; i++) {
            n = r.nextInt(9) + 1;
            switch (n) {
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;
                case 7:
                    n7++;
                    break;
                case 8:
                    n8++;
                    break;
                case 9:
                    n9++;
                    break;
            }
        }
        
        testo = "N.   FA         FR         FP\n";

        testo += String.format("1:   %d      %.3f      %.2f%% \n", n1, frequenzaRelativa(n1), frequenzaPercentuale(n1));
        testo += String.format("2:   %d      %.3f      %.2f%% \n", n2, frequenzaRelativa(n2), frequenzaPercentuale(n2));
        testo += String.format("3:   %d      %.3f      %.2f%% \n", n3, frequenzaRelativa(n3), frequenzaPercentuale(n3));
        testo += String.format("4:   %d      %.3f      %.2f%% \n", n4, frequenzaRelativa(n4), frequenzaPercentuale(n4));
        testo += String.format("5:   %d      %.3f      %.2f%% \n", n5, frequenzaRelativa(n5), frequenzaPercentuale(n5));
        testo += String.format("6:   %d      %.3f      %.2f%% \n", n6, frequenzaRelativa(n6), frequenzaPercentuale(n6));
        testo += String.format("7:   %d      %.3f      %.2f%% \n", n7, frequenzaRelativa(n7), frequenzaPercentuale(n7));
        testo += String.format("8:   %d      %.3f      %.2f%% \n", n8, frequenzaRelativa(n8), frequenzaPercentuale(n8));
        testo += String.format("9:   %d      %.3f      %.2f%% \n", n9, frequenzaRelativa(n9), frequenzaPercentuale(n9));

        return testo;
    }

    public static void main(String[] args) {
        Frequenze3 f = new Frequenze3(100000);

        System.out.println(f.frequenze());
    }
}
