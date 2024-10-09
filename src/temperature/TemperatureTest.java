package temperature;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        float[] temperature = { 12.1f, 234.023f, 21, 2.9f, 333, 3.3f, 90 };
        Temperature t = new Temperature(temperature);
        Scanner in = new Scanner(System.in);
        int scelta;
        do {

            System.out.println("\n1 - visualizzare temperature");
            System.out.println("2 - media");
            System.out.println("3 - temperatura maggiore");
            System.out.println("4 - temperatura minore");
            System.out.println("5 - inserisci temperatura");
            System.out.println("6 - esci");
            System.out.println("inserisci un'opzione: ");
            scelta = in.nextInt();
            switch (scelta) {
                case 2:
                    System.out.println("la media è: " + t.media());
                    break;
                case 3:
                    System.out.println("il giorno con la temperatura maggiore è: " + t.gMax());
                    break;
                case 4:
                    System.out.println("il giorno con la temperatura minore è: " + t.gMin());
                    break;
                case 5:
                    System.out.print("inserisci il giorno in cui inserire la temperatura: ");
                    String giorno = in.next();
                    System.out.print("inserisci la temperatura: ");
                    float temp = in.nextFloat();
                    if (t.aggiungiTemp(giorno, temp)) {
                        System.out.println("temperatura inserita correttamente");
                    } else {
                        System.out.println("temperatura già esistente");
                    }
                    temperature = t.getTemp();
                    break;
                case 1:
                    for (int i = 0; i < temperature.length; i++) {
                        System.out.print(temperature[i] + " ");
                    }
                    break;
            }
        } while (scelta != 6);
        in.close();
    }
}
