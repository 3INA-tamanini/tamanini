package eserciziDevincentis;

public class Numero {
    private int num;
    
    public Numero() {
    }
    
    public Numero(int num){
    this.num = num;
    }
    
    public int getNum() {
    return num;
    }
    
    public void setNum(int num) {
    this.num = num;
    }
    
    public String tabellina(){
    int risultato;
    String str = "";
    int i = 1;
    while (i <=10) {
    risultato = num * i;
    str += num + " X " + i + " = " + risultato + "\n";
    i++;
    } return str;
    }
    
    }