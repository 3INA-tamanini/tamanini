
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
    
    public float getLato1(){
        return lato1;
    }
    
    public float getLato2(){
        return lato2;
    }
    
    public float getLato3(){
        return lato3;
    }
    
    
    public void setLato1(float lato1){
        this.lato1 = lato1;
    }
    
    public void setLato2(float lato2){
        this.lato2 = lato2;
    }
    
    public void setLato3(float lato3){
        this.lato3 = lato3;
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
    public String info(){
        String testo;
        testo = "lato1   : " + lato1   + "\n" +
                "lato2   : " + lato2   + "\n" + 
                "lato3   : " + lato3   + "\n";
        return testo;
    }
}
