package eserciziDevincentis;

public class Numero {
    public String tabellina(int num) {
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

    public String numeroCifre(int num) {
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

    public int fattoriale(int num) {
        int fattoriale = num;
        for (int i = 1; i < num; i++) {
            fattoriale *= i;
        }
        return fattoriale;
    }

    public String tavPitagorica() {
        String testo = "";
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                testo += (i * j) + "\t";
            }
            testo += "\n";

        }
        return testo;
    }

    public String indovinaNumero(int numInserito, int numCorretto){
		String testo = "";
		int numeroCorretto = numCorretto;
		if(numInserito == numeroCorretto){
			testo = "corretto";
        }else{
            if(numInserito<numeroCorretto)
                testo = "sbagliato" + "\n" + "più alto";
            else if(numInserito>numeroCorretto && numInserito<11)
                testo = "sbagliato" + "\n" + "più basso";
        }
		return testo;
	}

}