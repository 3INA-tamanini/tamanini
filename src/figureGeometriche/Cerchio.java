package figureGeometriche;
 //bella li
public class Cerchio {
    private float raggio;
    
    public Cerchio(float r){
        raggio = r;
    }
    
    public float getRaggio(){
        return raggio;
    }
    
    public void setRaggio(float raggio){
        this.raggio = raggio;
    }
    
    public float area(){
        float area;
        area = 3.14f*(raggio*raggio);
        return  area;
    }
    
    public float perimetro(){ // funzione perimetro
        float perimetro;
        perimetro = 3.14f * (raggio * 2);
        return perimetro;
    }

    public String info(){
        String testo = "il raggio è: " + raggio;
        return testo;
    }
}

    
