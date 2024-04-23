public class ConvBinToDec {

    private String numero;

    public ConvBinToDec() {
    }

    public ConvBinToDec(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int conversione() {

        int k = 0;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '1') {
                k += Math.pow(2, numero.length() - i - 1);
            } else if (numero.charAt(i) == '0') {

            } else {
                k = -1;

            }
        }
        return k;
    }

}