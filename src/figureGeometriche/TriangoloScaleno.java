
package figureGeometriche;


public class TriangoloScaleno {
    public float lato1;
    public float lato2;
    public float lato3;
    
    public TriangoloScaleno(float l1,float l2,float l3){
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
    }
    
    public float perimetro(){
        float perimetro = lato1 + lato2 + lato3;
        return perimetro;
    }
    
    public double area(){
        float semiperimetro = perimetro()/2;
        double area;
        area = Math.sqrt(semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3));
        return area;
    }
}  