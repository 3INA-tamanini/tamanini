package vettore;

import java.util.Arrays;
import java.util.Random;

public class Vettore {

    public int[] vett;

    public Vettore(int[] vett) {
        setVett(vett);
    }

    public int[] getVett() {
        if (vett == null) {
            return null;
        }

        int[] temp = new int[vett.length];

        System.arraycopy(vett, 0, temp, 0, vett.length);
        return temp;
    }

    public final void setVett(int[] vett) {
        if (isValido(vett)) {
            this.vett = vett.clone();
        }
    }

    private boolean isValido(int[] vett) {
        if (vett != null && vett.length > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void caricaVettoreRandom() {
        if (vett != null) {
            Random random = new Random();
            for (int i = 0; i < vett.length; i++) {
                vett[i] = random.nextInt(99) + 1;
            }
        }

    }

    public String visualizzaVettore() {
        String testo = "";
        if (vett != null) {
            /*return Arrays.toString(vett);
        else
            return "";*/

            testo = "[";
            for (int i = 0; i < vett.length; i++) {
                if (i == (vett.length - 1)) {
                    testo += vett[i];
                } else {
                    testo += vett[i] + ", ";
                }
            }
            testo += "]";
        }

        return testo;
    }

    public void ordinaVettore() {
        if (vett != null) {
            int temp;
            for (int i = 0; i < vett.length; i++) {
                for (int j = i + 1; j < vett.length; j++) {
                    if (vett[i] > vett[j]) {
                        temp = vett[i];
                        vett[i] = vett[j];
                        vett[j] = temp;
                    }
                }
            }
        }
    }

    private boolean isPosizione(int pos) {
        if (pos > vett.length || pos < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean modificaElemento(int pos, int valore) {
        if (vett != null) {
            if (isPosizione(pos)) {
                vett[pos] = valore;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void aggiungiElemento(int valore) {
        if (vett == null) {
            vett = new int[1];

            vett[0] = valore;
        } else {
            int[] newArray = new int[vett.length + 1];

            for (int i = 0; i < vett.length; i++) {
                newArray[i] = vett[i];
            }
            newArray[newArray.length - 1] = valore;

            vett = newArray;
        }
    }

    public boolean rimuoviElementoPerPosizione(int pos) {
        int[] newArray = new int[vett.length - 1];
        int y = 0;
        if (isPosizione(pos)) {
            for (int i = 0; i < vett.length; i++) {
                if (i != pos) {
                    newArray[y] = vett[i];
                    y++;
                }
            }

            vett = newArray;
            return true;
        } else {
            return false;
        }
    }

    public boolean rimuoviElementoPerValore(int valore) {
        int cont = 0;

        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                cont++;
            }
        }

        int newArray[] = new int[vett.length - cont];

        if (vett == null) {
            return false;
        }

        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                rimuoviElementoPerPosizione(i);
                i = 0;
            }
        }

        return true;
    }

    public void ShiftDestra(int n) {
        int temp;
        for (int i = 0; i < vett.length; i++) {
            temp = vett[i];
            if (i + n < vett.length) {
                
                if (i <= n) {
                    vett[i] = 0;
                } else {
                    vett[i + n] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {
        int[] vettore = {3, 3, 2, 7};

        Vettore v = new Vettore(vettore);

        System.out.println("primo vettore: ");
        System.out.println(v.visualizzaVettore());

        System.out.println("vettore con valori random: ");
        v.caricaVettoreRandom();
        System.out.println(v.visualizzaVettore());

        System.out.println("vettore ordinato: ");
        v.ordinaVettore();
        System.out.println(v.visualizzaVettore());

        System.out.println("modifica elemento: ");
        v.modificaElemento(2, 12);
        System.out.println(v.visualizzaVettore());

        System.out.println("aggiungi un elemento: ");
        v.aggiungiElemento(4);
        System.out.println(v.visualizzaVettore());

        System.out.println("rimosso un elemento per posizione: ");
        v.rimuoviElementoPerPosizione(2);
        System.out.println(v.visualizzaVettore());

        System.out.println("rimosso un elemento per valore: ");
        v.rimuoviElementoPerValore(3);
        System.out.println(v.visualizzaVettore());

        System.out.println("shiftato verso destra perdendo l'ultimo dato: ");
        v.ShiftDestra(1);
        System.out.println(v.visualizzaVettore());

    }
}
