package MatriceQuadrataWrapper;

import java.util.Random;

public class MatriceQuadrataWrapper2 {

    private Integer[][] matrice;
    private Integer n;

    private static int numeroIstanze;

    public MatriceQuadrataWrapper2(Integer n) throws Exception {
        setN(n);
        matrice = new Integer[n][n];
        numeroIstanze++;
    }

    public MatriceQuadrataWrapper2(MatriceQuadrataWrapper2 m) {
        matrice = new Integer[m.n][m.n];

        for (int i = 0; i < m.n; i++) {
            for (int j = 0; j < m.n; j++) {
                this.matrice[i][j] = m.matrice[i][j];
            }
        }
        this.n = m.n;
    }

    public MatriceQuadrataWrapper2() {
        numeroIstanze++;
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
            } else {
                throw new Exception("n deve essere maggiore o uguale a 2");
            }
        } else {
            throw new Exception("n deve essere diverso da null");
        }
    }

    //Riempe con valori casuali la matrice
    public void caricaRandom() {
        Random r = new Random();
        Integer[] array = new Integer[(matrice.length * matrice[0].length)];    //Array con lunghezza uguale alla dimensione della matrice che conterrà tutti i valori random diversi tra loro da inserire nella matrice

        for (Integer j = 0; j < array.length; j++) {      //Inizializza l'array a 0
            array[j] = 0;
        }

        Integer ran = r.nextInt(99) + 1;
        Integer contatore = 0;          //Contatore per far terminare il riempimento dell'array

        for (Integer i = 0; i < array.length; i++) {
            if (array[i].equals(0)) {            //Se il valore in posizione i dell'array è uguale a 0 e perciò non inizializzato
                array[i] = ran;             //inserisce il valore random in quella posizione
                contatore++;                //Incrementa il contatore ogni volta che inserisce un valore random
                i = -1;
            } else if (array[i].equals(ran)) {   //Se il valore in posizione i dell'array è uguale al valore random
                ran = r.nextInt(99) + 1;    //ne genera uno nuovo
                i = -1;                     //e ricontrolla l'Integerero array
            } else if (contatore == array.length) { //Se il contatore è uguale alla lunghezza dell'array termina
                i = array.length;
            }
        }

        contatore = -1;

        for (Integer i = 0; i < matrice.length; i++) {
            for (Integer j = 0; j < matrice[0].length; j++) {
                contatore++;
                matrice[i][j] = array[contatore];
            }
        }
    }

    public String visualizza() {
        String info = "";

        info = "┌";

        for (int j = 0; j < (n * 2); j++) {
            info += "─";
        }

        info += "┐\n";

        int i;
        for (i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                if (matrice[i][j] <= 9) {
                    info += "│0" + matrice[i][j];
                } else {
                    info += "│" + matrice[i][j];
                }
            }
            info += "│\n";

            if (i < matrice.length - 1) {
                info += "├";

                for (int j = 0; j < (n * 2); j++) {
                    info += "─";
                }

                info += "┤\n";
            } else {
                info += "";
            }

        }

        info += "└";

        for (int j = 0; j < (n * 2); j++) {
            info += "─";
        }

        info += "┘\n";

        return info;
    }

    public void modificaElemento(Integer r, Integer c, Integer val) throws Exception {
        Integer contatore = 0;

        if (r >= 0 && r < matrice.length && c >= 0 && c < matrice[0].length) {
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    if (matrice[i][j].equals(val)) {
                        throw new Exception("Il nuovo valore da inserire NON deve essere già presente");
                    } else {
                        contatore++;
                    }
                }
            }
        } else {
            throw new Exception("Le coordinate inserite non sono valide");
        }

        if (contatore == (matrice.length * matrice[0].length)) {
            matrice[r][c] = val;
        }
    }

    public void ordina() {
        for (Integer i = 0; i < matrice.length; i++) {
            for (Integer j = 0; j < matrice[0].length; j++) {
                for (Integer k = i; k < matrice.length; k++) {
                    for (Integer z = (k == i ? j : 0); z < matrice[0].length; z++) {
                        if (matrice[i][j] > matrice[k][z]) {
                            Integer temp = matrice[k][z];
                            matrice[k][z] = matrice[i][j];
                            matrice[i][j] = temp;
                        }
                    }
                }
            }
        }
    }

    public Integer[] elementiDiagonalePrincipale() {
        Integer[] array = new Integer[matrice.length];

        for (Integer i = 0; i < matrice.length; i++) {
            array[i] = matrice[i][i];
        }

        return array;
    }

    public Integer[] elementiDiagonaleSecondaria() {
        Integer[] array = new Integer[matrice.length];
        Integer j = matrice.length - 1;

        for (Integer i = 0; i < matrice.length; i++) {
            array[i] = matrice[i][j - i];
        }

        return array;
    }

    public Integer determinante() throws Exception {
        if (matrice.length * matrice[0].length == 4) {

            Integer det;
            det = (elementiDiagonalePrincipale()[0] * elementiDiagonalePrincipale()[1]) - (elementiDiagonaleSecondaria()[0] * elementiDiagonaleSecondaria()[1]);
            return det;

        } else {
            throw new Exception("Per calcolare il determinante la matrice deve essere 2x2");
        }
    }

    public Boolean verificaUguaglianza(MatriceQuadrataWrapper2 m) {
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
    public Boolean verificaUguaglianza2(MatriceQuadrataWrapper2 m){
        
    }

    public static void main(String[] args) {
        try {

            //MatriceQuadrataWrapper m = new MatriceQuadrataWrapper(1);       //non esegue nulla perchè deve essre >= di 2
            //MatriceQuadrataWrapper m = new MatriceQuadrataWrapper(2);     //esegue
            MatriceQuadrataWrapper2 m = new MatriceQuadrataWrapper2(3);     //esegue ma determinante restituisce un errore perchè n > 2

            m.caricaRandom();

            m.ordina();

            try {
                m.modificaElemento(-1, 1, 3);
                //m.modificaElemento(-1, 1, 3);     //da un errore solo per la modifica elemento perchè -1 non è una coordinata valida
            } catch (Exception ex) {                //se si inserisce un valore già presente da un errore diverso
                System.out.println(ex.getMessage());
            }

            System.out.println(m.visualizza());

            try {
                System.out.println("Determinante = " + m.determinante());   //da errore se la matrice NON è 2x2
            } catch (Exception ex) {
                System.out.println(ex.getMessage());    //la matrice deve essere 2x2
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
