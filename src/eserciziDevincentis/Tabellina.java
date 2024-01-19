package eserciziDevincentis;

import java.util.Scanner;

public class Tabellina {
    public static void main(String[] args) {
        int num, tabellina, i = 1;
        Scanner in = new Scanner(System.in);

        System.out.print("inserisci il numero della tabellina: ");
        num = in.nextInt();

        while (i < 11) {
            tabellina = num * i;
            System.out.println(num + " X " + i + " = " + tabellina);
            i++;
        }

    }
}























