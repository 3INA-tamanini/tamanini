package eserciziDevincentis;

import java.util.Scanner;

public class ArrayParalleli {

    private String[] nome;
    private String[] cognome;
    private int[] altezza;

    public ArrayParalleli(int n) {
        nome = new String[n];
        cognome = new String[n];
        altezza = new int[n];

    }

    public void inserisci(int i, int dim, String n, String c, int a) {
            nome[i] = n;
            cognome[i] = c;
            altezza[i] = a;
    }

    public String piuAlto() {
        String testo = "";
        int indiceMax = 0;

        for (int i = 0; i < altezza.length; i++) {
            if (altezza[i] > altezza[indiceMax]) {
                indiceMax = i;
            }
        }
        testo = nome[indiceMax] + " " + cognome[indiceMax];

        return testo;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("inserisci il numero di atleti: ");
        int atleti = in.nextInt();
        String nome, cognome;
        int altezza;
        ArrayParalleli a = new ArrayParalleli(atleti);
        
        for (int i = 0; i < atleti; i++) {
            System.out.println("inserisci il nome degli atleti: ");
            nome = in.next();
            System.out.println("inserisci il cognome degli atleti: ");
            cognome = in.next();
            System.out.println("inserisci l'altezza degli atleti: ");
            altezza = in.nextInt();
            a.inserisci(i, atleti, nome, cognome, altezza);in.close();
        }
        
        
    }

}
