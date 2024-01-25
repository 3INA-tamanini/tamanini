package eserciziDevincentis;

public class Numero {
    private int num;

    public Numero() {
    }

    public Numero(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String tabellina() {
        int risultato;
        String str = "";
        int i = 1;
        while (i <= 10) {
            risultato = num * i;
            str += num + " X " + i + " = " + risultato + "\n";
            i++;
        }

        return str;
    }

    public String numeroCifre() {
        int i = 0;
        String testo = "";
        if (num == 0) {
            testo = "1 cifra";
        } else {
            while (num != 0) {
                num = num / 10;
                i++;
            }
            testo = i + " cifre";
        }
        return testo;
    }

    public int fattoriale() {
        int fattoriale = num;
        for (int i = 1; i < num; i++) {
            fattoriale *= i;
        }
        return fattoriale;
    }

}