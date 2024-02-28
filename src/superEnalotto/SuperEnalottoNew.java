package superEnalotto;

import java.util.Random;

public class SuperEnalottoNew {

    public SuperEnalottoNew() {
    }

    public int[] superEnalotto() {
        int[] n = new int[6];
        int ris;
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            ris = (int) r.nextInt(10);
            n[i] = ris;
        }

        return n;
    }

    public int[] superEnalottoNoNumeriRipetuti() {
        int[] numeri = new int[6];
        int i = 0;
        Random r = new Random();
        do {
            numeri[i] = r.nextInt(99)+1;
            i++;
        } while (i < numeri.length);

  

        return numeri;
    }
}
