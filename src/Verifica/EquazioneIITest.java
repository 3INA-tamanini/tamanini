package Verifica;

import java.util.Scanner;

public class EquazioneIITest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double a,b,c;

        System.out.println("inserisci a: ");
        a = in.nextDouble();
        System.out.println("inserisci b: ");
        b = in.nextDouble();
        System.out.println("inserisci c: ");
        c = in.nextDouble();
        
        EquazioneII eq = new EquazioneII(a, b, c);

        System.out.println("X1 = " + eq.x1());
        System.out.println("X2 = " + eq.x2());

        
        
        
    }

    
}
