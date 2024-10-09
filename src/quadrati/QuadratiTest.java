package quadrati;

import java.util.Scanner;

public class QuadratiTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("inserisci il numero da 1 a 20: ");
        int n = in.nextInt();

        Quadrati2 q = new Quadrati2(n);

        System.out.println(q.quadrati());
        in.close();
    }
}