package figureGeometriche;


public class Rettangolo {
    private float base;
    private float altezza;
    
    public Rettangolo(float b, float h){
        base = b;
        altezza = h;
    }
    
    
    public float getBase(){
        return base;
    }
    
    public void setBase(float base){
        this.base = base;
    }
    
    public float getAltezza(){
        return altezza;
    }
    
    public void setaltezza(float altezza){
        this.altezza = altezza;
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

    public String info(){
        String testo;
        testo = "base   : " + base   + "\n" +
                "altezza: " + altezza;
        return testo;
    }
    
}
