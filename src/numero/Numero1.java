/*
costruire una classe che, dato un numero intero, stabilisca se è pari o dispari
e se maggiore, minore o uguale a 0
*/
package numero;

public class Numero1 {
    private int n1;
    
    public Numero1(){
        
    }
    
    public Numero1(int n1){
        this.n1=n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }
    
    public String info(){
        String testo = "il numero è: " + n1 + "\n";
        return testo;
    }
    
    public String pariDispari(){
        
        String testo;
        
        if(n1%2==0){
            testo="pari";
        }else{
            testo="dispari";
        }
        
        return testo;
    }
    
    public String magMinUg0(){
        String testo;
        
        if (n1>0){
            testo="maggiore di 0";
        }else{
            if (n1<0){
                testo="minore di 0";
            }else{
                testo="uguale a 0";
            }
        }
        
        return testo;
    }
    
    public String pNZ1(){
        String testo = "";
        if (n1>=0)
            if(n1==0)
                testo = "uguale a 0";
            else
                testo = "maggiore di 0";
        else
            testo = "minore di 0";
        
            
        return testo;
    }
    
    public String pNZ2(){
        String testo = "";
        if (n1>0)
            testo = "maggiore di 0";
        
        if (n1<0)
            testo = "minore di 0";
        
        if (n1==0)
            testo = "uguale a 0";
        
        return testo;
    }
}
