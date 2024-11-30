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
        Integer n1, n2, n3;
        String s1, s2, s3, s4;
        try {
            n1 = Integer.parseInt(targa.substring(2, 3));
            n2 = Integer.parseInt(targa.substring(3, 4));
            n3 = Integer.parseInt(targa.substring(4, 5));
            s1 = targa.substring(0, 1);
            s2 = targa.substring(1, 2);
            s3 = targa.substring(5, 6);
            s4 = targa.substring(6, 7);
        } catch (NumberFormatException ex) {
            throw new Exception("sintassi errata");
        } catch (IndexOutOfBoundsException ex) {
            throw new Exception("troppo corto");
        } catch (NullPointerException ex) {
            throw new Exception("valore nullo!");
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        //verificare la sintassi AA123BB
        //verificare che i caratteri siano maiuscoli
        //verificare che la somma dei numeri sia al massimo 20        
    }

    public static void main(String[] args) {

        try {
            Auto a = new Auto(null);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
