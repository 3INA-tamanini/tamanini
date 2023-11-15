package studente;

import java.util.Scanner;

public class StudenteTest {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String nome, cognome, esito;
        float voto;
        
        System.out.print("inserisci il nome   : ");
        nome = in.nextLine();
        
        System.out.print("inserisci il cognome: ");
        cognome=in.nextLine();
        
        System.out.print("inserisci il voto   : ");
        voto=in.nextFloat();
        
        esito="non ancora definito";
        
        Studente s = new Studente(nome, cognome, voto, esito);
        
        s.setEsito(voto);
        
        System.out.println(s.info());
    }
    
}
