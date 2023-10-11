package figureGeometriche;

import java.util.Scanner;

public class TriangoloRettangoloTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lato, base, altezza, area, perimetro;
        
        System.out.print("inserisci il lato  : ");
        lato = in.nextDouble();
        
        System.out.print("inserisci la base  : ");
        base = in.nextDouble();
        
        System.out.print("inserisci l'altezza: ");
        altezza = in.nextDouble();
        
        
        TriangoloRettangolo tr = new TriangoloRettangolo(lato, base, altezza);
        
        area = tr.area();
        perimetro = tr.perimetro();
        
        System.out.println("l'area è       :  " +  area);
        System.out.println("il perimetro è:  " + perimetro);
        
    }
    
}