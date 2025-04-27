package ambrosi_compiti;

import java.util.Scanner;

public class Lista {

	public Nodo testa;

	public Lista() {
		this.testa = null;
	}

	public void inserisci(int dato) {
		if (dato != 0) {
			int cont = 0;

			Nodo n = new Nodo(dato);
			if (testa == null) {
				testa = n;
			} else {
				Nodo corrente = testa;
				while (corrente.next != null) {
					corrente = corrente.next;
					cont++;
				}
				corrente.next = n;
				cont++;
			}

			if (testa.next != null) {
				ordinamento(cont);
			}
		}

		System.out.print(toString());
	}

	private void ordinamento(int cont) {
		Nodo temp = testa;
		int tempDato;
		int i = 0;

		while (i < cont) {
			if (temp.dati > temp.next.dati) {
				tempDato = temp.next.dati;
				temp.next.dati = temp.dati;
				temp.dati = tempDato;
				temp = testa;
				i = 0;
			} else {
				temp = temp.next;
				i++;
			}
		}
	}

	@Override
	public String toString() {
		String str = "";

		Nodo corrente = testa;
		while (corrente != null) {
			str = str + corrente.dati + " ";
			corrente = corrente.next;
		}

		return str + "\n";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lista lista = new Lista();
		int n = 1;

		while (n != 0) {
			System.out.print("Inserire un numero, per terminare premere 0: ");
			n = in.nextInt();
			System.out.println();
			lista.inserisci(n);
		}

	}
}