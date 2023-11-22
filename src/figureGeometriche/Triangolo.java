// dati i lati di un triangolo, stabilire il tipo, perimetro e area

package figureGeometriche;


public class Triangolo {
    private float lato1,lato2,lato3;

    public Triangolo() {
    }

    public Triangolo(float lato1, float lato2, float lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    // metodi getter e setter

    public float getLato1() {
        return lato1;
    }

    public float getLato2() {
        return lato2;
    }

    public float getLato3() {
        return lato3;
    }

    public void setLato1(float lato1) {
        this.lato1 = lato1;
    }

    public void setLato2(float lato2) {
        this.lato2 = lato2;
    }

    public void setLato3(float lato3) {
        this.lato3 = lato3;
    }
    
    public String info(){
        String testo = "lato 1: " + lato1 + "\n" +
                       "lato 2: " + lato2 + "\n" + 
                       "lato 3: " + lato3 + "\n";
        return testo;
    }
    
    public float  perimetro(){
        return lato1+lato2+lato3;
    }
    
    private float semiPerimetro(){
        float semiPerimetro;
        semiPerimetro = this.perimetro()/2;
        return semiPerimetro;
    }
    
    public double area(){
        float p = this.perimetro()/2;
        float a = (float) Math.sqrt(p*(p-lato1)*(p-lato2)*(p-lato3));
        return a;
    }
    
    public String  tipo(){
        String tipo = "";
        
        if(lato1==lato2 && lato1==lato3){
            tipo = "equilatero";
        }
        
        if(lato1!=lato2 && lato1!=lato3 && lato2 != lato3){
            tipo = "scaleno";
        }
        
        if ((lato1==lato2 && lato2!=lato3) ||(lato2==lato3 && lato2!=lato1) || (lato1==lato3 && lato1!=lato2)){
            tipo = "isoscele";
        }
        
        return tipo;
    }
}
