
package figureGeometriche;


public class TriangoloScaleno {
    public float lato1;
    public float lato2;
    public float lato3;
    /**
     * metodo costruttore
     * @param l1
     * @param l2
     * @param l3
     */
    public TriangoloScaleno(float l1,float l2,float l3){
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
    }
    /**
     * metodo get del lato 1
     * @return lato1
     */
    public float getLato1(){
        return lato1;
    }
    /**
     * metodo get del lato 2
     * @return lato 2
     */
    public float getLato2(){
        return lato2;
    }
    /**
     * metodo get del lato 3
     * @return lato3
     */
    public float getLato3(){
        return lato3;
    }
    
    /**
     * metodo set del lato 1
     * @param lato1
     */
    public void setLato1(float lato1){
        this.lato1 = lato1;
    }
    /**
     * metodo set del lato 2
     * @param lato2
     */
    public void setLato2(float lato2){
        this.lato2 = lato2;
    }
    /**
     * metodo set del lato 3
     * @param lato3
     */
    public void setLato3(float lato3){
        this.lato3 = lato3;
    }
    /**
     * metodo per calcolare il perimetro
     * @return perimetro
     */
    public float perimetro(){
        float perimetro = lato1 + lato2 + lato3;
        return perimetro;
    }
    /**
     * metodo per calcolare l'area
     * @return area
     */
    public double area(){
        float semiperimetro = perimetro()/2;
        double area;
        area = Math.sqrt(semiperimetro*(semiperimetro-lato1)*(semiperimetro-lato2)*(semiperimetro-lato3));
        return area;
    }
    /**
     * metodo per visualizzare i lati
     * @return testo
     */
    public String info(){
        String testo;
        testo = "lato1   : " + lato1   + "\n" +
                "lato2   : " + lato2   + "\n" + 
                "lato3   : " + lato3   + "\n";
        return testo;
    }
}
