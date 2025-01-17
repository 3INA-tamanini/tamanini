package dataEasy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DateTimeException;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.temporal.ChronoUnit;
import java.time.Period;

public class DataEasy {

    private String data;
    private Integer giorno;
    private Integer mese;
    private Integer anno;

    public DataEasy() {
    }

    public DataEasy(String data) throws Exception {
        DateTimeFormatter l = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate lD = LocalDate.parse(data, l);

        setGiorno(lD.getDayOfMonth());
        setMese(lD.getMonthValue());
        setAnno(lD.getYear());
    }

    public DataEasy(Integer giorno, Integer mese, Integer anno) throws Exception {
        setGiorno(giorno);
        setMese(mese);
        setAnno(anno);
    }

    public DataEasy(DataEasy data) {
        this.data = data.getData();
        this.giorno = data.getGiorno();
        this.mese = data.getMese();
        this.anno = data.getAnno();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        this.data = data;
    }

    public Integer getGiorno() {
        return giorno;
    }

    public void setGiorno(Integer giorno) throws Exception {
        if(giorno==null)
            throw new Exception("giorno null");
        
        try {
            LocalDate l = LocalDate.of(anno, mese, giorno);
        } catch (Exception e) {
            throw new Exception("giorno non valido");
        }
        
        this.giorno = giorno;
    }

    public Integer getMese() {
        return mese;
    }

    public void setMese(Integer mese) throws Exception {
        if(mese==null)
            throw new Exception("mese null");
        
        try {
            LocalDate l = LocalDate.of(anno, mese, giorno);
        } catch (Exception e) {
            throw new Exception("mese non valido");
        }
        
        this.mese = mese;
    }

    public Integer getAnno() {
        return anno;
    }

    public void setAnno(Integer anno) throws Exception {
        if(anno==null)
            throw new Exception("anno null");
        
        try {
            LocalDate l = LocalDate.of(anno, mese, giorno);
        } catch (Exception e) {
            throw new Exception("anno non valido");
        }
        
        this.anno = anno;
    }

    public String giornoDellaSettimana() {
        String g = "";

        LocalDate l = LocalDate.of(anno, mese, giorno);
        g = l.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALY);

        return g;
    }

    public static Integer differenzaInGiorni(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;
        LocalDate lAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate lSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.DAYS.between(lAntecedente, lSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static Integer differenzaInSettimane(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate lAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate lSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.WEEKS.between(lAntecedente, lSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static Integer differenzaInMesi(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate lAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate lSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.MONTHS.between(lAntecedente, lSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static Integer differenzaInAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) throws Exception {
        Integer diff = 0;

        LocalDate lAntecedente = LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno());
        LocalDate lSuccessivo = LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno());

        diff = (int) ChronoUnit.YEARS.between(lAntecedente, lSuccessivo);

        if (diff < 0) {
            throw new Exception("Inserire prima la data più vecchia e dopo la data più recente");
        }

        return diff;
    }

    public static String differenzaInGiorniMesiAnni(DataEasy dataAntecedente, DataEasy dataSuccessiva) {
        String s = "";
        int g, m, y;

        Period p = Period.between(LocalDate.of(dataAntecedente.getAnno(), dataAntecedente.getMese(), dataAntecedente.getGiorno()), LocalDate.of(dataSuccessiva.getAnno(), dataSuccessiva.getMese(), dataSuccessiva.getGiorno()));
        g = p.getDays();
        m = p.getMonths();
        y = p.getYears();

        s = y + " anni " + m + " mesi " + g + " giorni";

        return s;
    }

    @Override
    public String toString() {
        String s = "", m;
        int g, y;

        LocalDate l = LocalDate.of(anno, mese, giorno);

        g = l.getDayOfMonth();
        m = l.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALY);
        y = l.getYear();

        s = giornoDellaSettimana() + " " + g + " " + m + " " + y;

        return s;
    }

    public static void main(String[] args) throws Exception {
        DataEasy d = new DataEasy(11, 1, 2025);
        DataEasy d1 = new DataEasy(1, 12, 2023);
        //DataEasy d = new DataEasy("11/01/2025");  //con stringa

        try {
            System.out.println(d.toString());
            System.out.println(differenzaInGiorni(d, d1));
            System.out.println(differenzaInSettimane(d1, d));
            System.out.println(differenzaInMesi(d1, d));
            System.out.println(differenzaInAnni(d1, d));

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(differenzaInGiorniMesiAnni(d1, d));

    }
}