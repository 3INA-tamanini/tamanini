package eserciziDevincentis;

public class Anagrafe {
    private String nome;
    private String cognome;
    private int giornoNascita;
    private int meseNascita;
    private int annoNascita;
    
    
    private static int numeroProgressivo = 0;
    
    
    private int numeroMatricola;
    
    
    
    public Anagrafe(String nome, String cognome, int gg, int mm, int aa){
    this.nome = nome; 
    this.cognome = cognome;
    this.giornoNascita = gg;
    this.meseNascita = mm;
    this.annoNascita = aa;
    
    
    numeroProgressivo++;
   
    this.numeroMatricola = numeroProgressivo;
    }
    
  
    public String stampaDati() {
    String str = "Nome: " + nome + " cognome: " + cognome +
    ";\nData di nascita: " + giornoNascita
    + "/" + meseNascita + "/" + annoNascita +
    "\n Numero matricola: " + numeroMatricola;

    return str;
    }
    
    public static void main(String[] a) {
    
    Anagrafe utente1 = new Anagrafe("Mario", "Rossi", 12, 11, 1956);
    Anagrafe utente2 = new Anagrafe("Franco", "Bianchi", 10, 3, 1979);
    Anagrafe utente3 = new Anagrafe("Ada", "Verdi", 11, 11, 1911);
    
    System.out.println();
    System.out.println(utente1.stampaDati());
    System.out.println(utente2.stampaDati());
    System.out.println(utente3.stampaDati());
    System.out.println();
    }
}