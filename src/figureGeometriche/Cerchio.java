package figureGeometriche;

public class Cerchio {
    public float raggio;
    
    public Cerchio(float r){
        raggio = r;
    }
    
    public float area(){
        float area;
        area = 3.14f*(raggio*raggio);
        return  area;
    }
    
    public float perimetro(){
        float perimetro;
        perimetro = 3.14f * (raggio * 2);
        return perimetro;
    }
}

    