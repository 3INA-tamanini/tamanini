package meteo;
import java.util.Scanner;
public class MeteoTest{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int temperatura;

        System.out.print("inserisci la temperatura: ");
        temperatura = in.nextInt();

        Meteo meteo = new Meteo(temperatura);

        System.out.println(meteo.consiglio());
        System.out.println(meteo.consiglio2());
        System.out.println(meteo.consiglio3());
        System.out.println(meteo.consiglio4());
        in.close();}
}