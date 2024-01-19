package eserciziDevincentis;

import java.util.Scanner;

public class NumeroTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
        int n = in.nextInt();

        Numero number = new Numero(n);
        
        System.out.println(number.tabellina());
    }

}