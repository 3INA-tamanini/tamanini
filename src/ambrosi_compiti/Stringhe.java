package ambrosi_compiti;

import java.util.Scanner;

public class Stringhe {
    public static int contaSpazi(String stringa) {
        int contatore = 0;
        for (int i = 0; i < stringa.length(); i++) {
            if (stringa.charAt(i) == ' ') {
                contatore++;
            }
        }
        return contatore;

    }

    public static int contaVocali(String stringa) {
        int contatore = 0;
        char vocali[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < stringa.length(); i++) {
            for (int j = 0; j < vocali.length; j++) {
                if (stringa.charAt(i) == vocali[j]) {
                    contatore++;
                }
            }
        }
        return contatore;

    }

    public static int contaConsonanti(String stringa) {
        int contatore = 0;
        char vocali[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < stringa.length(); i++) {
            for (int j = 0; j < vocali.length; j++) {
                if (stringa.charAt(i) == vocali[j]) {
                    contatore++;
                }
            }
        }
        return contatore;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci una stringa: ");
        String stringa = in.nextLine();

        System.out.println("numero spazi     : " + contaSpazi(stringa));
        System.out.println("numero vocali    : " + contaVocali(stringa));
        System.out.println("numero consonanti: " + contaConsonanti(stringa));in.close();
    }
}
