package Data;

public class Data {

    private static int g, m, a;

    public Data() {
    }

    public Data(int g, int m, int a) {
        this.g = g;
        this.m = m;
        this.a = a;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static String info() {
        String testo = "";
        if (g < 10 && m < 10) {
            testo = "0" + g + "/";
            testo += "0" + m + "/";
            testo += a;
        } else if (g < 10) {
            testo = "0" + g + "/";
            testo += m + "/";
            testo += a;
        } else if (m < 10) {
            testo = g + "/";
            testo += "0" + m + "/";
            testo += a;
        }
        return testo;
    }

    public static boolean isBisestile() {
        boolean an = false;
        if (a % 400 == 0 || (a % 4 == 0 && !(a % 100 == 0))) {
            an = true;
        }
        return an;
    }

    private static boolean isAnno() {
        boolean si = false;
        if (a <= 9999 && a >= 1000) {
            si = true;
        }

        return si;
    }

    private static boolean isMese() {
        boolean mese = false;
        if (m <= 12 && m > 0) {
            mese = true;
        }

        return mese;
    }

    private static boolean isGiorno() {
        boolean si = false;
        switch (m) {
            case 9:
            case 4:
            case 11:
            case 6:
                if (g > 0 && g <= 30) {
                    si = true;
                }
                break;
            case 2:
                if (isBisestile()) {
                    if (g > 0 && g <= 29) {
                        si = true;
                    }
                } else {
                    if (g > 0 && g <= 28) {
                        si = true;
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (g > 0 && g <= 31) {
                    si = true;
                }
                break;
        }
        return si;
    }

    public static boolean isValida() {
        boolean valida = false;
        if (isAnno() && isGiorno() && isMese()) {
            valida = true;
        }
        return valida;
    }
    
    public static int Ngiorni(int g2, int m2, int a2){
        int ris = 0;
        int cont = 0;
        while(g!=g2 && m!=m2 && a!=a2){
            if(isValida()){
                g++;
            }else if(m<12){
                m++;
                g = 1;
            }else{
                m = 1;
                g = 1;
                a++;
            }
        }
        
        return ris;
    }

    public static void main(String[] args) {
        int g = 29;
        int m = 2;
        int a = 1000;
        Data d = new Data(g, m, a);

        System.out.println(d.isValida());
        System.out.println(d.info());
    }
}
