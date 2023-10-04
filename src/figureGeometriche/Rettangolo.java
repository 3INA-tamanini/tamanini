package figureGeometriche;


public class Rettangolo {
    public float base;
    public float altezza;
    
    public Rettangolo(float b, float h){
        base = b;
        altezza = h;
    }
    
    public float area(){
        float area;
        area = base * altezza;
        return area;
    }
    
    public float perimetro(){
        float perimetro;
        perimetro = (base + altezza)*2;
        return perimetro;
    }
    
}