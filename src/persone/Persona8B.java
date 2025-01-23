package persone;

import java.time.LocalDate;
import java.util.regex.Pattern;

import dataEasy.DataEasy;

public class Persona8B {
    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private DataEasy dataDiNascita = new DataEasy();
    private String email;
    private String password;
    protected static int numeroIstanze;

    public Persona8B() {
        numeroIstanze++;
    }

    public Persona8B(Double altezza, String cognome, String nome, Float peso, DataEasy dataDiNascita, String email,
            String password) throws Exception {
        setAltezza(altezza);
        setCognome(cognome);
        setNome(nome);
        setPeso(peso);
        setDataDiNascita(dataDiNascita);
        setEmail(email);
        setPassword(password);
        numeroIstanze++;
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        if (altezza != null) {
            Double r1 = Math.random();
            Double r2 = Math.random() + 2;
            if (altezza <= r2 && altezza >= r1) {
                this.altezza = altezza;
            } else {
                throw new Exception("L'altezza deve essere compresa tra " + r1 + " e " + r2);
            }
        } else {
            throw new Exception("L'altezza non può essere null");
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
        if (cognome == null) {
            throw new Exception("Il cognome NON può essere null");
        } else {
            Pattern p = Pattern.compile("^[A-Z]");
            if (p.matcher(cognome).find()) {
                if (cognome.length() < 5) {
                    throw new Exception("Il cognome deve essere lungo almeno 5 caratteri");
                } else {
                    this.cognome = cognome;
                }
            } else {
                throw new Exception("Il cognome deve iniziare con una lettera maiuscola");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("Il nome NON può essere null");
        } else {
            Pattern separazione = Pattern.compile(" +");
            Pattern lettere = Pattern.compile("^[A-Z][a-z]*$");
            Pattern num = Pattern.compile(".\\d.");
            String[] s = separazione.split(nome);

            if (s.length == 2) {
                if (s[0].length() < 3 && s[1].length() < 3) {
                    throw new Exception("I due nomi devono essere lunghi almeno 3 caratteri");
                } else if (s[0].length() < 3) {
                    throw new Exception("Anche il primo nome deve essere lungo almeno 3 caratteri");
                } else if (s[1].length() < 3) {
                    throw new Exception("Anche il secondo nome deve essere lungo almeno 3 caratteri");
                }
            } else if (s.length == 1) {
                if (s[0].length() < 3) {
                    throw new Exception("Il nome deve essre lungo almeno 3 caratteri");
                }
            } else {
                throw new Exception("Possono essere inseriti solo 2 nomi");
            }

            for (int i = 0; i < s.length; i++) {
                if (num.matcher(s[i]).find()) {
                    throw new Exception("Il nome NON può contenere caratteri diversi dalle lettere");
                } else if (lettere.matcher(s[i]).find()) {
                    this.nome = nome;
                } else {
                    throw new Exception("Il nome deve avere il primo carattere maiuscolo e i restanti minuscoli");
                }
            }
        }
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) throws Exception {
        if (peso == null) {
            throw new Exception("Il peso non può essere null");
        } else {
            this.peso = peso;
        }
    }

    public DataEasy getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(DataEasy dataDiNascita) throws Exception {
        this.dataDiNascita.setAnno(dataDiNascita.getAnno());
        this.dataDiNascita.setMese(dataDiNascita.getMese());
        this.dataDiNascita.setGiorno(dataDiNascita.getGiorno());
        this.dataDiNascita.setData(dataDiNascita.getData());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email == null) {
            throw new Exception("L'Email non può essere null");
        } else {
            Pattern p = Pattern.compile("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,5}");

            if (p.matcher(email).matches()) {
                this.email = email;
            } else {
                throw new Exception("L'Email deve avere il formato mail@mail.com es mail@gmail.com");
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if (password == null) {
            throw new Exception("La password non può essere null");
        } else {
            if (password.length() < 8) {
                throw new Exception("La password deve essere lunga almeno 8 caratteri");
            } else if (password.length() > 20) {
                throw new Exception("La password NON deve essere più lunga di 20 caratteri");
            }

            Pattern maiuscola = Pattern.compile(".*[A-Z].*");
            Pattern minuscola = Pattern.compile(".*[a-z].*");
            Pattern num = Pattern.compile(".*\\d.*\\d.*\\d.*");
            Pattern special = Pattern.compile(".*[!?\\.,\\-_@#%]+.*");

            if (maiuscola.matcher(password).find()) {
                if (minuscola.matcher(password).find()) {
                    if (num.matcher(password).matches()) {
                        if (special.matcher(password).matches()) {
                            this.password = password;
                        } else {
                            throw new Exception(
                                    "La password deve contenere almeno un carattere speciale (! ? . , - _ @ # %)");
                        }
                    } else {
                        throw new Exception("La password deve contenere almeno 3 numeri");
                    }
                } else {
                    throw new Exception("La password deve contenere almeno una lettera minuscola");
                }
            } else {
                throw new Exception("La password deve contenere almeno una lettera maiuscola");
            }
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer calcolaEta() throws Exception {
        LocalDate d = LocalDate.now();
        DataEasy dataOggi = new DataEasy(d.getDayOfMonth(), d.getMonthValue(), d.getYear());
        return DataEasy.differenzaInAnni(dataDiNascita, dataOggi);

    }

    public String info() {
        String testo = "";
        testo = "Altezza        : " + altezza + "\n" +
                "Cognome:       : " + cognome + "\n" +
                "Nome           : " + nome + "\n" +
                "Peso           : " + peso + "\n" +
                "Data di nascita: " + dataDiNascita.toString() + "\n" +
                "Email          : " + email + "\n" +
                "Password       : " + password;
        return testo;
    }

    public Boolean verificaOmonimia(Persona8B persona) throws Exception {
        Boolean is = false;

        if (persona != null) {
            if (persona.nome != null) {
                if (this.nome.equals(persona.nome)) {
                    is = true;
                }
            } else {
                throw new Exception("Il nomoe deve essere diverso da null");
            }
        } else {
            throw new Exception("L'oggetto inserito NON deve essere null");
        }

        return is;
    }

    public static void main(String[] args) throws Exception {
        try {
            Persona8B persona8B1 = new Persona8B();
            DataEasy d = new DataEasy("12/12/1912");
            Persona8B persona8B2 = new Persona8B(1.95, "Rossi", "Mario", 75.5f, d, "as@cd.it", "Pass123!");

            System.out.println("persona8B1: \n" + persona8B1.info() + "\n");
            System.out.println("persona8B2: \n" + persona8B2.info());
            System.out.println("eta: " + persona8B2.calcolaEta());

            if (persona8B2.verificaOmonimia(persona8B2))
                System.out.println("omonimi");
            else
                System.out.println("non omonimi");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
