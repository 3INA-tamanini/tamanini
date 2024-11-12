package matrix;

import java.util.Arrays;
import java.util.Random;

public class Matrice {

    public static int[][] caricaRandom(int[][] matrice) {
        Random r = new Random();
        int numeroRandom = r.nextInt(9) + 1;
        int contatore = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {

                if (matrice[i][j] == 0) {
                    matrice[i][j] = numeroRandom;
                    contatore++;
                    i = 0;
                    j = -1;
                } else if (matrice[i][j] == numeroRandom) {
                    numeroRandom = r.nextInt(9) + 1;
                    i = 0;
                    j = -1;
                } else if (contatore == 9) {
                    i = matrice.length;
                    j = matrice[0].length;
                }
            }
        }
        return matrice;
    }

    public static int determinante2x2(int[][] matrice) {
        return (matrice[0][0] * matrice[1][1]) - (matrice[1][0] * matrice[0][1]);
    }

    public static int sommaElementi(int matrice[][]) {
        int somma = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                somma += matrice[i][j];

            }
        }
        return somma;
    }

    public static float media(int matrice[][]) {
        float somma = sommaElementi(matrice);
        float media = somma / (matrice.length * matrice[0].length);
        return media;
    }

    public static int[][] sommaMatrici(int[][] m1, int[][] m2) {
        int[][] ris = null;
        if (m1.length == m2.length && m1[0].length == m2[0].length) {
            ris = new int[m1.length][m1[0].length];
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[0].length; j++) {
                    ris[i][j] = m1[i][j] + m2[i][j];
                }
            }
        } else {
            ;
        }
        return ris;
    }

    public static int[][] ordina(int matrice[][]) {
        int temp = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                for (int k = i; k < matrice.length; k++) {
                    for (int z = (k == i ? j : 0); z < matrice.length; z++) {
                        if (matrice[i][j] > matrice[k][z]) {
                            temp = matrice[i][j];
                            matrice[i][j] = matrice[k][z];
                            matrice[k][z] = temp;
                        }
                    }
                }
            }
        }
        return matrice;
    }

    public static void main(String[] args) {
        int[][] matrice = new int[3][4];
        matrice = caricaRandom(matrice);
        System.out.println("matrice: " + Arrays.deepToString(matrice));
        System.out.println("somma: " + Matrice.sommaElementi(matrice));
        System.out.println("media: " + Matrice.media(matrice));
        System.out.println("prima: " + Arrays.deepToString(matrice));
        System.out.println("dopo:  " + Arrays.deepToString(Matrice.ordina(matrice)));
        System.out.println("somma matrici: " + Arrays.deepToString(Matrice.sommaMatrici(matrice, matrice)));
        System.out.println("carica random: " + Arrays.deepToString(Matrice.caricaRandom(matrice)));

    }
}
