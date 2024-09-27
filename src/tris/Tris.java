package tris;
public class Tris {

    private String g1;
    private String g2;
    public String[][] campo;

    public Tris() {
        this.g1 = "X";
        this.g2 = "O";
        this.campo = new String[3][3];
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String[][] getCampo() {
        return campo;
    }

    public void setCampo(String[][] campo) {
        this.campo = campo;
    }

    public boolean giocatore1(int pos1, int pos2) {
        boolean si = false;
        if (campo[pos1][pos2] == "-") {
            campo[pos1][pos2] = "X";
            si = true;
        }
        return si;
    }

    public boolean giocatore2(int pos1, int pos2) {
        boolean si = false;
        if (campo[pos1][pos2] == "-") {
            campo[pos1][pos2] = "O";
            si = true;
        }

        return si;
    }

    public String vCampo() {
        String testo = "";
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                testo += campo[i][j] + " ";
            }
            testo += "\n";
        }
        return testo;
    }

    public void riempiCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if(campo[i][j] != "X" && campo[i][j] != "O"){
                campo[i][j] = "-";
                }
            }

        }
    }
    
    public void resetCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                campo[i][j] = "-";
            }

        }
    }

    public boolean controllaVintoG1() {
        boolean ris = false;
        for (int i = 0; i < 3; i++) {
            if (campo[i][0] == g1 && campo[i][1] == g1 && campo[i][2] == g1) {
                ris = true;
            }
            if (campo[0][i] == g1 && campo[1][i] == g1 && campo[2][i] == g1) {
                ris = true;
            }
            if (campo[0][0] == g1 && campo[1][1] == g1 && campo[2][2] == g1) {
                ris = true;
            }
            if (campo[0][2] == g1 && campo[1][1] == g1 && campo[2][0] == g1) {
                ris = true;
            }
        }
        
        return ris;
    }

    

    public boolean controllaVintoG2() {
        boolean ris = false;
        for (int i = 0; i < 3; i++) {
            if (campo[i][0] == g2 && campo[i][1] == g2 && campo[i][2] == g2) {
                ris = true;
            }
            if (campo[0][i] == g2 && campo[1][i] == g2 && campo[2][i] == g2) {
                ris = true;
            }
            if (campo[0][0] == g2 && campo[1][1] == g2 && campo[2][2] == g2) {
                ris = true;
            }
            if (campo[0][2] == g2 && campo[1][1] == g2 && campo[2][0] == g2) {
                ris = true;
            }
        }

        return ris;
    }
}
