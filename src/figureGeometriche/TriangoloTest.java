package figureGeometriche;

import java.util.Scanner;

public class TriangoloTest {

    
    public static void main(String[] args) {
        
        float l1,l2,l3;
        Scanner in = new Scanner(System.in);
        
        System.out.print("inserisci il lato 1: ");
        l1=in.nextFloat();
        
        System.out.print("inserisci il lato 2: ");
        l2=in.nextFloat();
        
        System.out.print("inserisci il lato 3: ");
        l3=in.nextFloat();
        
        Triangolo t = new Triangolo(l1,l2,l3);
        
        t.setUdm("cm");
        
        System.out.println(t.info());
        System.out.println(t.perimetro() + " " + t.getUdm());
        System.out.println(t.area() + " " + t.getUdm());
        System.out.println(t.tipo());
        
        if(t.isTriangolo()){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
        System.out.println(t.altezza() + " " + t.getUdm());
        System.out.println(t.apotema());
        
        in.close();
        // String testo;
        // testo = t.isTriangolo()== true ? "si" : "no";
    }
}