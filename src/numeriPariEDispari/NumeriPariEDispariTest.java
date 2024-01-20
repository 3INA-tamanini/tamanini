package numeriPariEDispari;

import java.util.Scanner;

public class NumeriPariEDispariTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("inserisci un numero: ");
        int n = in.nextInt();

        NumeriPariEDispari pd = new NumeriPariEDispari();

        System.out.println(pd.primiNumeriDispari(n));
        System.out.println(pd.primiNumeriPari(n));
    }
}
