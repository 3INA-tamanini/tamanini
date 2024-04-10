package temperature;

import java.util.Scanner;

public class TemperaturePompilioTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TemperaturePompilio tem = new TemperaturePompilio();
        float t[] = tem.getT();
        String[] g = tem.getG();

        for (int i = 0; i < tem.getG().length; i++) {
            System.out.print("Inserire la temperatura di " + g[i] + ": ");
            t[i] = in.nextFloat();
        }

        for (int i = 0; i < g.length; i++) {
            System.out.print(tem.ordinaGiorniCrescente()[i] + " ");
            System.out.println(tem.ordinaTemperatureCrescente()[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < g.length; i++) {
            System.out.print(tem.ordinaGiorniDecrescente()[i] + " ");
            System.out.println(tem.ordinaTemperatureDecrescente()[i] + " ");
        }
        
        
    }
}
