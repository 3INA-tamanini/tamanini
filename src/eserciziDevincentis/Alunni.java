package eserciziDevincentis;

import java.util.Scanner;

public class Alunni {

    private int size;
    private int index;
    private String[] nomi;
    private String[] cognomi;

    public Alunni() {
        this(10);
    }

    public Alunni(int size) {
        this.size = size;
        this.nomi = new String[size];
        this.cognomi = new String[size];
    }

    public int getSize() {
        return size;
    }

    public String[] getNomi() {
        return nomi;
    }

    public String[] getCognomi() {
        return cognomi;
    }

    public void setNomi(String[] nomi) {
        this.nomi = nomi;
    }

    public void setCognomi(String[] cognomi) {
        this.cognomi = cognomi;
    }

    public boolean inserisci(String nome, String cognome) {
        if (index == size) {
            return false;
        }
        nomi[index] = nome;
        cognomi[index] = cognome;
        index++;
        return true;
    }

    public String ricercaCognomi(String nome) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            if (nomi[i].equals(nome)) {
                result.append(cognomi[i]).append(", ");
            }
        }
        return result.toString().trim().isEmpty() ? "" : result.toString().substring(0, result.length() - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = 0;
        Alunni Alunni = null;
        do{
        System.out.println("1 - inserire un nome");
        System.out.println("2 - cercare un nome");
            System.out.println("3 - esci");
        System.out.println("inserisci l'opzione: ");
        scelta = Integer.parseInt(input.nextLine());
        switch (scelta) {
            case 1:
                System.out.println("Inserisci il numero di alunni:");
                int size = Integer.parseInt(input.nextLine());
                Alunni = new Alunni(size);
                for (int i = 0; i < size; i++) {
                    System.out.println("Inserisci il nome dell'alunno " + (i + 1) + ":");
                    String nome = input.nextLine();
                    System.out.println("Inserisci il cognome dell'alunno " + (i + 1) + ":");
                    String cognome = input.nextLine();
                    Alunni.inserisci(nome, cognome);
                }
                break;
            case 2:
                if(Alunni == null){
                    System.out.println("non ci sono nomi da cercare");
                    break;
                }
                
                System.out.println("Inserisci il nome da cercare:");
                String nomeCercato = input.nextLine();
                String cognomi = Alunni.ricercaCognomi(nomeCercato);
                if (cognomi.equals("")) {
                    System.out.println("Non ci sono alunni con il nome " + nomeCercato);
                } else {
                    System.out.println("I cognomi degli alunni con il nome " + nomeCercato + " sono:");
                    System.out.println(cognomi);
                }
            case 3:
                break;
            default:
                System.out.println("opzione non valida");
        }
        }while(scelta!=3);

    }
}
