package numero;
public class Numero{
  private int n1,n2;

  public Numero(int n1, int n2){
    this.n1=n1;
    this.n2=n2;
  }

  public int getN1(){
    return n1;
  }
  public int getN2(){
    return n2;
  }
  public void setN1(int n1){
    this.n1=n1;
  }
  public void setN2(int n2){
    this.n2=n2;
  }

  public int nMax(){
    return Math.max(n1,n2);
  }
  public int nMin(){
    return Math.min(n1,n2);
  }

  public int differenza(int nMax, int nMin){
    nMax=Math.max(n1,n2);
    nMin=Math.min(n1,n2);
    return (nMax-nMin);
  }
  
}