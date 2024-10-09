
package temperature;


public class TemperatureTest2 {

    
    public static void main(String[] args) {
        Temperature t = new Temperature();
        float temp[];
        temp = new float[]{12,3,5};
        
        
        t.setTemp(temp);
        
        
        for (int i = 0; i < temp.length; i++) {
            System.out.println(t.getTemp()[i]);
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] + " ");
            
        }
        
        
        
    }
    
}
