package temperature;

public class Temperature {
    private float[] temp = new float[7];

    public Temperature(float[] temp) {
        this.temp = temp;
    }

    public float[] getTemp() {
        return temp;
    }

    public void setTemp(float[] temp) {
        this.temp = temp;
    }

    public float media() {
        int media = 0;
        for (int i = 0; i < temp.length; i++) {
            media += temp[i];
        }
        media = media / 7;
        return media;
    }

    public String gMax() {
        float max = temp[0];
        int cont = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > max) {
                cont = i;
                max = temp[i];
            }
        }
        String giorno = "";
        switch (cont) {
            case 0:
                giorno = "lunedi";
                break;
            case 1:
                giorno = "martedi";
                break;
            case 2:
                giorno = "mercoledi";
                break;
            case 3:
                giorno = "giovedi";
                break;
            case 4:
                giorno = "venerdi";
                break;
            case 5:
                giorno = "sabato";
                break;
            case 6:
                giorno = "domenica";
                break;
            default:
                giorno = "sbagliato";
        }
        return giorno;
    }

    public String gMin() {
        float min = temp[0];
        int cont = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < min) {
                cont = i;
                min = temp[i];
            }
        }
        String giorno = "";
        switch (cont) {
            case 0:
                giorno = "lunedi";
                break;
            case 1:
                giorno = "martedi";
                break;
            case 2:
                giorno = "mercoledi";
                break;
            case 3:
                giorno = "giovedi";
                break;
            case 4:
                giorno = "venerdi";
                break;
            case 5:
                giorno = "sabato";
                break;
            case 6:
                giorno = "domenica";
                break;
            default:
                giorno = "sbagliato";
        }
        return giorno;
    }

    public boolean aggiungiTemp(String giorno, float temperatura) {
        boolean corretto = true;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == temperatura) {
                corretto = false;
                break;
            }
        }

        if (corretto) {
            switch (giorno) {
                case "lunedi":
                    temp[0] = temperatura;
                    break;
                case "martedi":
                    temp[1] = temperatura;
                    break;
                case "mercoledi":
                    temp[2] = temperatura;
                    break;
                case "giovedi":
                    temp[3] = temperatura;
                    break;
                case "venerdi":
                    temp[4] = temperatura;
                    break;
                case "sabato":
                    temp[5] = temperatura;
                    break;
                case "domenica":
                    temp[6] = temperatura;
                    break;
            }
        }

        return corretto;
    }

}