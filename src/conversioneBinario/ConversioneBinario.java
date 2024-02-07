package conversioneBinario;

public class ConversioneBinario {
    
    public static String nBinario(int n){
        String testo = Integer.toBinaryString(n);
        return testo;
    }
    
    
    public static void main(String[] args) {
        System.out.println(ConversioneBinario.nBinario(2));
    }
}
