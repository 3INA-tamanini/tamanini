package superEnalotto;

import java.util.Random;

public class SuperEnalottoNew {
    private static int[] numeri = new int[6];
    
    public SuperEnalottoNew() {
    }

    public static int[] getNumeri() {
        return numeri;
    }

    public static void setNumeri(int[] numeri) {
        SuperEnalottoNew.numeri = numeri;
    }

    
    public static int[] superEnalottoNoNumeriRipetuti() {
        
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
    
    
    public static String isVinto(int[] mio){
        String si = "";
        int k = 0;
        for (int i = 0; i < mio.length; i++) {
            for (int j = 0; j < mio.length; j++) {
                if (mio[i] == numeri[j]) {
                    k++;
                    
                }
            }
        }
        if(k==1)
            si = "hai indovinato " + k + " numero";
        else
            si = "hai indovinato " + k + " numeri";
        return si;
    }
}