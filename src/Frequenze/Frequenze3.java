package Frequenze;

import java.util.Random;

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

    private float frequenzaRelativa(int n){
        float frequenzaRelativa = (float) n/totNumeri;
        return frequenzaRelativa;
    }

    private float frequenzaPercentuale(int n){
        return frequenzaRelativa(n)*100;
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


        

        testo = String.format("Frequenze assolute%n" +
                      "1: %d %n" +
                      "2: %d %n" +
                      "3: %d %n" +
                      "4: %d %n" +
                      "5: %d %n" +
                      "6: %d %n" +
                      "7: %d %n" +
                      "8: %d %n" +
                      "9: %d %n %n" +
                      "Frequenze relative %n" +
                      "1: %.3f %n" +
                      "2: %.3f %n" +
                      "3: %.3f %n" +
                      "4: %.3f %n" +
                      "5: %.3f %n" +
                      "6: %.3f %n" +
                      "7: %.3f %n" +
                      "8: %.3f %n" +
                      "9: %.3f %n %n" +
                      "Frequenze percentuali %n" +
                      "1: %.2f %% %n" +
                      "2: %.2f %% %n" +
                      "3: %.2f %% %n" +
                      "4: %.2f %% %n" +
                      "5: %.2f %% %n" +
                      "6: %.2f %% %n" +
                      "7: %.2f %% %n" +
                      "8: %.2f %% %n" +
                      "9: %.2f %%",

                      n1, n2, n3, n4, n5, n6, n7, n8, n9,

                      frequenzaRelativa(n1), frequenzaRelativa(n2), frequenzaRelativa(n3),
                      frequenzaRelativa(n4), frequenzaRelativa(n5), frequenzaRelativa(n6),
                      frequenzaRelativa(n7), frequenzaRelativa(n8), frequenzaRelativa(n9),

                      frequenzaPercentuale(n1), frequenzaPercentuale(n2), frequenzaPercentuale(n3),
                      frequenzaPercentuale(n4), frequenzaPercentuale(n5), frequenzaPercentuale(n6),
                      frequenzaPercentuale(n7), frequenzaPercentuale(n8), frequenzaPercentuale(n9));



        return testo;
    }


    public static void main(String[] args) {
        Frequenze3 f = new Frequenze3(10000);

        System.out.println(f.frequenze());
    }
}