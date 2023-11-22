package figureGeometriche;


public class Rettangolo {
    private float base;
    private float altezza;
    /**
     * metodo costruttore
     * @param b
     * @param h
     */
    public Rettangolo(float b, float h){
        base = b;
        altezza = h;
    }
    
    /**
     * metodo get della base
     * @return base
     */
    public float getBase(){
        return base;
    }
    /**
     * metodo set della base
     * @param base
     */
    public void setBase(float base){
        this.base = base;
    }
    /**
     * metodo get dell'altezza
     * @return altezza
     */
    public float getAltezza(){
        return altezza;
    }
    /**
     * metodo set dell'altezza
     * @param altezza
     */
    public void setaltezza(float altezza){
        this.altezza = altezza;
    }
    
    /**
     * metodo per calcolare l'area
     * @return area
     */
    public float area(){
        float area;
        area = base * altezza;
        return area;
    }
    /**
     * metodo per calcolare il perimetro
     * @return perimetro
     */
    public float perimetro(){
        float perimetro;
        perimetro = (base + altezza)*2;
        return perimetro;
    }

    /**
     * metodo per visualizzare le informazioni della classe
     * @return testo
     */
    public String info(){
        String testo;
        testo = "base   : " + base   + "\n" +
                "altezza: " + altezza;
        return testo;
    }
    
}
