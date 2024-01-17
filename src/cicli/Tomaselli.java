package cicli;


public class Tomaselli {
    String testo;

    public Tomaselli() {
    }

    public Tomaselli(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }
    
    public String info(){
        String testo = "testo" + this.testo;
        return testo;
    }
    
    public String tomaToma(int n){
        String testo = "";
        for (int i = 0; i < n; i++) {
            testo = testo + this.testo + "\n";
        }
        
        return testo;
    }
}
