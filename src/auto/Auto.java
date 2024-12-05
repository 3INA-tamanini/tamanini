package auto;

public class Auto {
    private String targa;

    public Auto() {
    }

    public Auto(String targa) throws Exception {
        setTarga(targa);
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) throws Exception {

        if (targa == null) {
            throw new NullPointerException("La targa non può essere nulla!");
        }

        if (targa.length() != 7) {
            throw new Exception("La lunghezza della targa deve essere di 7 caratteri.");
        }

        char lettera1 = targa.charAt(0);
        char lettera2 = targa.charAt(1);
        if (!Character.isUpperCase(lettera1) || !Character.isUpperCase(lettera2)) {
            throw new Exception("Le prime due lettere devono essere maiuscole.");
        }

        char numero1 = targa.charAt(2);
        char numero2 = targa.charAt(3);
        char numero3 = targa.charAt(4);
        if (!Character.isDigit(numero1) || !Character.isDigit(numero2) || !Character.isDigit(numero3)) {
            throw new Exception("I caratteri centrali devono essere numeri.");
        }

        int n1 = Character.getNumericValue(numero1);
        int n2 = Character.getNumericValue(numero2);
        int n3 = Character.getNumericValue(numero3);
        int somma = n1 + n2 + n3;
        if (somma > 20) {
            throw new Exception("La somma dei numeri centrali non deve superare 20.");
        }

        char lettera3 = targa.charAt(5);
        char lettera4 = targa.charAt(6);
        if (!Character.isUpperCase(lettera3) || !Character.isUpperCase(lettera4)) {
            throw new Exception("Le ultime due lettere devono essere maiuscole.");
        }

        this.targa = targa;
    }

    public static void main(String[] args) {
        try {
            Auto a1 = new Auto("AB923CD");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
