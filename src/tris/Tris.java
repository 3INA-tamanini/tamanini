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

    public void riempiCampo() {
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                if (campo[i][j] != "X" && campo[i][j] != "O") {
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

    public int controllaVinto() {
        int m = 0;

        // Check rows and columns in a single loop
        for (int i = 0; i < 3; i++) {
            if ((campo[i][0].equals("X") && campo[i][1].equals("X") && campo[i][2].equals("X"))
                    || (campo[0][i].equals("X") && campo[1][i].equals("X") && campo[2][i].equals("X"))) {
                m = 1;
            }
        }

        // Check diagonals
        if ((campo[0][0].equals("X") && campo[1][1].equals("X") && campo[2][2].equals("X"))
                || // Main diagonal
                (campo[2][0].equals("X") && campo[1][1].equals("X") && campo[0][2].equals("X"))) { // Anti-diagonal
            m = 1;
        }

        for (int i = 0; i < 3; i++) {
            if ((campo[i][0].equals("O") && campo[i][1].equals("O") && campo[i][2].equals("O"))
                    || (campo[0][i].equals("O") && campo[1][i].equals("O") && campo[2][i].equals("O"))) {
                m = 2;
            }
        }

        // Check diagonals
        if ((campo[0][0].equals("O") && campo[1][1].equals("O") && campo[2][2].equals("O"))
                || // Main diagonal
                (campo[2][0].equals("O") && campo[1][1].equals("O") && campo[0][2].equals("O"))) { // Anti-diagonal
            m = 2;
        }

        return m;
    }
}
