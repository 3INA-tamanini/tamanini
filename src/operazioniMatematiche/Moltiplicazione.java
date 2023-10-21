package operazioniMatematiche;


public class Moltiplicazione {
    public float n1;
    public float n2;
    
    public Moltiplicazione(float numero1, float numero2){
        n1 = numero1;
        n2 = numero2;
    }
    
    /** 
     * @return float
     */
    public float Esegui(){
        float risultato;
        risultato = n1 * n2;
        return risultato;
    }
}