package Verifica;


public class Poligono {
    private int n;
    private float l;

    public Poligono(){
        
    }
    
    
    public Poligono(int n, float l) {
        this.n = n;
        this.l = l;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }
    
    public boolean isPoligono(){
        boolean v;
        
        if (n>3 && n<6 && l>0)
            v = true;
        else
            v = false;
        
        return v;
    }
    
    public String tipo(){
        String t = "no";
        switch(n){
            case 3:
                t = "triangolo";
                break;
            case 4:
                t = "quadrato";
                break;
            case 5:
                t = "pentagono";
                break;
            case 6:
                t = "esagono";
                break;
        }
        return t;
    }
    
    public String info(){
        String testo = "numero lati: " + n + "\n"+ 
                       "lato: " + l;
        return testo;
    }
    public float perimetro(){
        float p;
        p = l*n;
        return p;
    }
    
    
    
}
