package figureGeometriche;


public class TriangoloRettangolo {
    
    public double lato, base, altezza;
    
    public TriangoloRettangolo(double lato, double base, double altezza){
        this.lato = lato;
        this.base = base;
        this.altezza = altezza;
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
    
    
}