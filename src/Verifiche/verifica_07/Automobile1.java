package Verifiche.verifica_07;

import persone.Persona8A;
import Data.DataEasy;
import java.util.ArrayList;

public class Automobile1 extends MezzoDiTrasporto5 {

    private String dataDiProduzione;
    private String targa;

    private Persona8A autista;
    private ArrayList<Persona8A> passeggeri;

    
    public Automobile1() {
        super();
    }

    public Automobile1(Integer cavalli, Integer cilindrata, String colore, String marca, String dataDiProduzione, String targa, String modello) throws Exception {
        super(cavalli, cilindrata, colore, marca, modello);

        setDataDiProduzione(dataDiProduzione);
        setTarga(targa);
    }

    public String getDataDiProduzione() {
        return dataDiProduzione;
    }

    final public void setDataDiProduzione(String dataDiProduzione) throws Exception {
        DataEasy data = new DataEasy(dataDiProduzione);

        DataEasy dataOdierna = new DataEasy();

        if (DataEasy.differenzaInGiorni(data, dataOdierna) >= 0) {
            this.dataDiProduzione = data.getData(); // this.dataDiProduzione = dataDiProduzione
        } else {
            throw new Exception("La data di produzione non può essere successiva a quella attuale!");
        }
    }

    final public void setDataDiProduzioneGeniale(String dataDiProduzione) throws Exception {
        try {
            Persona8A temp = new Persona8A();

            temp.setDataDiNascita(dataDiProduzione);

            this.dataDiProduzione = temp.getDataDiNascita();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
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

    public ArrayList getPasseggeri() throws Exception {
        return (ArrayList) passeggeri.clone();
    }

    public void setPasseggeri(ArrayList<Persona8A> passeggeri) throws Exception {
        Boolean verifica = true;

        try {
            if (passeggeri.size() > 0) {
                for (int i = 0; i < passeggeri.size(); i++) {
                    if (passeggeri.get(i).getNome() == null) {
                        verifica = false;
                    }
                }

                if (verifica) {
                    //this.passeggeri = passeggeri.clone(); //non funzionante se non si sovrascrive il metodo clone della classe Persona8A
                    
                    this.passeggeri=passeggeri;
                } else {
                    throw new Exception("I nomi dei passeggeri non possono essere nulli!");
                }
            } else {
                throw new Exception("L'attributo passeggeri non può essere vuoto!");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo passeggeri non può essere nullo!");
        }

    }

    public void aggiungiPasseggero(Persona8A passeggero) throws Exception {
        try {
            if (passeggero.getNome() != null) {
                passeggeri.add(passeggero);

            } else {
                throw new Exception("Il nome del passeggero non può essere nullo!");
            }
        } catch (NullPointerException e) {
            throw new Exception("Il passeggero non può essere nullo!");
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

            if (posizione >= 0 && posizione < passeggeri.size()) {
                passeggeri.remove(posizione);
            } else {
                throw new Exception("La posizione deve essere compresa tra 0 e " + (passeggeri.size() - 1));
            }
        } catch (NullPointerException e) {
            throw new Exception("La posizione non può essere null!");
        }
    }

    public void rimuoviPasseggero(String nome) throws Exception {
        try {
            if (!nome.equals("")) { //come posso fare questo controllo in modo più furbo?
                for (int i = passeggeri.size() - 1; i >= 0; i--) {
                    if (passeggeri.get(i).getNome().equalsIgnoreCase(nome)) {
                        rimuoviPasseggero(i);
                    }
                }
            } else {
                throw new Exception("Il nome non può essere una stringa vuota!");
            }
        } catch (NullPointerException e) {
            throw new Exception("nome e/o passeggeri non possono essere null!");
        }
    }

    public void rimuoviUltimoPasseggero() throws Exception {
        rimuoviPasseggero(passeggeri.size() - 1);
    }

    public Integer numeroPosti;
    public Integer classeEnergetica;
    
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
            Automobile1 a = new Automobile1(100, 1000, "bianco", "FIAT", "12/12/2024", "AM644EE", "Cicciogamer");

            Persona8A p1 = new Persona8A(1.75, "Pompilio", "Matteo", 80.0f, "12/12/1212", "email@email.it", "Bl00db0rn3L0v3r!");
            Persona8A p2 = new Persona8A(1.75, "Cognome", "Ciccio", 80.0f, "12/12/1212", "email@email.it", "Bl00db0rn3L0v3r!");

            ArrayList<Persona8A> p = new ArrayList<>();
            p.add(p1);
            p.add(p1);
            p.add(p1);
            p.add(p2);
            p.add(p1);
            

            a.setAutista(p1);
            a.setPasseggeri(p);
            a.rimuoviPasseggero("Nome");
            System.out.println(a.info());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}