package cicli;

import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {
        double n;
        int nIntero;
        /*for (int i = 0; i < 100; i++) {
            n = (Math.random()*10)+1;
            System.out.println("numero: " + n);
            nIntero = (int)n;
            System.out.println("numero: " + nIntero);
        }*/
        
        
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            
            nIntero = r.nextInt(5)+1;
            System.out.println("numero: " + nIntero);
        }
        
        for (int i = 0; i < 100; i++) {
            n = r.nextDouble();
            System.out.println("numero: " + n);
            
        }
    }
}
