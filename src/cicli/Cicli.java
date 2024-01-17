package cicli;

import java.util.Scanner;


public class Cicli {

    
    public static void main(String[] args) {
        System.out.println("\nPRECONDIZIONALI");
        System.out.println("\nFOR: ");
        Scanner in = new Scanner(System.in);
        
        String testo;
        for (int i = 0; i<10; i++) {
          System.out.print("inserire il testo: ");
          testo = in.nextLine();
          System.out.println(testo);
        }
        
        int num = 1;
        System.out.println("\nWHILE: ");
        while(num!=0){
            System.out.println("inserisci il numero: ");
            num = in.nextInt();
        }
        
        System.out.println("\nPOSTCONDIZIONALI");
        System.out.println("\nDO WHILE: ");
        do {
            System.out.println("inserisci il numero: ");
            num = in.nextInt();
        } while (num!=0);
        
    }
    
}
