package Frequenze;
import java.util.Random;
public class Frequenze3 {

    private final int NUMERI = 9;
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
            n = r.nextInt(9)+1;
            switch(n){
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
        testo = "1 " + n1 + "\n" +
                "2 " + n2 + "\n" +
                "3 " + n3 + "\n" +
                "4 " + n4 + "\n" +
                "5 " + n5 + "\n" +
                "6 " + n6 + "\n" +
                "7 " + n7 + "\n" +
                "8 " + n8 + "\n" +
                "9 " + n9 + "\n";
        
        return testo;
    }
}
