package figureGeometriche;


public class TriangoloRettangolo {
    
    private double lato, base, altezza;
    
    public TriangoloRettangolo(double lato, double base, double altezza){
        this.lato = lato;
        this.base = base;
        this.altezza = altezza;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getAltezza(){
        return altezza;
    }
    
    public void setAltezza(double altezza){
        this.altezza = altezza;
    }
    
    public double getLato(){
        return lato;
    }
    
    public void setLato(double lato){
        this.lato = lato;
    }
    
    
    public double area(){
        double area;
        area = (base * altezza)/2;
        return area;
    }
    
    public double perimetro(){
        double perimetro;
        perimetro = lato*3;
        return perimetro;
    }
    
    public String info(){
        String testo;
        testo = "base   : " + base   + "\n" +
                "altezza: " + altezza+ "\n" + 
                "lato   : " + lato   + "\n";
        return testo;
    }
}