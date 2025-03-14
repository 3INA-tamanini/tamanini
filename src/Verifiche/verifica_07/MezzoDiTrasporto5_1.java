package Verifiche.verifica_07;



public class MezzoDiTrasporto5_1 {

    private final Float COEFF_CONV_DA_CV_A_KW = 0.73f;

    private Integer cavalli;
    private Integer cilindrata;
    private String colore;
    private String marca;
    private String modello;

    protected static int numeroIstanze;

    public MezzoDiTrasporto5_1() {
        numeroIstanze++;
    }

    public MezzoDiTrasporto5_1(Integer cavalli, Integer cilindrata, String colore, String marca, String modello) throws Exception {
        setCavalli(cavalli);
        setCilindrata(cilindrata);
        setColore(colore);
        setMarca(marca);
        setModello(modello);

        numeroIstanze++;
    }

    public MezzoDiTrasporto5_1(MezzoDiTrasporto5_1 m) {
        this.cavalli = m.cavalli;
        this.cilindrata = m.cilindrata;
        this.colore = m.colore;
        this.marca = m.marca;

        numeroIstanze++;
    }

    public Integer getCavalli() {
        return this.cavalli;
    }

    public final void setCavalli(Integer cavalli) throws Exception {
        try {
            if (cavalli >= 6 && cavalli <= 1500) {
                this.cavalli = cavalli;
            } else {
                throw new Exception("L'attributo cavalli deve essere un numero compreso tra 6 e 110.000!");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo cavalli non può essere nullo!");
        }
    }

    public final void setCavalli1(Integer cavalli) throws Exception {
        if (cavalli == null) {
            throw new Exception("L'attributo cavalli non può essere nullo!");
        }

        if (cavalli >= 6 && cavalli <= 1500) {
            this.cavalli = cavalli;
        } else {
            throw new Exception("L'attributo cavalli deve essere un numero compreso tra 6 e 110.000!");
        }
    }

    public Integer getCilindrata() {
        return this.cilindrata;
    }

    public final void setCilindrata(Integer cilindrata) throws Exception {
        try {
            switch (cilindrata) {
                case 1000:
                case 1500:
                case 2000:
                    this.cilindrata = cilindrata;
                    break;
                default:
                    throw new Exception("L'attributo cilindrata può assumere i seguenti valori: 1000, 1500 e 2000");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo cilindrata non può essere nullo!");
        }
    }

    public String getColore() {
        return this.colore;
    }

    public final void setColore(String colore) throws Exception {
        try {
            if (colore.equalsIgnoreCase("rosso") || colore.equalsIgnoreCase("bianco") || colore.equalsIgnoreCase("nero")) {
                this.colore = colore;
            } else {
                throw new Exception("L'attributo colore può assumere i seguenti valori: bianco, nero e rosso");
            }
        } catch (NullPointerException e) {
            throw new Exception("L'attributo colore non può essere nullo!");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public final void setMarca(String marca) throws Exception {
        Boolean verCaratt = false;

        String strCaratt = "ABCDEFGHILMNOPQRSTUVZWJKX ";

        try {
            if (marca.length() < 3) {
                throw new Exception("L'attributo marca deve contenere almeno 3 caratteri!");
            }

            for (int i = 0; i < marca.length(); i++) {
                for (int j = 0; j < strCaratt.length(); j++) {
                    if (marca.charAt(i) == strCaratt.charAt(j)) {
                        verCaratt = true;
                        break;
                    }
                }

                if (verCaratt == false) {
                    throw new Exception("Carattere non valido!");
                }

                verCaratt = false;
            }

            this.marca = marca;

        } catch (NullPointerException e) {
            throw new Exception("L'attributo marca non può essere nullo!");
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) throws Exception {
        String[] s = modello.split(" ");

        if (modello != null) {
            for (int i = 0; i < s.length; i++) {
                if (s[i].length() < 3) {
                    throw new Exception("Tutte le parole devono essere lunghe almeno 3 caratteri");
                }

                if (s[i].matches("^[A-Z]{1}[a-z]+$")) {
                    this.modello = modello;
                } else {
                    throw new Exception("Sbagliato");
                }
            }
        } else {
            throw new Exception("Il modello non può essere null");
        }
    }

    public Integer calcolaKw() throws Exception {
        if (cavalli == null) {
            throw new Exception("Attributo cavalli nullo!");
        }

        return (int) (this.cavalli * this.COEFF_CONV_DA_CV_A_KW);
    }

    public String info() throws Exception {
        String info = null;

        if (cilindrata != null && colore != null && marca != null && cavalli != null) {
            info = "Marca              : " + marca + "\n"
                    + "Colore             : " + colore + "\n"
                    + "Cilindrata         : " + cilindrata + "\n"
                    + "Cavalli            : " + cavalli + "\n";
            return info;
        } else {
            throw new Exception("Uno o più attributi risultano nulli!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            MezzoDiTrasporto5 m = new MezzoDiTrasporto5(500, 1000, "rosso", "AUDI", "Cijao Dysf Dsgyufgsyui Dggyuwgt Djfgj ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
