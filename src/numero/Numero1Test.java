package numero;

import java.util.Scanner;

public class Numero1Test {

    
    public static void main(String[] args) {
        int n1;
        Scanner in = new Scanner(System.in);
        
        System.out.print("inserisci il numero: ");
        n1=in.nextInt();
        
        Numero1 n = new Numero1(n1);
        
        System.out.println("il numero è " + n.pariDispari() + " e " + n.magMinUg0());
        
        System.out.println(n.pNZ1());
        
        System.out.println(n.pNZ2());
    }
    
}
