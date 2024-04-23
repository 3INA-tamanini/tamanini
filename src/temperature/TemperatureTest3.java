
package temperature;


public class TemperatureTest3 {

    
    public static void main(String[] args) {
        Temperature t = new Temperature();
        
        int a = 12;
        
        t.setProva(a);
        
        System.out.println(a);
        System.out.println(t.getProva());
        
        t.modificaProva();
        
        System.out.println(t.getProva());
    }
    
    
    
}
