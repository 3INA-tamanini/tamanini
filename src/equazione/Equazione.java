package equazione;

public class Equazione{
    private float a,b;

    
    public Equazione(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    public String soluzione(){
        String testo = "";
        float x;
        
        if(a>0){
            x = b/a;
            testo="X = " + x;
        }else if(a==0 && b==0){
            testo = "equazione indeterminata";
        }else if(a==0 && b!=0){
            testo = "equazione impossibile";
        }

        return testo;
    }
    
}