package figureGeometriche;

import java.util.Scanner;

public class RettangoloTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float base;
        float altezza;
        float area;
        float perimetro;
        
        System.out.print("inserisci la base  : ");
        base      = in.nextFloat();
        
        System.out.print("inserisci l'altezza: ");
        altezza   = in.nextFloat();
        
        Rettangolo rettangolo = new Rettangolo(base, altezza);
        
        area      = rettangolo.area();
        perimetro = rettangolo.perimetro();
        
        System.out.println("la base del rettangolo è  : " + rettangolo.base);
        System.out.println("l'altezza del rettangolo è: " + rettangolo.altezza);
        System.out.println("l'area è                  : " + area);
        System.out.println("il perimetro è            : " + perimetro);
        
        
    }
    
}