package quadrati;

public class Quadrati2 {

    private int n;

    public Quadrati2(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    private boolean isVero() {
        boolean t = false;
        if (n >= 1 && n <= 20)
            t = true;
        
        return t;
    }

    public String quadrati() {
        String testo = "";
        if (isVero()) {
            for (int i = 0; i <= n; i++) {
                testo += i + " X " + i + " = " + (i * i) + "\n";
            }
        }else{
            testo= "numero errato";
        }
        return testo;
    }

}