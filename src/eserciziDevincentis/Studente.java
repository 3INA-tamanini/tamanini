package eserciziDevincentis;
import java.util.Scanner;

public class Studente {
    private String nome, cognome;
    private int matricola;
    private static int ultimaMatricola = 0;
    
    public Studente(){
        
    }
    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        ultimaMatricola++;
        this.matricola = ultimaMatricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public int getUltimaMatricola() {
        return ultimaMatricola;
    }

    public void setUltimaMatricola(int ultimaMatricola) {
        Studente.ultimaMatricola = ultimaMatricola;
    }

    public String stampaDati(){
        String testo = "nome: " + nome + "\n" + 
                       "cognome: " + cognome + "\n" + 
                       "matricola: " + matricola + "\n";
        return testo;
    }
    
    
    public static int prossimaMatricola(){
        return Studente.ultimaMatricola+1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String n1,n2,c1,c2;
        
        System.out.print("inserisci il nome 1: ");
        n1 = in.next();
        System.out.print("inserisci il cognome 1: ");
        c1 = in.next();
        System.out.print("inserisci il nome 2: ");
        n2 = in.next();
        System.out.print("inserisci il cognome 2: ");
        c2 = in.next();
        
        Studente s1 = new Studente(n1,c1);
        Studente s2 = new Studente(n2,c2);
        
        System.out.println(s1.stampaDati());
        System.out.println(s2.stampaDati());
        
        System.out.println("prossimo numero di matricola: " + Studente.prossimaMatricola());
        
        System.out.print("modifica il nome 1: ");
        s1.setNome(in.next());
        System.out.print("modifica il cognome 1: ");
        s1.setCognome(in.next());
        in.close();
        
        System.out.println(s1.stampaDati());
    }
}
