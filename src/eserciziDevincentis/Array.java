package eserciziDevincentis;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public int[] generaNumeri(int dim) {
		int[] numeri = new int[dim];
		int n;
		Random r = new Random();

		for (int i = 0; i < ((numeri.length) / 2); i++) {
			n = r.nextInt(10) + 1;
			if (n % 2 == 0)
				numeri[i] = n;
			else
				i--;
		}
		for (int j = dim; j > ((numeri.length) / 2); j--) {
			n = r.nextInt(10) + 1;
			if (n % 2 != 0)
				numeri[j-1] = n;
			else
				j++;
		}

		return numeri;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("inserisci il numero di elementi: ");
		int n = in.nextInt();
		Array a = new Array();

		int[] numeri = a.generaNumeri(n);

		for (int i = 0; i < numeri.length; i++) {
			System.out.print(numeri[i] + " ");
		}
		in.close();
	}

}
