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
    
    private float sconto(){
        float sconto; // sconto = 0;
        
        switch (condizione){
            case "P": case "p":
                sconto = ((10 * costo)/100);
                break;
            case "S": case "s":
                sconto = ((15 * costo)/100);
                break;
            case "D": case "d":
                sconto = ((25 * costo)/100);
                break;
            default:
                sconto = 0;
                break;
        }
           
        // if(condizione == "P" || condizione == "p"){
        //     sconto = ((10 * costo)/100);
        // }

        // if(condizione == "S" || condizione == "s"){
        //     sconto = ((15 * costo)/100);
        // }

        // if(condizione == "D" || condizione == "d"){
        //     sconto = ((25 * costo)/100);
        // }
        
        return sconto;
    }


    public float costoTot(){
        float costoTot = this.costo-sconto();
        return costoTot;
    }

    
}
