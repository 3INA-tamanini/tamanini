package Verifiche.tamanini;

import java.util.Random;

/**
 *
 * @author tamanini luca
 */
public class MatriceQuadrata {

    private int[][] matrice;
    private int n;

    public MatriceQuadrata(int n) {
        this.n = n;
        matrice = new int[n][n];
    }

    public int getN() {
        return n;
    }

    public void caricaRandom() {
        Random r = new Random();
        int[] numeriUsati = new int[(matrice.length * matrice.length) + 1];
        int numero;
        numero = r.nextInt(98) + 1;
        int cont = 0;
        numeriUsati[cont] = numero;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                boolean trovato = false;

                do {
                    numero = r.nextInt(98) + 1;

                    for (int k = 0; k < numeriUsati.length; k++) {
                        if (numero == numeriUsati[k]) {
                            trovato = true;
                            break;
                        } else {
                            trovato = false;
                        }
                    }
                } while (trovato == true);
                cont++;
                numeriUsati[cont] = numero;

                matrice[i][j] = numero;
            }
        }
    }

    public String visualizza() {
        String testo = "";
        int cont = 0;
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {

                if (cont == n) {
                    testo += "\n";
                    cont = 0;
                }
                if (matrice[i][j] < 10) {
                    testo += "0" + matrice[i][j] + " ";
                } else {
                    testo += matrice[i][j] + " ";
                }

                cont++;
            }
        }
        return testo;
    }

    private boolean isValido(int r, int c, int val) {
        if (r > matrice.length || c > matrice.length) {
            return false;
        }
        if (r < 0 || c < 0) {
            return false;
        }
        if (val >= 99 || val < 1) {
            return false;
        }

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (val == matrice[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean modificaElemento(int r, int c, int val) {
        if (isValido(r, c, val) == false) {
            return false;
        } else {
            matrice[r][c] = val;
            return true;
        }
    }

    public void ordinaPerRiga() {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length - 1; j++) {
                if (matrice[i][j] > matrice[i][j + 1]) {
                    int temp = matrice[i][j];
                    matrice[i][j] = matrice[i][j + 1];
                    matrice[i][j] = temp;
                }
            }
        }
    }

    public int[] elementiDiagonalePrincipale() {
        int[] elementi = new int[n];
        for (int i = 0; i < elementi.length; i++) {
            for (int j = 0; j < elementi.length; j++) {
                if ((i - j) == 0) {
                    elementi[i] = matrice[i][j];
                }
            }
        }
        return elementi;
    }

    public int[] elementiDiagonaleSecondaria() {
        int[] elementi = new int[n];
        for (int i = matrice.length - 1; i < elementi.length; i--) {
            for (int j = 0; j < elementi.length; j++) {
                if ((i - j) == 0) {
                    elementi[i] = matrice[i][j];
                }
            }
        }
        return elementi;
    }

    int determinante() {
        int det = 0;
        if (matrice.length * 2 == 4) {
            det = ((matrice[0][0] * matrice[1][1]) - (matrice[1][0] * matrice[0][1]));
        }
        return det;
    }

    public static void main(String[] args) {
        MatriceQuadrata m = new MatriceQuadrata(3);
        m.caricaRandom();
        System.out.print(m.visualizza() + "\n\n");
        m.ordinaPerRiga();

        System.out.println(m.visualizza());
        System.out.println(m.determinante() + "\n");
        if (m.modificaElemento(0, 0, 12) == true) {
            System.out.println("elemento modificato");
        } else {
            System.out.println("elemento non modificato perché il valore inserito c'è già");
        }
    }
}
