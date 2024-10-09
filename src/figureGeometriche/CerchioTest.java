package figureGeometriche;

import java.util.Scanner;

public class CerchioTest {
    /**
     * classe main del cerchio
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float raggio;
        float area;
        float perimetro;

        
        System.out.print("inserisci il raggio: ");
        raggio = in.nextFloat();
        
        Cerchio cerchio = new Cerchio(raggio);
        area = cerchio.area();
        perimetro = cerchio.perimetro();
        
        System.out.printf("l'area è      : %.2f \n",  area);
        System.out.printf("il perimetro è: %.2f \n",  perimetro);in.close();
    }   
}