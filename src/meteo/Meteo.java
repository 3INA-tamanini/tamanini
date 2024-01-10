package meteo;

/**
 * la classe metodo serve per dare dei consigli riguardo la temperatura
 *
 * @author luca.tamanini 3INA 2024
 * @version 1.0
 */
public class Meteo {

    private int temperatura;

    /**
     * costruttore senza {@link #setTemperatura(int t)}
     */
    public Meteo() {
    }

    /**
     * costruttore con i parametri
     *
     * @param temperatura
     */
    public Meteo(int temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * metodi getter della temperatura
     *
     * @return int
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * metodo setter per impostare la temperatura
     *
     * @param temperatura
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * restituisce il valore dell'attributo
     *
     * @return String
     */
    public String info() {
        String testo = "temperatura" + temperatura;
        return testo;
    }

    /**
     * serve per fare il consiglio in base alla temperatura
     *
     * @return String
     */
    public String consiglio() {
        String testo = "";
        if (temperatura < 0) {
            testo = "attenti al ghiaccio";
        }
        if (temperatura == 0) {
            testo = "si va a sciare";
        }
        if (temperatura > 0 && temperatura < 5) {
            testo = "ci vuole il cappellino";
        }
        if (temperatura > 5 && temperatura <= 10) {
            testo = "basta il piumino";
        }
        if (temperatura > 10 && temperatura <= 15) {
            testo = "solo il maglioncino";
        }
        if (temperatura > 15 && temperatura <= 20) {
            testo = "magari!";
        }
        if (temperatura > 20 && temperatura <= 25) {
            testo = "condizionatore a manetta!";
        }

        return testo;
    }

    public String consiglio2() {
        String testo = "";
        if (temperatura < 0) {
            testo = "attenti al ghiaccio";
        } else if (temperatura == 0) {
            testo = "si va a sciare";
        } else if (temperatura > 0 && temperatura < 5) {
            testo = "ci vuole il cappellino";
        } else if (temperatura > 5 && temperatura <= 10) {
            testo = "basta il piumino";
        } else if (temperatura > 10 && temperatura <= 15) {
            testo = "solo il maglioncino";
        } else if (temperatura > 15 && temperatura <= 20) {
            testo = "magari!";
        } else if (temperatura > 20 && temperatura <= 25) {
            testo = "condizionatore a manetta!";
        }
        return testo;
    }

    public String consiglio3() {
        String testo = "";

        if (temperatura > 0){
            if(temperatura>=1){
                if(temperatura>=5){
                    if (temperatura>=10){
                        if (temperatura>=15){
                            if (temperatura>=20){
                                if (temperatura>25){
                                    testo = "condizionatore a manetta!";
                                }
                            }else{
                                testo = "tutti al mare!";
                            }
                        }else{
                            testo = "magari!";
                        }
                    }else{
                        testo = "solo il maglioncino";
                    }
                }else{
                    
                }
            }else{
                
            }
        }else{
            
        }
        return testo;
    }

    public String consiglio4() {
        String testo = "";

        return testo;
    }

}
