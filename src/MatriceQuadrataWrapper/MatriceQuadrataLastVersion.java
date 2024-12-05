package MatriceQuadrataWrapper;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class MatriceQuadrataLastVersion {
    private Integer[][] matrice;
    private Integer n;

    private static int numeroIstanze;

    public MatriceQuadrataLastVersion() {
        numeroIstanze++;
    }

    public MatriceQuadrataLastVersion(Integer n) throws Exception {
        setN(n);
        matrice = new Integer[n][n];
        numeroIstanze++;
    }

    public MatriceQuadrataLastVersion(MatriceQuadrataLastVersion m) {
        matrice = new Integer[m.n][m.n];

        for (int i = 0; i < m.n; i++) {
            for (int j = 0; j < m.n; j++) {
                this.matrice[i][j] = m.matrice[i][j];
            }
        }
        this.n = m.n;
    }

    public Integer[][] getMatrice() {
        return matrice;
    }

    public void setMatrice(Integer[][] matrice) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.matrice = matrice;
            } else {
                throw new Exception("n deve essere maggiore o uguale a 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) throws Exception {
        if (n != null) {
            if (n >= 2) {
                this.n = n;
            } else
                throw new Exception("n deve essere > 2");
        } else
            throw new Exception("n deve essere diverso da null");
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public void caricaRandom() throws Exception {
        if (n != null && n >= 2) {
            Random r = new Random();
            Integer n = this.n * this.n;
            Integer estrazioni[] = new Integer[n];

            boolean trovato = false;
            Integer cont = 0;
            do {
                Integer estrazione = r.nextInt(20) + 1;

                for (Integer i = 0; i < estrazioni.length; i++) {
                    if (estrazione == estrazioni[i]) {
                        trovato = true;
                    }
                }

                if (trovato == false) {
                    estrazioni[cont] = estrazione;
                    cont++;
                }

                trovato = false;
            } while (estrazioni[n - 1] == 0);

            cont = 0;
            for (Integer i = 0; i < matrice.length; i++) {
                for (Integer j = 0; j < matrice.length; j++) {
                    matrice[i][j] = estrazioni[cont];
                    cont++;
                }
            }
        } else
            throw new Exception("null & >= 2!");
    }

    public String visualizza() throws Exception {
        if (n != null && n >= 2) {
            String matrice = "";
            matrice = "┌";
            for (Integer j = 0; j < (n * 2); j++) {
                matrice += "─";
            }
            matrice += "┐\n";

            Integer i;
            for (i = 0; i < this.matrice.length; i++) {
                for (Integer j = 0; j < this.matrice.length; j++) {
                    if (this.matrice[i][j] <= 9) {
                        matrice += "│0" + this.matrice[i][j];
                    } else {
                        matrice += "│" + this.matrice[i][j];
                    }
                }
                matrice += "│\n";

                if (i < this.matrice.length - 1) {
                    matrice += "├";

                    for (Integer j = 0; j < (n * 2); j++) {
                        matrice += "─";
                    }

                    matrice += "┤\n";
                } else {
                    matrice += "";
                }
            }

            matrice += "└";
            for (Integer j = 0; j < (n * 2); j++) {
                matrice += "─";
            }
            matrice += "┘\n";

            return matrice;
        } else {
            throw new Exception("null & >= 2!");
        }
    }

    public void modificaElemento(Integer r, Integer c, Integer val) throws Exception {
        if (n != null && n >= 2) {
            if (r == null || c == null || val == null)
                throw new Exception("");

            if ((r < 0 || r >= matrice.length) || (c < 0 || r >= matrice.length) || (val < 1 || val > 99))
                throw new Exception("");

            for (Integer i = 0; i < matrice.length; i++)
                for (Integer j = 0; j < matrice.length; j++)
                    if (Objects.equals(matrice[i][j], val))
                        matrice[r][c] = val;
        } else
            throw new Exception("");
    }

    public void ordinaPerRiga() throws Exception {
        if (n != null && n >= 2) {
            for (Integer r = 0; r < matrice.length; r++)
                for (Integer i = 0; i < matrice.length - 1; i++)
                    for (Integer j = i + 1; j < matrice.length; j++)
                        if (matrice[r][i] > matrice[r][j]) {
                            Integer temp = matrice[r][i];
                            matrice[r][i] = matrice[r][j];
                            matrice[r][j] = temp;
                        }
        } else
            throw new Exception("");
    }

    public Integer[] diagonalePrincipale() throws Exception {
        if (n != null && n >= 2) {
            Integer[] vett = new Integer[matrice.length];

            for (Integer i = 0; i < matrice.length; i++)
                vett[i] = matrice[i][i];
            return vett;
        } else
            throw new Exception("");
    }

    public Integer[] diagonaleSecondaria() throws Exception {
        if (n != null && n >= 2) {
            Integer[] vett = new Integer[matrice.length];

            Integer riga = matrice.length - 1;

            for (Integer i = riga; i >= 0; i--) {
                Integer offset = riga - i;
                vett[i] = matrice[i][offset];
            }
            return vett;
        } else {
            throw new Exception("");
        }
    }

    public Integer determinante() throws Exception {
        if (matrice.length == 2) {
            Integer d = null;

            Integer[] dP = diagonalePrincipale();
            Integer[] dS = diagonaleSecondaria();

            Integer prodottoDP = 1, prodottoDS = 1;

            for (Integer i = 0; i < dP.length; i++) {
                prodottoDP *= dP[i];
            }

            for (Integer i = 0; i < dS.length; i++) {
                prodottoDS *= dS[i];
            }

            d = prodottoDP - prodottoDS;

            return d;
        } else
            throw new Exception("");
    }

    public Boolean verificaUguaglianza(MatriceQuadrataLastVersion m) {
        boolean is = false;
        if (n == m.n) {
            return is;
        }
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++) {
                if (this.matrice[i][j].equals(m.matrice[i][j])) {
                    is = true;
                } else {
                    return false;
                }

            }
        }
        return is;
    }

    public static void main(String[] args) {
        try {
            MatriceQuadrataLastVersion mQ = new MatriceQuadrataLastVersion();

            mQ.caricaRandom();

            System.out.println(mQ.visualizza());

            // System.out.prIntegerln(mQ.modificaElemento(0, 0, 1));

            // mQ.ordinaPerRiga();

            System.out.println(Arrays.toString(mQ.diagonalePrincipale()));
            System.out.println(Arrays.toString(mQ.diagonaleSecondaria()));
            System.out.println(mQ.determinante());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
