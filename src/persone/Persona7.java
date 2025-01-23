package persone;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Persona7 {

    private Double altezza;
    private String cognome;
    private String nome;
    private Float peso;
    private String dataDiNascita;
    private String email;
    private String password;

    private static int numeroIstanze;

    public Persona7() {
        numeroIstanze++;
    }

    public Persona7(Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email, String password) throws Exception {
        setAltezza(altezza);
        setCognome(cognome);
        setNome(nome);
        setPeso(peso);
        setDataDiNascita(dataDiNascita);
        setEmail(email);
        setPassword(password);
        numeroIstanze++;
    }

    public Persona7(Persona7 persona) throws Exception {
        if (persona != null) {
            this.altezza = persona.altezza;
            this.nome = persona.nome;
            this.dataDiNascita = persona.dataDiNascita;
            numeroIstanze++;
        } else {
            throw new Exception("L'oggetto non può essere null");
        }
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double altezza) throws Exception {
        if (altezza != null) {
            Double r1 = Math.random() + 1;
            Double r2 = Math.random();
            if (altezza >= r2 && altezza <= r1) {
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
            Pattern num = Pattern.compile(".*\\d.*");
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
        if(peso == null){
            throw new Exception("Il peso non può essere null");
        }else{
            this.peso = peso;
        }
    }
   
    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) throws Exception {
        if (dataDiNascita != null) {
            int g = 0, m = 0, y = 0, contatore = 0;
            int[] mesi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] str;

            for (int i = 0; i < dataDiNascita.length(); i++) {
                if (dataDiNascita.charAt(i) == '/') {
                    contatore++;
                }
            }

            if (contatore != 2) {
                throw new Exception("Bisogna separare giorni, mesi e anni da uno / (in totale ci dovrebbero essere solo 2 /)");
            }

            if (dataDiNascita.length() != 10) {
                throw new Exception("La data deve essere scritta nel formato dd/mm/yyyy");
            } else {
                str = dataDiNascita.split("/");
                g = Integer.parseInt(str[0]);
                m = Integer.parseInt(str[1]);
                y = Integer.parseInt(str[2]);

                if (m < 1) {
                    throw new Exception("Il mese NON può essere minore di 1");
                } else if (m > 12) {
                    throw new Exception("Il mese inserito NON può essere maggiore di 12");
                }

                if (y < 1000 || y > 9999) {
                    throw new Exception("L'anno DEVE avere 4 cifre");
                } else if (y % 4 == 0) {
                    mesi[1] = 29;
                }

                if (g < 1) {
                    throw new Exception("Il giorno NON può essere minore di 1");
                } else if (g > mesi[m - 1]) {
                    throw new Exception("Il giorno inserito NON può essere maggiore di " + mesi[m - 1]);
                }
            }

            this.dataDiNascita = dataDiNascita;
        } else {
            throw new Exception("La data di nascita non può essere null");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if(email == null){
            throw new Exception("L'Email non può essere null");
        }else{
           Pattern p = Pattern.compile("[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,5}");
           
           if(p.matcher(email).matches()){
               this.email = email;
           }else{
               throw new Exception("L'Email deve avere il formato mail@mail.com  es mail@gmail.com");
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
        Integer eta = 0, g = 0, m = 0, y = 0;
        String[] str;

        str = dataDiNascita.split("/");
        g = Integer.parseInt(str[0]);
        m = Integer.parseInt(str[1]);
        y = Integer.parseInt(str[2]);

        GregorianCalendar data = new GregorianCalendar();
        int giorno = data.get(Calendar.DAY_OF_MONTH);
        int mese = data.get(Calendar.MONTH) + 1;
        int anno = data.get(Calendar.YEAR);

        if (y > anno) {
            throw new Exception("L'anno inserito NON può essere maggiore dell'anno attuale");
        } else {
            eta = (anno - 1) - y;

            if (m >= mese && g >= giorno) {
                eta++;
            }
        }

        return eta;
    }

    public String info() {
        String s = "";

        s = "Altezza        : " + altezza + "\n" +
            "Cognome:       : " + cognome + "\n" +  
            "Nome           : " + nome + "\n" +
            "Peso           : " + peso + "\n" +
            "Data di nascita: " + dataDiNascita + "\n" +
            "Email          : " + email + "\n" +
            "Password       : " + password + "\n";

        return s;
    }

    public Boolean verificaOmonimia(Persona7 persona) throws Exception {
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
}