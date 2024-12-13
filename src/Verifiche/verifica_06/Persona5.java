package Verifiche.verifica_06;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author tamanini luca
 */
public class Persona5 {

    private Double altezza;
    private String nome;
    private String dataDiNascita;
    private static int numeroIstanze;

    public Persona5() {
        numeroIstanze++;
    }

    public Persona5(Double altezza, String nome, String dataDiNascita) throws Exception {
        setAltezza(altezza);
        setNome(nome);
        setDataDiNascita(dataDiNascita);
        numeroIstanze++;
    }

    public Persona5(Persona5 persona) throws Exception {
        if (persona != null) {
            this.altezza = persona.altezza;
            this.nome = persona.nome;
            this.dataDiNascita = persona.dataDiNascita;
            numeroIstanze++;
        } else {
            throw new Exception("non puoi inserire un oggetto null");
        }
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        Random r = new Random();
        if (altezza == null) {
            throw new Exception("altezza null");
        }
        if (altezza < r.nextDouble()) {
            throw new Exception("altezza troppo alta");
        }
        if (altezza > r.nextDouble() * 10) {
            throw new Exception("altezza troppo bassa");
        }
        this.altezza = altezza;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("altezza null");
        }
        String[] n = nome.split(" ");
        if (n.length > 2) {
            throw new Exception("la stringa del nome puo avere solo 1 spazio");
        }

        //nome
        if (n[0].length() < 3) {
            throw new Exception("il nome deve essere almeno di 3 caratteri");
        }
        if (!Character.isUpperCase(n[0].charAt(0))) {
            throw new Exception("il nome deve avere l'iniziale maiuscola");
        }
        for (int i = 1; i < n[0].length(); i++) {
            if (!Character.isLowerCase(n[0].charAt(i))) {
                throw new Exception("il nome deve avere SOLO l'iniziale maiuscola");
            }
        }

        // cognome
        if (n.length > 1) {
            if (n[1].length() < 3) {
                throw new Exception("il cognome deve essere almeno di 3 caratteri");
            }
            if (!Character.isUpperCase(n[1].charAt(0))) {
                throw new Exception("il cognome deve avere l'iniziale maiuscola");
            }
            for (int i = 1; i < n[1].length(); i++) {
                if (!Character.isLowerCase(n[1].charAt(i))) {
                    throw new Exception("il nome deve avere SOLO l'iniziale maiuscola");
                }
            }
        }

        this.nome = nome;

    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        if (dataDiNascita == null) {
            throw new Exception("hai inserito una data null");
        }

        if (dataDiNascita.length() != 10) {
            throw new Exception("la data deve avere formato dd/mm/yyyy");
        }

        String[] dataDiNascitaSi = dataDiNascita.split("/");
        int giorno = Integer.parseInt(dataDiNascitaSi[0]);
        int mese = Integer.parseInt(dataDiNascitaSi[1]);
        int anno = Integer.parseInt(dataDiNascitaSi[2]);

        int[] giorni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //mese
        if (mese < 0 || mese > 12) {
            throw new Exception("il mese deve essere compreso tra 0 e 12");
        }

        //anno
        if (anno < 1000 || anno > 9999) {
            throw new Exception("l'anno deve essere compreso tra 1000 e 9999");
        }
        //bisestile
        if (anno % 4 == 0) {
            giorni[1] = 29;
        }
        
        //giorno
        if (giorno > giorni[mese - 1] || giorno < 0) {
            throw new Exception("giorno deve essere compreso tra 0 e " + giorni[mese - 1]);
        }

        this.dataDiNascita = dataDiNascita;
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaEta() throws Exception {
        Integer eta = -1;
        String[] dataDiNascitaSi = dataDiNascita.split("/");
        int giornoNascita = Integer.parseInt(dataDiNascitaSi[0]);
        int meseNascita = Integer.parseInt(dataDiNascitaSi[1]);
        int annoNascita = Integer.parseInt(dataDiNascitaSi[2]);
        GregorianCalendar dataOdierna = new GregorianCalendar();
        int giorno = dataOdierna.get(Calendar.DAY_OF_MONTH);
        int mese = dataOdierna.get(Calendar.MONTH);
        int anno = dataOdierna.get(Calendar.YEAR);
        if (annoNascita > anno) {
            throw new Exception("l'anno di nascita di " + nome + " è maggiore dell'anno di oggi perciò non si può calcolare l'età");
        }
        for (int i = 0; i < anno - annoNascita; i++) {
            if ((anno - i) != (anno - 1)) {
                eta++;
            } else if (giorno == giornoNascita && mese == meseNascita) {
                eta++;
            }
        }

        return eta + 2;
    }

    public String info() {
        String testo = "";
        testo += "nome           : " + nome + "\n";
        testo += "altezza        : " + altezza + "\n";
        testo += "data di nascita: " + dataDiNascita + "\n";
        return testo;
    }

    public Boolean verificaOmonimia(Persona5 persona) {
        boolean is = false;
        if (this.nome.equals(persona.nome)) {
            is = true;
        }
        return is;
    }

    public static void main(String[] args) throws Exception {
        try {
            Persona5 persona52 = new Persona5(1.8, "Toma Toma", "12/12/2007");
            Persona5 persona51 = new Persona5(1.76, "Matteo Pompilio", "19/08/1975");
            Persona5 persona5copia = new Persona5(persona51);

            System.out.println("numero istanze: " + Persona5.getNumeroIstanze() + "\n");
            System.out.println("persona 52: \n" + persona52.info());
            System.out.println("persona 51: \n" + persona51.info());
            System.out.println("persona 51 copia: \n" + persona5copia.info());

            if (persona52.verificaOmonimia(persona51)) {
                System.out.println("le due persone sono omonime");
            } else {
                System.out.println("le due persone non sono omonime");
            }

            System.out.println(persona52.getNome() + " ha " + persona52.calcolaEta() + " anni \n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
