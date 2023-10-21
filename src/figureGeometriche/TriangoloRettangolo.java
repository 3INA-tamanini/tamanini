package figureGeometriche;


public class TriangoloRettangolo {
    
    private double lato, base, altezza;
    /**
     * metodo costruttore
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
     * metodo get della base
     * @return base
     */
    public double getBase(){
        return base;
    }
    /**
     * metodo set della base
     * @param base
     */
    public void setBase(double base){
        this.base = base;
    }
    /**
     * metodo get dell'altezza
     * @return altezza
     */
    public double getAltezza(){
        return altezza;
    }
    /**
     * metodo set dell'altezza
     * @param altezza
     */
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    /**
     * metodo get del lato
     * @return lato
     */
    public double getLato(){
        return lato;
    }
    /**
     * metodo set del lato
     * @param lato
     */
    public void setLato(double lato){
        this.lato = lato;
    }
    
    /**
     * metodo per calcolare l'area
     * @return area
     */
    public double area(){
        double area;
        area = (base * altezza)/2;
        return area;
    }
    /**
     * metodo per calcolare il perimetro
     * @return perimetro
     */
    public double perimetro(){
        double perimetro;
        perimetro = lato + base + altezza;
        return perimetro;
    }
    /**
     * metodo per visualizzare gli attributi della classe
     * @return testo
     */
    public String info(){
        String testo;
        testo = "base   : " + base   + "\n" +
                "altezza: " + altezza+ "\n" + 
                "lato   : " + lato   + "\n";
        return testo;
    }
}