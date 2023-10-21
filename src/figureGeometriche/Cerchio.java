package figureGeometriche;

public class Cerchio {
    private float raggio;
    /**
     * metodo costruttore
     * @param r
     */
    public Cerchio(float r){
        raggio = r;
    }
    /**
     * metodo get per ottenere il raggio
     * @return raggio
     */
    public float getRaggio(){
        return raggio;
    }
    /**
     * metodo set per modificare il raggio
     * @param raggio
     */
    public void setRaggio(float raggio){
        this.raggio = raggio;
    }
    /**
     * metodo per calcolare l'area del cerchio
     * @return area
     */
    public float area(){
        float area;
        area = 3.14f*(raggio*raggio);
        return  area;
    }
    /**
     * metodo per calcolare il perimetro
     * @return perimetro
     */
    public float perimetro(){ 
        float perimetro;
        perimetro = 3.14f * (raggio * 2);
        return perimetro;
    }
    /**
     * metodo per visualizzare le info dell'oggetto
     * @return testo
     */
    public String info(){
        String testo = "il raggio è: " + raggio;
        return testo;
    }
}

    
