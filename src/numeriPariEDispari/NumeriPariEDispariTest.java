package numeriPariEDispari;

import java.util.Scanner;

public class NumeriPariEDispariTest {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta, n;
        NumeriPariEDispari pd = null;
        boolean istanziato = false;
        do {
            System.out.println("1 - istanziare l'oggetto");
            System.out.println("2 - crea una stringa con i primi n numeri dispari");
            System.out.println("3 - crea una stringa con i primi n numeri pari");
            System.out.println("4 - esci");
            System.out.print("inserisci l'opzione: ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    pd = new NumeriPariEDispari();
                    System.out.println("oggetto istanziato");
                    istanziato = true;
                    break;
                case 2:
                    if (istanziato) {
                        System.out.print("inserisci un numero: ");
                        n = in.nextInt();
                        System.out.println(NumeriPariEDispari.primiNumeriPari1(n));
                    } else {
                        System.out.println("inserisci prima l'opzione 1");
                    }
                    break;
                case 3:
                    if (istanziato == true) {
                        System.out.print("inserisci un numero: ");
                        n = in.nextInt();
                        System.out.println(NumeriPariEDispari.primiNumeriDispari1(n));
                    } else {
                        System.out.println("inserisci prima l'opzione 1");
                    }
                    break;
                default:
                    System.out.println("opzione inesistente, riprovare");
                    break;
            }
        } while (scelta != 4);
        in.close();
    }
}
