package superEnalotto;

import java.util.Scanner;

public class SuperEnalottoTest2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		SuperEnalotto s = new SuperEnalotto();

		String testo = "";
		String testoCorretto = s.superEnalotto();

		for (int i = 0; i < 6; i++) {
			System.out.print("inserisci un numero: ");
			n = in.nextInt();
			testo += " " + n;
		}

		System.out.println("la tua combinazione: " + "\n" + testo);
		System.out.println("combinazione corretta: " + "\n" + testoCorretto);

		if (testo.equals(testoCorretto))
			System.out.println("\nhai vinto!!");
		else
			System.out.println("\nnon hai vinto" + "\nscarso");
	}
}
