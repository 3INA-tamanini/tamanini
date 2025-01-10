package Citta;

import persona7.Persona7;

public class citta {

    String nome;
    String superficie;
    Persona7 sindaco;
    Persona7[] abitanti;

    public citta() {
    }

    public citta(String nome, String superficie, Persona7 sindaco, Persona7[] abitanti) throws Exception {
        setNome(nome);
        setSuperficie(superficie);
        setSindaco(sindaco);
        setAbitanti(abitanti);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("il nome è null");
        }
        if (nome.length() <= 0) {
            throw new Exception("il nome deve essere maggiore di 0");
        }
        if (Character.isUpperCase(nome.charAt(0))) {
            throw new Exception("la prima lettera del nome deve essere maiuscolo");
        }
        if (nome.matches("\\D+")) {
        } else {
            throw new Exception("il nome della città non può avere numeri");
        }
        this.nome = nome;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) throws Exception {
        if (superficie == null) {
            throw new Exception("la stringa non può essere null");
        }
        if (!superficie.matches("[0-9\\,\\.]+[km,m]+")) {
            throw new Exception("la superficie deve avere un numero e poi unita di misura");
        }

        this.superficie = superficie;
    }

    public Persona7 getSindaco() {
        return sindaco;
    }

    public void setSindaco(Persona7 sindaco) throws Exception {
        if(sindaco==null)
            throw new Exception("sindaco null");
        this.sindaco = sindaco;
    }

    public Persona7[] getAbitanti() {
        return abitanti;
    }

    public void setAbitanti(Persona7[] abitanti) throws Exception {
        if(abitanti == null)
            throw new Exception("abitante null");
        
        for (int i = 0; i < abitanti.length; i++) {
            this.abitanti[i] = abitanti[i];
            
        }
        
    }

}
