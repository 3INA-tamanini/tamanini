package numero;
import java.util.Scanner;
public class NumeroTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("inserisci il primo numero: ");
        n1=in.nextInt();
        System.out.println("inserisci il secondo numero: ");
        n2=in.nextInt();

        Numero n = new Numero(n1,n2);

        System.out.println("la differenza tra " + n.nMax() + " e " + n.nMin()  + " è: " + n.differenza(n1, n2));
    
        in.close();}
}