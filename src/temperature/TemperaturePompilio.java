/*
Scrivere una classe che, date le temperature di una settimana, ne calcoli la media e restituisca i giorni con
la temperatura più alta e i giorni con la temperatura più bassa
 */
package temperature;

public class TemperaturePompilio {

    private String[] g;
    private float[] t;

    public TemperaturePompilio() {
        this.g = new String[]{"lunedì", "martedì", "mercoledì", "giovedì", "venerdì", "sabato", "domenica"};
        this.t = new float[7];
    }

    public String[] getG() {
        return g;
    }

    public float[] getT() {
        float [] array = new float[t.length];
        for (int i = 0; i < g.length; i++) {
            array[i] = t[i];
        }
        return array;
    }

    public void setT(float[] t) {
        for (int i = 0; i < t.length; i++) {
            this.t[i] = t[i];
        }
    }

    /*
    public void setT(float[] t) {
        this.t = t;
        t[0] = 10;
    }
     */
    public boolean isValido() {
        boolean is = true;

        for (int i = 0; i < g.length; i++) {
            if (!(t[i] >= -90 && t[i] <= 60)) {
                is = false;
            }
        }

        return is;
    }

    public float media() {
        float m = 0;

        for (int i = 0; i < g.length; i++) {
            m = m + t[i];
        }

        m = m / 7;

        return m;
    }

    public String max() {
        String giorno = g[0];
        float max = t[0];

        for (int i = 1; i < g.length; i++) {
            if (t[i] > max) {
                max = t[i];
                giorno = g[i];
            }
        }

        return giorno;
    }

    public String min() {
        String giorno = g[0];
        float min = t[0];

        for (int i = 1; i < g.length; i++) {
            if (t[i] < min) {
                min = t[i];
                giorno = g[i];
            }
        }

        return giorno;
    }

    public boolean aggiungiTemperatura() {
        boolean is = false;

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (t[i] == t[j] && i != j) {
                    is = false;
                    j = g.length;
                    i = g.length;
                } else {
                    is = true;
                }
            }
        }

        return is;
    }

    public float[] ordinaTemperatureCrescente() {
        int y;
        float temp;
        boolean scambio;
        float[] ordinati = new float[7];

        for (int i = 0; i < g.length; i++) {
            ordinati[i] = t[i];

        }

        int k = 6; //indice ultima posizione dell’array
        do {
            scambio = false;
            for (y = 0; y < k; y++) {
                if (ordinati[y] > ordinati[y + 1]) {
                    temp = ordinati[y];
                    ordinati[y] = ordinati[y + 1];
                    ordinati[y + 1] = temp;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);
        return ordinati;
    }

    public float[] ordinaTemperatureDecrescente() {
        int y;
        float temp;
        boolean scambio;
        float[] ordinati = new float[7];

        for (int i = 0; i < g.length; i++) {
            ordinati[i] = t[i];

        }

        int k = 6;
        do {
            scambio = false;
            for (y = 0; y < k; y++) {
                if (ordinati[y] < ordinati[y + 1]) {
                    temp = ordinati[y];
                    ordinati[y] = ordinati[y + 1];
                    ordinati[y + 1] = temp;
                    scambio = true;
                }
            }
            k--;
        } while (scambio == true);
        return ordinati;
    }

    public String[] ordinaGiorniCrescente() {
        String[] giorniOrdinati = new String[7];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (ordinaTemperatureCrescente()[i] == t[j]) {
                    giorniOrdinati[i] = g[j];
                }
            }
        }
        return giorniOrdinati;
    }

    public String[] ordinaGiorniDecrescente() {
        String[] giorniOrdinati = new String[7];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (ordinaTemperatureDecrescente()[i] == t[j]) {
                    giorniOrdinati[i] = g[j];
                }
            }
        }
        return giorniOrdinati;
    }
}