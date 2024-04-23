package misto;

import java.util.Scanner;

/**
 *
 * @author daniel.bernardi
 */
public class TemperatureDaniloTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        float[] temperature = new float[7];
        String[] giorni = new String[7];
        
        TemperatureDanilo t = new TemperatureDanilo();
        
        /*for(int i = 0; i < temperature.length; i++){
            System.out.println("Inserire la temperatura di oggi");
            temperature[i] = in.nextFloat();
        }*/
        
        temperature = new float[] {4,5,7,2,4,8,9};
        t.setGradi(temperature);
        
        float[] temp = t.getGradi();
        
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
        t.ordinamentoCrescente();
        
        System.out.println("");
        
        for(int i = 0; i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println("Il giorno con la temperatura maggiore è: " + t.tMax());
        System.out.println("Il giorno con la temperatura minore è: " + t.tMin());
        System.out.println("La temperatura media settimanale è: " + t.tMedia());
        
        
        
        
        
        
        
        
    }
    
}
