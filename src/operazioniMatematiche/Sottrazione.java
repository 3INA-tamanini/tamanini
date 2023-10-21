package operazioniMatematiche;


public class Sottrazione {
    public float n1;
    public float n2;
    
    public Sottrazione(float numero1, float numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    
    /** 
     * @return float
     */
    public float esegui(){
        float sottrazione;
        sottrazione = n1-n2;
        return sottrazione;
    }
}
