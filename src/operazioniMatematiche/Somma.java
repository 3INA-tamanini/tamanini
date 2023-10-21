package operazioniMatematiche;


public class Somma {
    public float n1;
    public float n2;
    
    public Somma(float numero1, float numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    /** 
     * @return float
     */
    public float Esegui(){
        float somma;
        somma = n1 + n2;
        return somma;
    }
}