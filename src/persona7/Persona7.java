package persona7;

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

    public Persona7(Double altezza, String cognome, String nome, Float peso, String dataDiNascita, String email,
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

    public Persona7(Persona7 p) throws Exception {
        if (p != null) {
            this.altezza = p.altezza;
            this.nome = p.nome;
            this.dataDiNascita = p.dataDiNascita;
            numeroIstanze++;
        } else {
            throw new Exception("L'oggetto deve essere diverso da null");
        }
    }

    public Double getAltezza() {
        return altezza;
    }

    public void setAltezza(Double a) throws Exception {
        if (a != null) {
            Double n1 = Math.random() + 1;
            Double n2 = Math.random();
            if (a >= n2 && a <= n1) {
                this.altezza = a;
            } else {
                throw new Exception("L'altezza deve essere compresa tra " + n1 + " e " + n2);
            }
        } else {
            throw new Exception("L'altezza deve essere diversa da null");
        }
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
        if (cognome == null) {
            throw new Exception("Il cognome deve essere diverso da null");
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
                throw new Exception("L'Email deve avere il formato mail@mail.com");
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

            Pattern maiuscola = Pattern.compile(".[A-Z].");
            Pattern minuscola = Pattern.compile(".[a-z].");
            Pattern num = Pattern.compile(".\\d.\\d.\\d.");
            Pattern special = Pattern.compile(".[!?\\.,\\-_@#%]+.");

            if (maiuscola.matcher(password).find()) {

            } else {
                throw new Exception("La password deve contenere almeno una lettera maiuscola");
            }
            
            if (minuscola.matcher(password).find()) {
            } else {
                throw new Exception("La password deve contenere almeno una lettera minuscola");
            }
            if (num.matcher(password).matches()) {
            } else {
                throw new Exception("La password deve contenere almeno 3 numeri");
            }
            
            if (special.matcher(password).matches()) {
                this.password = password;
            } else {
                throw new Exception(
                        "La password deve contenere almeno un carattere speciale (! ? . , - _ @ # %)");
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

        s = "Altezza        : " + altezza + "\n"
                + "Cognome:       : " + cognome + "\n"
                + "Nome           : " + nome + "\n"
                + "Peso           : " + peso + "\n"
                + "Data di nascita: " + dataDiNascita + "\n"
                + "Email          : " + email + "\n"
                + "Password       : " + password + "\n";

        return s;
    }

    public Boolean verificaOmonimia(Persona7 p) throws Exception {
        Boolean is = false;

        if (p != null) {
            if (p.nome != null) {
                if (this.nome.equals(p.nome)) {
                    is = true;
                }
            } else {
                throw new Exception("Il nome deve essere diverso da null");
            }
        } else {
            throw new Exception("L'oggetto inserito NON deve essere null");
        }

        return is;
    }
}
