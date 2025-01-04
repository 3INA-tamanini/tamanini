package ambrosi_compiti;

import java.util.Scanner;

public class Calcolatrice<T extends Number> {

    T n, m;

    public Calcolatrice(T n, T m) {
        this.n = n;
        this.m = m;
    }

    public Calcolatrice(T n) {
        this.n = n;
    }

    public T getN() {
        return n;
    }

    public void setN(T n) {
        this.n = n;
    }

    public T getM() {
        return m;
    }

    public void setM(T m) {
        this.m = m;
    }

    public T somma(T n, T m) {
        return (T) Double.valueOf(n.doubleValue() + m.doubleValue());
    }
    
    public T sottrazione(T n, T m) {
        return (T) Double.valueOf(n.doubleValue() - m.doubleValue());
    }
    
    public T moltiplicazione(T n, T m) {
        return (T) Double.valueOf(n.doubleValue() * m.doubleValue());
    }
    
    public T divisione(T n, T m) {
        return (T) Double.valueOf(n.doubleValue() / m.doubleValue());
    }
    

    public T fattoriale(T n) {
        if (n.doubleValue() <= 1) {
            return (T) Double.valueOf(1);
        } else {
            return (T) Double.valueOf(n.doubleValue() * fattoriale((T) Double.valueOf(n.doubleValue() - 1)).doubleValue());
        }
    }
    

    public T esponenziale(T n, T esponente) {
        if (esponente.doubleValue() <= 0) {
            return (T) Double.valueOf(1);
        } else {
            return (T) Double.valueOf(n.doubleValue() * esponenziale(n, (T) Double.valueOf(esponente.doubleValue() - 1)).doubleValue());
        }
    }
    

    public T fibonacci(T n) {
        if (n.doubleValue() <= 1) {
            return n;
        } else {
            return (T) Double.valueOf(fibonacci((T) Double.valueOf(n.doubleValue() - 1)).doubleValue() +fibonacci((T) Double.valueOf(n.doubleValue() - 2)).doubleValue());
        }
    }
    

    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        Calcolatrice<Double> calcolatrice;
        do {
            Double a, b;
            System.out.println(
                    "1. somma\n2. sottrazione\n3. moltiplicazione\n4. divisione\n5. fattoriale\n6. esponenziale\n7. numero della sequenza di fibonacci\n8. esci");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a, b);
                    System.out.println("il rirultato è: " + calcolatrice.somma(a, b));
                    break;

                case 2:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a, b);
                    System.out.println("la risultato è: " + calcolatrice.sottrazione(a, b));
                    break;

                case 3:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a, b);
                    System.out.println("la risultato è: " + calcolatrice.moltiplicazione(a, b));
                    break;

                case 4:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a, b);
                    System.out.println("la risultato è: " + calcolatrice.divisione(a, b));
                    break;

                case 5:

                    System.out.print("inserisci il numero del quale vuoi calcolare il fattoriale: ");
                    a = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a);
                    System.out.println("il fattoriale di " + a.intValue() + " è: " + calcolatrice.fattoriale(a));
                    break;
                case 6:

                    System.out.println("inserisci la base: ");
                    a = in.nextDouble();
                    System.out.println("inserisci l'esponente");
                    b = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a, b);
                    System.out.println("l'esponenziale è: " + calcolatrice.esponenziale(a, b));
                    break;
                case 7:

                    System.out.println("inserisci il numero della sequenza di fibonacci che vuoi visualizzare: ");
                    a = in.nextDouble();
                    calcolatrice = new Calcolatrice<Double>(a);
                    System.out.println("numero della sequenza di fibonacci numero " + a.intValue() + ": " + calcolatrice.fibonacci(a));
                    break;
                case 8:
                    System.out.println("esco");
                    break;
                default:
                    System.out.println("scelta errata");
                    break;
            }
        } while (scelta != 8);

    }

}