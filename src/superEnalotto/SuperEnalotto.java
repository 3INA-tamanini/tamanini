import java.util.Random;
public class SuperEnalotto {
    private int n;

    public SuperEnalotto(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String superEnalotto() {
        String testo = "";
        int ris = 0;
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            ris = (int) r.nextInt(10);
            testo += " " + ris;
        }

        return testo;
    }
}
