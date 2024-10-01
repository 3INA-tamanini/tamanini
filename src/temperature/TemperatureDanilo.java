package temperature;

/**
 * Scrivere una classe che, date le temperature di una settimana, ne calcoli la
 * media e restituisca i giorni con la temperatura più alta e i giorni con
 * quella più bassa.
 *
 * @author daniel.bernardi
 */
public class TemperatureDanilo {

    private String[] giorni;
    private float[] gradi;
    private float prova;

    public TemperatureDanilo() {
        gradi = new float[7];
        giorni = new String[]{"lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};
    }

    public float[] getGradi() {
        return gradi;
    }

    public void setGradi(float[] gradi) {
        if (isValido()) {
            for(int i=0;i<gradi.length;i++){
                this.gradi[i] = gradi[i];    
            }
        }   
    }

    public float getProva() {
        return prova;
    }

    public void setProva(float prova) {
        this.prova = prova;
    }

    public boolean isValido() {
        boolean valido = false;

        for (int i = 0; i < gradi.length; i++) {
            if (gradi[i] > -90 && gradi[i] < 60) {
                valido = true;
            }

        }

        return valido;
    }

    public boolean aggiungiTemperatura(String giorno, float temperatura) {
        boolean controllo = true;

        for (int i = 0; i < gradi.length; i++) {
            float t = gradi[i];
            if (gradi[i] == t) {
                controllo = false;
            }
        }

        return controllo;
    }

    public String tMax() {
        return giorni[6];
    }

    public String tMin() {
        return giorni[0];
    }

    public float tMedia() {
        float media = 0;

        for (int i = 0; i < gradi.length; i++) {
            media += gradi[i];
        }

        media /= giorni.length;

        return media;
    }
    
    public void ordinamentoCrescente(){
        float temp;
        int h;
        for(int i=0;i<gradi.length;i++){
            for(int j=0;j<gradi.length;j++){
                if(gradi[i]<gradi[j]){
                    temp = gradi[i];
                    gradi[i]=gradi[j];
                    gradi[j]=temp;
                    h=i;
                    giorni[i]=giorni[j];
                    giorni[j]=giorni[h];
                }
            }
        }
    }
    
    public void ordinamentoDecrescente(){
        float temp;
        for(int i=0;i<gradi.length;i++){
            for(int j=0;j<gradi.length;j++){
                if(gradi[i]>gradi[j]){
                    temp = gradi[i];
                    gradi[i]=gradi[j];
                    gradi[j]=temp;
                }
            }
        }
    }
    
    public void modificaProva(){
        prova=100;
    }

}
