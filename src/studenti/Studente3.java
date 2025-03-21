package studenti;

import java.util.logging.Level;

import java.util.logging.Logger;
import persone.Persona8A;

public class Studente3 extends Studente2 implements Cloneable {

    public Studente3() {
        super();
    }

    public Studente3(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email, String password) throws Exception {
        super(classe, isRipetente, altezza, cognome, nome, peso, dataDiNascita, email, password);
    }

    @Override

    protected Studente3 clone() throws CloneNotSupportedException {
        Studente3 copia = (Studente3) super.clone();
        return copia;
    }

    @Override

    public boolean equals(Object o) {

        if (o instanceof Studente3) {
            Studente3 ogg = (Studente3) o;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

            if (ogg.getClasse() == this.getClasse()
                    && ogg.getIsRipetente() == this.getIsRipetente()
                    && ogg.getAltezza() == this.getAltezza()
                    && ogg.getCognome() == this.getCognome()
                    && ogg.getNome() == this.getNome()
                    && ogg.getPeso() == this.getPeso()
                    && ogg.getDataDiNascita() == this.getDataDiNascita()
                    && ogg.getEmail() == this.getEmail()
                    && ogg.getPassword() == this.getPassword()) {
                if (ogg.getVoti().size() == this.getVoti().size()) {
                    for (int i = 0; i < this.getVoti().size(); i++) {
                        if (ogg.getVoti().get(i) != this.getVoti().get(i)) {
                            return false;
                        }
                    }
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;

    }

    @Override

    public String toString() {

        String s = SCUOLA + "\n";
        String nD = "non disponibile";
        String vot = "";

        if (this.getVoti() != null) {
            for (int i = 0; i < this.getVoti().size(); i++) {
                if (i == 0) {
                    vot = vot + this.getVoti().get(i);
                } else {
                    vot = vot + ", " + this.getVoti().get(i);
                }
            }
        } else {
            vot = nD;
        }

        if (this.getClasse() != null) {
            s = s + "Classe     : " + this.getClasse() + "\n";
        } else {
            s = s + "Classe     : " + nD + "\n";
        }

        if (this.getIsRipetente() != null) {
            s = s + "Ripetente  : " + this.getIsRipetente() + "\n";
        } else {
            s = s + "Ripetente  : " + nD + "\n";
        }

        if (this.getAltezza() != null) {
            s = s + "Altezza    : " + this.getAltezza() + "\n";
        } else {
            s = s + "Altezza    : " + nD + "\n";
        }

        if (this.getCognome() != null) {
            s = s + "Cognome    : " + this.getCognome() + "\n";
        } else {
            s = s + "Cognome    : " + nD + "\n";
        }

        if (this.getNome() != null) {
            s = s + "Nome       : " + this.getNome() + "\n";
        } else {
            s = s + "Nome       : " + nD + "\n";
        }

        if (this.getPeso() != null) {
            s = s + "Peso       : " + this.getPeso() + "\n";
        } else {
            s = s + "Peso       : " + nD + "\n";
        }

        if (this.getDataDiNascita() != null) {
            s = s + "Data di nascita: " + this.getDataDiNascita() + "\n";
        } else {
            s = s + "Data di nascita: " + nD + "\n";
        }

        if (this.getEmail() != null) {
            s = s + "Email      : " + this.getEmail() + "\n";
        } else {
            s = s + "Email      : " + nD + "\n";
        }

        if (this.getPassword() != null) {
            s = s + "Password   : " + this.getPassword() + "\n";
        } else {
            s = s + "Password   : " + nD + "\n";
        }

        s = s + "Voti: " + vot + "\n";

        if (this.getVoti() != null) {
            s = s + "Voto minore: " + this.votoMinore() + "\n"
                    + "Voto maggiore: " + this.votoMaggiore() + "\n"
                    + "Media voti: " + this.mediaVoti();
        }

        return s;

    }

    @Override

    protected void finalize() throws Throwable {
        super.finalize();
        Persona8A.numeroIstanze--;

    }

    public static void main(String[] args) throws Exception {
        Studente3 s = new Studente3(1, true, 1.0, "Pompilio", "Matteo", 40f, "17/04/2007", "matteo.pompilio@cico.com", "Bl00dborneL0ver!");
        s.aggiungiVoto(2f);
        s.aggiungiVoto(8f);
        s.aggiungiVoto(5f);
        Studente3 s1 = s.clone();
        Studente3 s2 = s1.clone();
        Studente3 s3 = new Studente3();
        //s1.setNome("Valentina");
        //s1.rimuoviUltimoVoto();
        //System.out.println(s.equals(s1));
        //System.out.println(s1.equals(s2));
        /*

     for(int i = 0; i < s.getVoti().size(); i++){

         System.out.println("s: " + s.getVoti().get(i));

         System.out.println("s1: " + s1.getVoti().get(i));

     }

         */
        //System.out.println("s " + s.getNome());
        //System.out.println("s1 " + s1.getNome());
        System.out.println(s1.toString());

    }

}
