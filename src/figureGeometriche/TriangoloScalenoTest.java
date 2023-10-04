package figureGeometriche;

import java.util.Scanner;

public class TriangoloScalenoTest{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        float lato1, lato2, lato3, perimetro;
        
        double area;
        
        System.out.print("inserisci il valore del lato 1: ");
        lato1 = in.nextFloat();
        
        System.out.print("inserisci il valore del lato 2: ");
        lato2 = in.nextFloat();
        
        System.out.print("inserisci il valore del lato 3: ");
        lato3 = in.nextFloat();

        TriangoloScaleno ts = new TriangoloScaleno(lato2, lato1, lato3);

        area = ts.area();
        perimetro = ts.perimetro();

        System.out.println("l'area del triangolo scaleno è      : " + area);
        System.out.println("il perimetro del triangolo scaleno è: " + perimetro);
    }

}