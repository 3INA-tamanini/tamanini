package equazione;

import java.util.Scanner;

public class EquazioneTest {

    public static void main(String[] args) {
        float a,b;
        Scanner in = new Scanner(System.in);

        System.out.println("inserisci a: ");
        a=in.nextFloat();
        System.out.println("inserisci b: ");
        b=in.nextFloat();


        Equazione equazione = new Equazione(a, b);
        System.out.println(equazione.soluzione());
    }
}
