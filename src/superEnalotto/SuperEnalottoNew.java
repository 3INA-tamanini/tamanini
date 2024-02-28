package superEnalotto;

import java.util.Random;

public class SuperEnalottoNew {

    public SuperEnalottoNew() {
    }

    public int[] superEnalotto() {
        int[] n = new int[6];
        int ris;
        Random r = new Random();
        for (int i = 0; i <= n.length; i++) {
            ris = (int) r.nextInt(9)+1;
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
        } while (numeri[0] == numeri[1] || numeri[0] == numeri[2] || numeri[0] == numeri[3] || numeri[0] == numeri[4] || numeri[0] == numeri[5]
        || numeri[1] == numeri[2] || numeri[1] == numeri[3] || numeri[1] == numeri[4] || numeri[1] == numeri[5]
        || numeri[2] == numeri[3] || numeri[2] == numeri[4] || numeri[2] == numeri[5]
        || numeri[3] == numeri[4] || numeri[3] == numeri[5]
        || numeri[4] == numeri[5] || numeri[5] == 0);

  

        return numeri;
    }
}
