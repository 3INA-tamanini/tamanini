package mcm_ConvBinToDec;

import java.util.Scanner;

public class ConvBinToDec {

    private String binario;

    public ConvBinToDec() {
    }

    public ConvBinToDec(String binario) {
        this.binario = binario;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public int convBinario() {
        int decimale = 0, bit;
        int i = binario.length() - 1;
        int j = 0;
        while (i >= 0) {
            bit = this.binario.charAt(i) - '0';
            i--;
            if (bit == 1) {
                decimale += Math.pow(2, j);
            }
            j++;
        }
        return decimale;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String testo;

        System.out.println("Inserisci il numero binario");
        testo = in.nextLine();

        ConvBinToDec c = new ConvBinToDec(testo);

        System.out.println("Il valore in decimale è: " + c.convBinario());
    }

}