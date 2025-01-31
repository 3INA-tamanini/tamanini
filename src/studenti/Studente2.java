package studenti;

import java.util.ArrayList;
import java.util.Collections;
import persone.Persona8A;

public class Studente2 extends Persona8A {

    public final String SCUOLA = "I.T.T. Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private ArrayList<Float> voti = new ArrayList<>();

    public Studente2() {
        super();
    }

    public Studente2(Integer classe, Boolean isRipetente, Double altezza, String cognome, String nome, Float peso,
            String dataDiNascita, String email, String password) throws Exception {
        super(altezza, cognome, nome, peso, dataDiNascita, email, password);
        setClasse(classe);
        setIsRipetente(isRipetente);
    }

    public Integer getClasse() {
        return classe;
    }

    public void setClasse(Integer classe) throws Exception {
        if (classe == null) {
            throw new Exception("La classe non può essere null");
        }

        if (classe < 1) {
            throw new Exception("La classe deve essere maggiore o uguale di 1");
        }

        if (classe > 5) {
            throw new Exception("La classe deve essere minore o uguale di 5");
        }

        this.classe = classe;
    }

    public Boolean getIsRipetente() {
        return isRipetente;
    }

    public void setIsRipetente(Boolean isRipetente) throws Exception {
        if (isRipetente == null) {
            throw new Exception("Il valore di ripetente non può essere null");
        }

        this.isRipetente = isRipetente;
    }

    public ArrayList<Float> getVoti() {
        return (ArrayList<Float>) voti.clone();
    }

    public void setVoti(ArrayList<Float> voti) throws Exception {
        this.voti = (ArrayList<Float>) voti.clone();
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if(voto == null)
            throw new Exception("il voto non può essere null");
        if (voto < 3) {
            throw new Exception("Il voto non può essere minore di 1");
        }

        if (voto > 10) {
            throw new Exception("Il voto non può essere maggiore di 10");
        }
        
        if(voto%0.25 != 0)
            throw new Exception("i decimali dei voti possono essere solo .00 .25 .50 .75");
        
        voti.add(voto);
    }

    public void rimuoviVoto(int index) throws Exception {

        if (voti.isEmpty()) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (index < 0) {
            throw new Exception("La poszione inserita deve essere minimo 1");
        }
        if (index >= voti.size()) {
            throw new Exception("La posizione inserita non deve essere maggiore del numero di voti");
        }

        voti.remove(index);
    }

    public void rimuoviUltimoVoto() throws Exception {

        if (voti.isEmpty()) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        voti.remove(voti.size() - 1);
    }

    public void ordinaVotoCrescente() {
        Collections.sort(voti);
    }

    public void ordinaVotoDecrescente() {
        Collections.sort(voti, Collections.reverseOrder());
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if (voti.isEmpty()) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (posizione < 0) {
            throw new Exception("La poszione inserita deve essere minimo 1");
        }
        if (posizione >= voti.size()) {
            throw new Exception("La posizione inserita non deve essere maggiore del numero di voti");
        }
        voti.remove((int) posizione);
    }

    public void rimuoviVoto(Float voto) throws Exception {
        if (voti.isEmpty()) {
            throw new Exception("Per rimuovere un voto deve prima essercene almeno uno");
        }
        if (voto <= 0) {
            throw new Exception("il voto inserito non deve essere minore di 1");
        }
        if (voto > 10) {
            throw new Exception("il voto inserito non deve essere maggiore di 10");
        }

        voti.remove(voto);
    }

    public Boolean promuovi() {
        Boolean is = false;

        if (classe + 1 <= 5) {
            if (mediaVoti() >= 6) {
                classe++;
                is = true;
            }
        }

        return is;
    }

    public Boolean promuovi(Integer numeroClassi) {
        Boolean is = false;

        if (mediaVoti() >= 6) {
            if (classe + numeroClassi <= 5) {
                classe = classe + numeroClassi;
                is = true;
            } else {
                classe = 5;
                is = true;
            }
        }

        return is;
    }

    @Override
    public String toString() {
        String s = "", vot = "";

        if (voti.isEmpty()) {
            vot = "Non ci sono voti";
        } else {
            for (int i = 0; i < voti.size(); i++) {
                if (i == 0) {
                    vot = vot + voti.get(0);
                } else {
                    vot = vot + ", " + voti.get(i);
                }
            }

        }

        try {
            s = SCUOLA + "\n"
                    + "Classe     : " + classe + "\n"
                    + "Ripetente   : " + isRipetente + "\n"
                    + super.info() + "\n"
                    + "Voti      : " + vot + "\n"
                    + "Voto minore  : " + votoMinore() + "\n"
                    + "Voto maggiore : " + votoMaggiore() + "\n"
                    + "Media dei voti : " + mediaVoti();
        } catch (Exception ex) {
        }

        return s;
    }

    private Float votoMinore() {
        if (voti.isEmpty()) {
            return null;
        }
        if (voti.size() == 1) {
            return voti.get(0);
        }

        Float min = voti.get(0);

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) < min) {
                min = voti.get(i);
            }
        }

        return min;
    }

    private Float votoMaggiore() {
        if (voti.isEmpty()) {
            return null;
        }
        if (voti.size() == 1) {
            return voti.get(0);
        }

        Float max = voti.get(0);

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) > max) {
                max = voti.get(i);
            }
        }

        return max;
    }

    private Float mediaVoti() {
        Float media = 0f;
        if (voti == null) {
            media = 0f;
        }

        for (int i = 0; i < voti.size(); i++) {
            media += voti.get(i);
        }

        media /= voti.size();

        return media;
    }

    public static void main(String[] args) throws Exception {
        try {
            Studente2 s = new Studente2(1, true, 1.0, "Pompilio", "Matteo", 40f, "17/04/2007",
                    "matteo.pompilio@cico.com", "Bl00dborneL0ver!");
            s.aggiungiVoto(9f);
            s.aggiungiVoto(8f);
            s.aggiungiVoto(10f);
            s.aggiungiVoto(4.5f);
            s.aggiungiVoto(2f);
            s.aggiungiVoto(1f);
            s.aggiungiVoto(5.5f);
            
            System.out.println(s.toString());
            s.ordinaVotoCrescente();
            String votiOrdinatiCrescente = s.voti.toString();
            s.ordinaVotoDecrescente();
            String votiOrdinatiDecrescente = s.voti.toString();
            
            if(s.promuovi(3))
                System.out.println("promosso");
            else
                System.out.println("non promosso");

            System.out.println("voti in ordine crescente  : " + votiOrdinatiCrescente);
            System.out.println("voti in ordine decrescente: " + votiOrdinatiDecrescente);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
