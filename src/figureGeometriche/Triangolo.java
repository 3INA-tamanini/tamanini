// dati i lati di un triangolo, stabilire il tipo, perimetro e area
/*dati tre segmenti qualsiasi (a,b,c) è possibile costruire un triangolo
solo se la lunghezza di ciascuno è minore della somma degli altri due
*/


package figureGeometriche;


public class Triangolo {
    final private float NF_TE;
    private float lato1,lato2,lato3;
    private String udm;
    
    
    public Triangolo() {
        NF_TE = 0.289f;
        udm = "";
    }

    public Triangolo(float lato1, float lato2, float lato3) {
        this();
        
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

    public float getNF_TE() {
        return NF_TE;
    }

    public String getUdm() {
        return udm;
    }

    public void setUdm(String udm) {
        this.udm = udm;
    }
    
    public String info(){
        String testo = "lato 1: " + lato1 + "\n" +
                       "lato 2: " + lato2 + "\n" + 
                       "lato 3: " + lato3 + "\n";
        return testo;
    }
    
    public float perimetro(){
        float p = 0;
        
        if(isTriangolo() == true){
            p = lato1+lato2+lato3;
        }
        
        return p;
    }
    
    private float semiPerimetro(){
        float semiPerimetro;
        semiPerimetro = this.perimetro()/2;
        return semiPerimetro;
    }
    
    public float area(){
        float p = perimetro()/2;
        
        float a = 0;
        if (isTriangolo()){
            a = (float) Math.sqrt(p*(p-lato1)*(p-lato2)*(p-lato3));
        }
        
        return a;
    }
    
    public String  tipo(){
        String tipo = "equilatero";
        
        if((lato1==lato2 && lato2!=lato3) ||(lato2==lato3 && lato2!=lato1) || (lato1==lato3 && lato1!=lato2)){
            tipo = "isoscele";
        }else{
            if(lato1!=lato2 && lato1!=lato3 && lato2 != lato3){
            tipo = "scaleno";
            }
        }
        
        return tipo;
    }
    
    public boolean isTriangolo(){
        boolean v = true;
        if(lato1>(lato2+lato3) && lato2>(lato1+lato3) && lato3>(lato1+lato2)){
            v = false;
        }
        return v;
    }
    
    public float apotema(){
        float a = 0;
        
        if(tipo().equals("equilatero"))
            a = lato1 * NF_TE;

        
        return a;
    }
    
    
    
    public float altezza(){
        float a;
        a = lato1 *( (float) Math.sqrt(3)/2);
        
        return a;
    }
}