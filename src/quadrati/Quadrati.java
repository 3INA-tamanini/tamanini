package quadrati;

import java.util.Scanner;

public class Quadrati {

    private int n;

    public Quadrati(int n) {
        this.n = n;
    }

    private boolean isVero() {
        boolean t;
        if (n >= 1 && n <= 20)
            t = true;
        else
            t = false;

        return t;
    }

    public String quadrati() {
        String testo = "";
        if (isVero()) {
            for (int i = 0; i <= 20; i++) {
                if (i < n)
                    testo = "";
                else
                    testo += i + " X " + i + "= " + (i * i) + "\n";
            }

        }else{
            System.out.println("numero errato");
        }
        return testo;
    }

}