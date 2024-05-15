package tamanini;

/**
 *
 * @author S51Verifica12
 */
public class Matematica {

    /**
     * metodo per calcolare il minimo comune multiplo
     *
     * @param numeri
     * @return int
     */
    public static int mcm(int[] numeri) {
        int mcm = 0;
        int numero = numeri[0];

        for (int i = 1; i <= numeri.length; i++) {
            numero *= i;
            for (int j = 0; j < numeri.length; j++) {
                if (numero % numeri[j] == 0) {
                    mcm = numero;
                }
            }
        }
        return mcm;
    }

    /**
     * metodo privato per controllare se il numero binario è corretto
     *
     * @param numeri
     * @return boolean
     */
    private static boolean controllaBinario(int numeri[]) {
        boolean si = true;
        for (int i = 0; i < numeri.length; i++) {
            if (numeri[i] != 1 && numeri[i] != 0) {
                si = false;
            }
        }
        return si;
    }

    /**
     * metodo per convertire da binario a decimale
     *
     * @param numeri
     * @return int
     */
    public static int convBinToDec(int numeri[]) {
        int decimale = 0;
        if (Matematica.controllaBinario(numeri)) {
            int[] potenzeDi2 = new int[numeri.length];
            potenzeDi2[potenzeDi2.length - 1] = 1;
            for (double i = numeri.length - 1; i >= 0; i--) {
                potenzeDi2[(int) i] = (int) Math.pow(2, i);
            }

            for (int i = 0; i < numeri.length; i++) {
                if (numeri[i] == 1) {
                    decimale += potenzeDi2[(numeri.length - 1) - i];
                }
            }
        }

        return decimale;
    }

    /**
     * metodo per convertire da decimale a binario
     *
     * @param n
     * @return int[]
     */
    public static int[] convDecToBin(int n) {
        int cont = 0;
        int n2 = n;
        while (n2 != 0) {
            n2 /= 2;
            cont++;
        }
        int[] binario = new int[cont];
        for (int i = 0; i < cont; i++) {
            if (n % 2 == 0) {
                binario[cont - i - 1] = 0;
                n /= 2;
            } else {
                binario[cont - i - 1] = 1;
                n /= 2;
            }
        }
        return binario;
    }

    public static void main(String[] args) {
        int[] numeri = {2, 4, 3};
        System.out.println(Matematica.mcm(numeri));

        int[] binario = {1, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Matematica.convBinToDec(binario));

        int binarioNew[] = Matematica.convDecToBin(128);
        for (int i = 0; i < binarioNew.length; i++) {
            System.out.print(binarioNew[i] + " ");

        }
    }
}