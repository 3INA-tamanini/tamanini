package Verifiche.verifica_07;


import persone.Persona8A;
import Data.DataEasy;
import java.util.ArrayList;
import java.util.Collections;

public class Automobile1_1 extends MezzoDiTrasporto5 {

    private String dataDiProduzione;
    private String targa;
    private Integer numeroPosti;
    private Integer classeEnergetica;

    private Persona8A autista;
    private ArrayList<Persona8A> passeggeri = new ArrayList<>();

    public Automobile1_1() {
        super();
    }

    public Automobile1_1(Integer cavalli, Integer cilindrata, String colore, String marca, String modello, String dataDiProduzione, String targa, Integer numeroPosti, Integer classeEnergetica) throws Exception {
        super(cavalli, cilindrata, colore, marca, modello);

        setDataDiProduzione(dataDiProduzione);
        setTarga(targa);
        setNumeroPosti(numeroPosti);
        setClasseEnergetica(classeEnergetica);
    }

    public String getDataDiProduzione() {
        return dataDiProduzione;
    }

    final public void setDataDiProduzione(String dataDiProduzione) throws Exception {
        DataEasy data = new DataEasy(dataDiProduzione);

        DataEasy dataOdierna = new DataEasy();

        if (DataEasy.differenzaInGiorni(data, dataOdierna) >= 0) {
            this.dataDiProduzione = data.getData();
        } else {
            throw new Exception("La data di produzione non può essere successiva a quella attuale!");
        }
    }

    public String getTarga() {
        return targa;
    }

    final public void setTarga(String targa) throws Exception {
        try {
            if (targa.matches("[A-Z]{2}[0-9]{3}[A-Z]{2}")) {
                this.targa = targa;
            } else {
                throw new Exception("L'attributo targa non rispetta i criteri richiesti!");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo targa non può essere nullo!");
        }
    }

    public Integer getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(Integer numeroPosti) throws Exception {
        if (numeroPosti != null) {
            if (numeroPosti >= 1 && numeroPosti <= 4) {
                this.numeroPosti = numeroPosti;
            } else {
                throw new Exception("Il numero dei posti deve essere compreso tra 1 e 4 posti");
            }
        } else {
            throw new Exception("Il numero di posti non può essere null");
        }
    }

    public Integer getClasseEnergetica() {
        return classeEnergetica;
    }

    public void setClasseEnergetica(Integer classeEnergetica) throws Exception {
        if (classeEnergetica != null) {
            if (classeEnergetica >= 0 && classeEnergetica <= 6) {
                this.classeEnergetica = classeEnergetica;
            } else {
                throw new Exception("La classe energetica deve essere compresa tra 0 e 6");
            }
        } else {
            throw new Exception("La classe energetica non può essere null");
        }
    }

    public Persona8A getAutista() throws Exception {
        Persona8A temp = new Persona8A(autista);

        return temp;
    }

    public void setAutista(Persona8A autista) throws Exception {
        try {
            if (autista.getNome() != null && autista.getCognome() != null) {
                this.autista = new Persona8A(autista);
            } else {
                throw new Exception("Nome e cognome non possono essere nulli!");
            }

        } catch (NullPointerException e) {
            throw new Exception("L'attributo autista non può essere nullo!");
        }
    }

    public ArrayList<Persona8A> getPasseggeri() throws Exception {
        ArrayList<Persona8A> temp = new ArrayList<>();

        for (int i = 0; i < temp.size(); i++) {
            temp.set(i, new Persona8A(passeggeri.get(i)));
        }

        return temp;
    }

    public void setPasseggeri(ArrayList<Persona8A> passeggeri) throws Exception {
        if (passeggeri != null) {
            for (int i = 0; i < passeggeri.size(); i++) {
                if (passeggeri.get(i).getNome() != null) {

                } else {
                    throw new Exception("Il nome dei passeggeri non può essere null");
                }
            }
        } else {
            throw new Exception("Passeggeri non può essere null");
        }

        this.passeggeri = new ArrayList<>();
    }

    public void aggiungiPasseggero(Persona8A passeggero) throws Exception {
        if (passeggero != null) {
            if (passeggero.getNome() != null) {
                if (passeggeri == null) {
                    setPasseggeri(passeggeri);
                }
                passeggeri.add(passeggero);
            } else {
                throw new Exception("Il nome del passeggero non può essere nullo");
            }
        } else {
            throw new Exception("L'attributo passeggeri non può essere nullo");
        }
    }

    public void rimuoviPasseggero(Integer posizione) throws Exception {
        try {
            if (passeggeri == null) {
                throw new Exception("L'attributo passeggeri è null!");
            }

            if (passeggeri.size() < 1) {
                throw new Exception("Nessun passeggero presente!");
            }

            passeggeri.remove(posizione - 1);
        } catch (NullPointerException e) {
            throw new Exception("La posizione non può essere null!");
        }

    }

    public void rimuoviPasseggero(String nome) throws Exception {
        try {
            if (passeggeri.size() < 1) {
                throw new Exception("Per poter eliminare un passegero deve essercene almeno uno");
            }
            for (int i = passeggeri.size() - 1; i >= 0; i--) {
                if (passeggeri.get(i).getNome().matches(nome)) {
                    rimuoviPasseggero(i + 1);

                }
            }
        } catch (NullPointerException e) {
            throw new Exception("nome e/o passeggeri non possono essere null!");
        }
    }

    public void rimuoviUltimoPasseggero() throws Exception {
        try {
            if (passeggeri.size() < 1) {
                throw new Exception("Per poter eliminare un passegero deve essercene almeno uno");
            }
            passeggeri.removeLast();
        } catch (NullPointerException e) {
            throw new Exception("nome e/o passeggeri non possono essere null!");
        }

    }

    public void ordinaPasseggeri() throws Exception {
        if (passeggeri != null) {
            for (int i = 0; i < passeggeri.size(); i++) {
                if (passeggeri.get(i).getNome() == null) {
                    throw new Exception("I nomi dei passeggeri non possono essere null");
                }
            }
            
        } else {
            throw new Exception("Passeggeri non può essere nullo");
        }
    }

    public Float calcolaBollo(Automobile1 a) throws Exception {
        Float tot = 0f;
        Float temp = 0f;
        Integer kW = a.calcolaKw();
        float cE = (int) a.getClasseEnergetica();

        if (cE < 4) {
            cE = 3 - (0.15f * cE);
        }else{
            cE = 3.87f;
        }

        while (kW >= 100) {
            tot = tot + (100 * cE);
            kW = kW - 100;
        }
        
        cE = (int) a.getClasseEnergetica();
        
        if (cE < 4) {
            cE = 3 - (cE/10);
        }else{
            cE = 2.58f;
        }
        
        return tot + (kW * cE);
    }

    @Override
    public String info() throws Exception {
        String info = "";

        if (dataDiProduzione != null && targa != null && passeggeri != null) {
            info = super.info();

            info += "Data di produzione : " + dataDiProduzione + "\n"
                    + "Targa              : " + targa + "\n"
                    + "Autista            : " + (autista != null ? autista.getNome() + " " + autista.getCognome() + "\n" : "\n")
                    + "Passeggeri         : ";

            if (passeggeri.size() < 1) {
                info = info + "nessun passeggero presente\n";
            } else {
                for (int i = 0; i < passeggeri.size(); i++) {
                    if (i == passeggeri.size() - 1) {
                        info = info + passeggeri.get(i).getNome();
                    } else {
                        info = info + passeggeri.get(i).getNome() + ", ";
                    }
                }

                info += "\nTotale passeggeri  : " + passeggeri.size();
            }
            return info;
        } else {
            throw new NullPointerException("Uno o più attributi sono nulli!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Automobile1 a = new Automobile1(100, 1000, "bianco", "FIAT", "Ciao", "12/12/2024", "AM644EE", 4, 3);

            Persona8A p1 = new Persona8A(1.0, "Cognome", "Nome", 80.0f, "12/12/1212", "email@email.it", "Bl00dborneL0ver!");
            Persona8A p2 = new Persona8A(1.0, "Cognome", "Ciccio", 80.0f, "12/12/1212", "email@email.it", "Bl00dborneL0ver!");

            a.aggiungiPasseggero(p2);
            a.aggiungiPasseggero(p1);
            a.aggiungiPasseggero(p1);
            a.aggiungiPasseggero(p2);

            //a.rimuoviPasseggero(3);
            //a.rimuoviPasseggero("Nome");
            System.out.println(a.info());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
