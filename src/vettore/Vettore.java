package vettore;

import java.util.Arrays;
import java.util.Random;

public class Vettore {
    public int[] vett;

    public Vettore(int[] vett) {
        this.vett = vett;
    }

    public int[] getVett() {
        return vett;
    }

    public void setVett(int[] vett) {
        this.vett = vett;
    }

    public void caricaVettoreRandom() {
        Random random = new Random();
        for (int i = 0; i < vett.length; i++) {
            vett[i] = random.nextInt(99) + 1;
        }
    }

    public String visualizzaVettore() {
        return Arrays.toString(vett);
    }

    public void ordinaVettore() {
        int y, temp;
        boolean scambio;
        int k = vett.length - 1;
        do {
            scambio = false;
            for (y = 0; y < k; y++) {
                if (vett[y] > vett[y + 1]) {
                    temp = vett[y];
                    vett[y] = vett[y + 1];
                    vett[y + 1] = temp;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);
    }

    private boolean isPosizione(int pos) {
        if (pos > vett.length || pos < 0)
            return false;
        else
            return true;
    }

    public boolean modificaElemento(int pos, int valore) {
        if (isPosizione(pos)) {
            vett[pos] = valore;
            return true;
        } else {
            return false;
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
        int y = 0;
        for (int i = 0; i < vett.length; i++) {
            if (vett[i] == valore) {
                cont++;
            }
        }

        int newArray[] = new int[vett.length - cont];
        if (valore > 0) {
            for (int i = 0; i < vett.length; i++) {
                if (vett[i] != valore) {
                    newArray[y] = vett[i];
                    y++;
                } else {

                }
            }
            vett = newArray;
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        int[] vettore = { 3, 3, 2, 7 };

        Vettore v = new Vettore(vettore);

        System.out.println("primo vettore: ");
        System.out.println(v.visualizzaVettore());

        System.out.println("vettore con valori random: ");
        v.caricaVettoreRandom();
        System.out.println(v.visualizzaVettore());

        System.out.println("vettore ordinato: ");
        v.ordinaVettore();
        System.out.println(v.visualizzaVettore());

        System.out.println("modifica il valore: ");
        v.modificaElemento(2, 12);
        System.out.println(v.visualizzaVettore());

        System.out.println("rimosso un elemento per posizione: ");
        v.rimuoviElementoPerPosizione(2);
        System.out.println(v.visualizzaVettore());

        System.out.println("rimosso un elemento per valore: ");
        v.rimuoviElementoPerValore(3);
        System.out.println(v.visualizzaVettore());
    }

}
