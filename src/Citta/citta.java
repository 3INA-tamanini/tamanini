package citta;

import persona7.Persona7;

public class Citta {

    private String nome;
    private String superficie;
    private Persona7 sindaco;
    private Persona7[] abitanti;

    public Citta() {
    }

    public Citta(String nome, String superficie, Persona7 sindaco, Persona7[] abitanti) throws Exception {
        setNome(nome);
        setSuperficie(superficie);
        setSindaco(sindaco);
        setAbitanti(abitanti);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null) {
            if (Character.isUpperCase(nome.charAt(0)) == true) {
                if (nome.matches("\\D+")) {
                    this.nome = nome;
                } else {
                    throw new Exception("Il nome della città deve contenere SOLO lettere");
                }
            } else {
                throw new Exception("La prima lettera del nome della città DEVE essere maiuscola");
            }
        } else {
            throw new Exception("Il nome della città NON deve essere null");
        }
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) throws Exception {
        if (superficie != null) {
            if (superficie.matches("[0-9\\,]+[km,m]+")) {
                this.superficie = superficie;
            } else {
                throw new Exception("Scrivere prima il numero e dopo l'untità di misura");
            }
        } else {
            throw new Exception("La superficie NON deve essere null");
        }
    }

    public Persona7 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona7 sindaco) throws Exception {
        if (sindaco != null) {
            this.sindaco = sindaco;
        } else {
            throw new Exception("Il nome del sindaco NON può essere null");
        }
    }

    public Persona7[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona7[] abitanti) {
        this.abitanti = new Persona7[abitanti.length + 1];
        this.abitanti[0] = sindaco;
        for (int i = 1; i < abitanti.length; i++) {
            this.abitanti[i] = abitanti[i - 1];
        }
    }

    public Integer densitaPopolazione() {
        Integer dens = 0;
        int temp = superficie.indexOf(',');
        String s = superficie.substring(0, temp - 1);

        dens = abitanti.length / Integer.parseInt(s);

        return dens;
    }

    public Integer etaMedia() throws Exception {
        Integer eta = 0;

        for (int i = 0; i < abitanti.length; i++) {
            eta += abitanti[i].calcolaEta();
        }
       
        eta /= abitanti.length;

        return eta;
    }

    public String info() {
        String testo = "";
        for (int i = 0; i < abitanti.length; i++) {
            testo += getAbitanti()[i].info();
        }
        return testo;
    }

    public Integer numeroOmonimi() throws Exception{
        Integer numero = 0;
        for(int i = 0; i<abitanti.length;i++){
            for (int j = 0; j < abitanti.length; j++) {
                if(abitanti[i].verificaOmonimia(abitanti[j])){
                    numero++;
                }
            }
        }
        return numero;
    }

    public static void main(String[] args) throws Exception {
        try {
            Persona7 sindaco = new Persona7(1.0, "Pompilio", "Abitatni", 123f, "12/12/1912", "matteo.pompilio@cico.com", "Ad345678!");
            Persona7 p1 = new Persona7(1.0, "Ghetta", "Abitatni", 123f, "12/12/1912", "matteo.pompilio@cico.com", "C23456a8!");
            Persona7 p2 = new Persona7(1.0, "Tamaontop", "Abitatni", 123f, "12/12/1912", "matteo.pompilio@cico.com", "D2s45678!");
            Persona7 p3 = new Persona7(1.0, "Tomaonline", "Abitatni", 123f, "12/12/1912", "matteo.pompilio@cico.com", "C1a0B3l0!");
            Persona7[] abitanti = {p1, p2, p3, sindaco};
            Citta c = new Citta("Trento", "157,9km", sindaco, abitanti);
            System.out.println(c.info());
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}