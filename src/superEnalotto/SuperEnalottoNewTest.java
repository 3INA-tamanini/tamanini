package superEnalotto;

public class SuperEnalottoNewTest {

    public static void main(String[] args) {

        int numeri[] = {1, 2, 3, 4, 5, 6};
        int[] numeroCorretto = SuperEnalottoNew.superEnalottoNoNumeriRipetuti();

        System.out.print("la tua combinazione: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + " ");
        }
        System.out.println("\n");

        System.out.println("combinazione corretta: ");
        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeroCorretto[i] + " ");
        }
        System.out.println("\n");

        int cont = 0;
        boolean controllo = false;

        for (int i = 0; i < numeroCorretto.length; i++) {
            for (int j = 0; j < numeri.length; j++) {
                if (numeri[i] == numeroCorretto[j]) {
                    cont++;
                    break;
                }
            }

        }

        if (cont == 6) {
            controllo = true;
        }

        System.out.println("");
        System.out.println(controllo);
    }
}
