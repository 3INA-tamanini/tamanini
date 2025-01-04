package ambrosi_compiti;

import java.util.Scanner;

public class Calcolatrice<T extends Number> {

    public Double somma(T n, T m) {
        return (n.doubleValue() + m.doubleValue());
    }

    public Double sottrazione(T n, T m) {
        return (n.doubleValue() - m.doubleValue());
    }

    public Double moltiplicazione(T n, T m) {
        return (n.doubleValue() * m.doubleValue());
    }

    public Double divisione(T n, T m) throws Exception {
        if (m.doubleValue() == 0.0) {
            throw new Exception("non puoi dividere per 0");
        }
        return (n.doubleValue() / m.doubleValue());
    }

    public Integer fattoriale(Integer n) throws Exception {
        if (n < 0) {
            throw new Exception("il numero deve essere >= 0");
        } else {
            if (n <= 1) {
                return 1;
            } else {
                return (n * fattoriale(n - 1));
            }
        }

    }

    public Double esponenziale(T n, Double esponente) {
        if (esponente <= 0) {
            return 1.0;
        } else {
            return (n.doubleValue() * esponenziale(n, esponente - 1));
        }
    }

    public Integer fibonacci(Integer a) throws Exception {
        if (a < 0) {
            throw new Exception("il numero deve essere >= 0");
        } else {
            if (a.intValue() <= 1) {
                return a.intValue();
            } else {
                return (fibonacci(a - 1) + fibonacci(a - 2));
            }
        }

    }

    public static void main(String[] args) throws Exception {
        int scelta;
        Scanner in = new Scanner(System.in);
        Calcolatrice<Double> calcolatrice = new Calcolatrice<>();
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

                    System.out.println("il risultato è: " + calcolatrice.somma(a, b));
                    break;

                case 2:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();

                    System.out.println("la risultato è: " + calcolatrice.sottrazione(a, b));
                    break;

                case 3:

                    System.out.print("inserisci il primo numero: ");
                    a = in.nextDouble();
                    System.out.print("inserisci il secondo numero: ");
                    b = in.nextDouble();

                    System.out.println("la risultato è: " + calcolatrice.moltiplicazione(a, b));
                    break;

                case 4:
                    try {
                        System.out.print("inserisci il primo numero: ");
                        a = in.nextDouble();
                        System.out.print("inserisci il secondo numero: ");
                        b = in.nextDouble();

                        System.out.println("la risultato è: " + calcolatrice.divisione(a, b));
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                case 5:
                    try {
                        System.out.print("inserisci il numero del quale vuoi calcolare il fattoriale: ");
                        a = in.nextDouble();

                        System.out.println(
                                "il fattoriale di " + a.intValue() + " è: " + calcolatrice.fattoriale(a.intValue()));
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                case 6:

                    System.out.print("inserisci la base: ");
                    a = in.nextDouble();
                    System.out.print("inserisci l'esponente: ");
                    b = Double.parseDouble(in.next());

                    System.out.println("l'esponenziale è: " + calcolatrice.esponenziale(a, b));
                    break;
                case 7:
                    try {
                        System.out.println("inserisci il numero della sequenza di fibonacci che vuoi visualizzare: ");
                        a = in.nextDouble();

                        System.out.println("numero della sequenza di fibonacci numero " + a.intValue() + ": "
                                + calcolatrice.fibonacci(a.intValue()));
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        break;
                    }

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