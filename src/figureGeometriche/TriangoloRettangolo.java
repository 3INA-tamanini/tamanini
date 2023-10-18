package figureGeometriche;

/**
 * la classe TriangoloRettangolo serve per calcolare perimetro e area di un triangolo rettangolo
 * @author tamanini luca 3INA 2023
 * @version 1.0
 */
public class TriangoloRettangolo {
    
    private double lato, base, altezza;
    
    /**
     * costruttore senza parametri <br>
     * {@link #setAltezza(double)}<br>
     * {@link #setBase(double)}<br>
     * {@link #setLato(double)}<br>
     */
    public TriangoloRettangolo(){
        
    }
    
    /** costruttore con tutti i parametri
     * 
     * @param lato
     * @param base
     * @param altezza 
     */
    public TriangoloRettangolo(double lato, double base, double altezza){
        this.lato = lato;
        this.base = base;
        this.altezza = altezza;
    }
    /**
     * restituisce il valore della base
     * @return base
     */
    public double getBase(){
        return base;
    }
    /**
     * imposta/modifica il valore della base
     * @param base base
     */
    public void setBase(double base){
        this.base = base;
    }
    /**
     * restituisce il valore dell'altezza
     * @return 
     */
    public double getAltezza(){
        return altezza;
    }
    /**
     * imposta/modifica il valore dell'altezza
     * @param altezza 
     */
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    /**
     * restituisce il valore del lato
     * @return 
     */
    public double getLato(){
        return lato;
    }
    /**
     * imposta/modifica il valore del lato
     * @param lato 
     */
    public void setLato(double lato){
        this.lato = lato;
    }
    
    /**
     * restituisce il valore dell'area
     * @return 
     */
    public double area(){
        double area;
        area = (base * altezza)/2;
        return area;
    }
    /**
     * restutuisce il valore del perimetro
     * @return 
     */
    public double perimetro(){
        double perimetro;
        perimetro = lato + base + altezza;
        return perimetro;
    }
    /**
     * restutuisce il valore degli attributi
     * @return 
     */
    public String info(){
        String testo;
        testo = "base   : " + base   + "\n" +
                "altezza: " + altezza+ "\n" + 
                "lato   : " + lato   + "\n";
        return testo;
    }
}