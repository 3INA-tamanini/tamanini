package MatriceQuadrataWrapper;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author tamanini luca
 */
public class MatriceQuadrataWrapper {

    private Integer[][] matrice;
    private Integer n;

    public MatriceQuadrataWrapper() {
    }

    public MatriceQuadrataWrapper(Integer n) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.n = n;
                matrice = new Integer[n][n];
            } else {
                throw new Exception("n deve essere maggiore di 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }
    }

    public Integer getN() {
        return n;
    }

    public Integer[][] getMatrice() {
        return matrice;
    }

    public void caricaRandom() throws Exception {
        if (n != null && n >= 2) {
            Random r = new Random();
            Integer[] numeriUsati = new Integer[(matrice.length * matrice.length) + 1];
            Integer numero;
            numero = r.nextInt(98) + 1;
            Integer cont = 0;
            numeriUsati[cont] = numero;
            for (Integer i = 0; i < matrice.length; i++) {
                for (Integer j = 0; j < matrice.length; j++) {
                    boolean trovato = false;

                    do {
                        numero = r.nextInt(98) + 1;

                        for (Integer k = 0; k < numeriUsati.length; k++) {
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
        } else {
            throw new Exception("null o >=2");
        }

    }

    public String visualizza() throws Exception {

        if (n != null && n >= 2) {
            String testo = "";
            testo = "┌";
            for (int j = 0; j < (n * 2); j++) {
                testo += "─";
            }

            testo += "┐☺";

            int i;
            for (i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice.length; j++) {
                    if (this.matrice[i][j] <= 9) {
                        testo += "|0" + this.matrice[i][j];
                    } else {
                        testo += "|" + this.matrice[i][j];
                    }

                }

            }
            testo += "\n";

            if (i < matrice.length - 1) {
                testo += "├";
                for (int j = 0; j < matrice.length; j++) {
                    testo += "┤\n";
                }
            } else {
                testo += "";
            }

            testo += "└";
            for (int j = 0; j < matrice.length; j++) {
                testo += "─";

            }

            testo += "┘\n";

            return testo;
        } else {
            throw new Exception("null o n<2");
        }
    }

    private boolean isValido(Integer r, Integer c, Integer val) {
        if (r == null || c == null || val == null) {
            return false;
        }
        if (r > matrice.length || c > matrice.length) {
            return false;
        }
        if (r < 0 || c < 0) {
            return false;
        }
        if (val >= 99 || val < 1) {
            return false;
        }

        for (Integer i = 0; i < matrice.length; i++) {
            for (Integer j = 0; j < matrice.length; j++) {
                if (Objects.equals(val, matrice[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public void modificaElemento(Integer r, Integer c, Integer val) throws Exception {
        if (n != null && n >= 2) {
            if (isValido(r, c, val) != false) {

                matrice[r][c] = val;
            }
        } else {
            throw new Exception("null o n<2");
        }

    }

    public void ordinaPerRiga() throws Exception {
        if (n != null && n >= 2) {
            for (Integer i = 0; i < matrice.length; i++) {
                for (Integer j = 0; j < matrice.length - 1; j++) {
                    if (matrice[i][j] > matrice[i][j + 1]) {
                        Integer temp = matrice[i][j];
                        matrice[i][j] = matrice[i][j + 1];
                        matrice[i][j] = temp;
                    }
                }
            }
        } else {
            throw new Exception("null o n<2");
        }

    }

    public Integer[] elementiDiagonalePrincipale() throws Exception {
        if (n != null && n >= 2) {
            Integer[] elementi = new Integer[matrice.length];

            for (int i = 0; i < elementi.length; i++) {
                elementi[i] = matrice[i][i];

            }
            return elementi;
        } else {
            throw new Exception("null o n<2");
        }
    }

    public Integer[] elementiDiagonaleSecondaria() throws Exception {
        if (n != null && n >= 2) {
            Integer[] elementi = new Integer[n];
            Integer d = 0;
            for (int i = 0; i < elementi.length; i++) {
                elementi[d] = matrice[d][i];
                d++;
            }
            return elementi;
        } else {
            throw new Exception("null 0 n<2");
        }

    }

    Integer determinante() throws Exception {
        if (matrice.length * 2 == 4) {
            Integer det = null;
            det = ((matrice[0][0] * matrice[1][1]) - (matrice[1][0] * matrice[0][1]));
            return det;
        } else {
            throw new Exception("null o n!=2");
        }
    }

    public static void main(String[] args) {
        try {
            MatriceQuadrataWrapper m = new MatriceQuadrataWrapper(null);
            m.caricaRandom();
            System.out.print(m.visualizza() + "\n\n");
            m.ordinaPerRiga();

            System.out.println(m.visualizza());
            System.out.println(m.determinante() + "\n");
            m.modificaElemento(0, 0, 12);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
