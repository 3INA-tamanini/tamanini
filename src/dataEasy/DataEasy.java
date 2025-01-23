package dataEasy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.regex.Pattern;

public class DataEasy {

    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public DataEasy() {
        LocalDate l = LocalDate.now();

        this.data = l.format(DateTimeFormatter.ofPattern("dd/M/yyyy"));
        this.giorno = l.getDayOfMonth();
        this.mese = l.getMonthValue();
        this.anno = l.getYear();

    }

    public DataEasy(String data) throws Exception {
        setData(data);
    }

    public DataEasy(Integer giorno, Integer mese, Integer anno) throws Exception {
        setAnno(anno);
        setMese(mese);
        setGiorno(giorno);

        LocalDate data = LocalDate.of(this.anno, this.mese, this.giorno);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = data.format(formatter);
    }

    public DataEasy(DataEasy data) throws Exception {
        setData(data.data);
        setAnno(data.anno);
        setGiorno(data.giorno);
        setMese(data.mese);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        LocalDate dataOdierna = LocalDate.now();

        if (data == null) {
            throw new Exception("Data Nulla!");
        } else {
            if (!Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}", data)) {
                throw new Exception("Sintassi Errata!");
            } else {
                String[] s = data.split("/");
                int giorno = Integer.parseInt(s[0]);
                int mese = Integer.parseInt(s[1]);
                int anno = Integer.parseInt(s[2]);

                LocalDate dataInserita = LocalDate.of(anno, mese, giorno);

                if (dataInserita.isAfter(dataOdierna)) {
                    throw new Exception("Data Errata!");
                } else {
                    this.data = data;
                    this.giorno = giorno;
                    this.mese = mese;
                    this.anno = anno;
                }
            }
        }
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) throws Exception {
        if (giorno == null) {
            throw new Exception("Giorno Nullo!");
        } else {

            try {
                LocalDate dataTemp = LocalDate.of(anno, mese, giorno);
            } catch (DateTimeException e) {
                throw new Exception("Giorno Sbagliato per il mese e anno specificato!");
            }
            this.giorno = giorno;
        }
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) throws Exception {
        if (mese == null || mese < 1 || mese > 12) {
            throw new Exception("Mese non valido!");
        }
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) throws Exception {
        if (anno == null || anno < 1) {
            throw new Exception("Anno non valido!");
        }
        this.anno = anno;
    }

    public String giornoDellaSettimana() {
        String g = "";

        LocalDate l = LocalDate.of(anno, mese, giorno);
        g = l.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        return g;
    }

    public static Integer differenzaInGiorni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(),
                dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = java.time.temporal.ChronoUnit.DAYS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInSettimane(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(),
                dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.WEEKS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInMesi(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(),
                dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.MONTHS.between(data1, data2);

        return (int) differenza;
    }

    public static Integer differenzaInAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        LocalDate data1 = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(),
                dataAntecedente.getGiorno());
        LocalDate data2 = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        long differenza = ChronoUnit.YEARS.between(data1, data2);

        return (int) differenza;
    }

    public static String differenzaInGiorniMesiAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        String diff = "";

        Period p = Period.between(
                LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno()),
                LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno()));
        int g = p.getDays();
        int m = p.getMonths();
        int y = p.getYears();

        for (int i = 0; i < 3; i++) {
            if (y != 0 && i == 0) {
                if (y > 1) {
                    diff = y + " anni ";
                } else {
                    diff = y + " anno ";
                }
            } else if (m != 0 && i == 1) {
                if (m > 1) {
                    diff = diff + m + " mesi ";
                } else {
                    diff = diff + m + " mese ";
                }
            } else if (g != 0 && i == 2) {
                if (g > 1) {
                    diff = diff + g + " giorni";
                } else {
                    diff = diff + g + " giorno";
                }
            }
        }

        return diff;
    }

    @Override
    public String toString() {
        String testo = "";
        testo = giorno + "/" + mese + "/" + anno;
        return testo;
    }
}