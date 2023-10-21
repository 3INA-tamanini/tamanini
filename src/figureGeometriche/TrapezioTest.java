package figureGeometriche;
import java.util.Scanner;

public class TrapezioTest {
/**
 * classe main del trapezio
 * @param args
 */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double base1, base2, altezza, lato, area, perimetro;

    System.out.println("inserisci la base maggiore: ");
    base1=in.nextDouble();
    System.out.println("inserisci la base minore: ");
    base2=in.nextDouble();
    System.out.println("inserisci l'altezza: ");
    altezza = in.nextDouble();
    System.out.println("inserisci il lato: ");
    lato = in.nextDouble();

    Trapezio trapezio = new Trapezio(base1,base2,altezza,lato);
    area = trapezio.area();
    perimetro = trapezio.perimetro();

    System.out.println("l'area è: " + area);
    System.out.println("il perimetro è: " + perimetro);
  }
}