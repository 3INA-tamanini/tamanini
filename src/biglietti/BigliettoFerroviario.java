package biglietti;


public class BigliettoFerroviario {
    private float costo;
    private String condizione;

    public BigliettoFerroviario() {
    }

    public BigliettoFerroviario(float costo, String condizione) {
        this.costo = costo;
        this.condizione = condizione;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getCondizione() {
        return condizione;
    }

    public void setCondizione(String condizione) {
        this.condizione = condizione;
    }
    
    
    public String info(){
        String testo;
        
        testo = "costo: " + costo + "\n" +
                "condizione: " + condizione;
        return testo;
    }
    
    public float costoTot(){
        float costo;
        
        switch (condizione){
            case "P":
                costo = (this.costo * (10/100));
            case "S":
                costo = (this.costo * (15/100));
            case "D":
                costo = (this.costo * (25/100));
            default: 
                costo = this.costo;
        }
        
        return costo;
    }
}
