package numeriPariEDispari;

import java.util.Scanner;

public class NumeriPariEDispariTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scelta, n;
        NumeriPariEDispari pd = null;
        while (true) {
            System.out.println("1 - istanziare l'oggetto (obbligatorio)");
            System.out.println("2 - crea una stringa con i primi n numeri dispari");
            System.out.println("3 - crea una stringa con i primi n numeri pari");
            System.out.println("4 - esci");
            System.out.print("inserisci l'opzione: ");
            scelta = in.nextInt();

            switch (scelta) {
                case 1:
                    pd = new NumeriPariEDispari();
                    System.out.println("oggetto istanziato");
                    break;
                case 2:
                    System.out.println("inserisci un numero: ");
                    n = in.nextInt();
                    System.out.println(pd.primiNumeriDispari(n));
                    break;
                case 3:
                    System.out.println("inserisci un numero: ");
                    n = in.nextInt();
                    System.out.println(pd.primiNumeriPari(n));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("opzione inesistente, riprovare");
                    break;
            }
        }

    }
}
