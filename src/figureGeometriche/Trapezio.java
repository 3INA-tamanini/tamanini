package figureGeometriche;
        
public class Trapezio{
  private double base1,base2,altezza,lato;

  public Trapezio(double base1, double base2, double altezza, double lato){
    this.base1=base1;
    this.base2=base2;
    this.altezza=altezza;
    this.lato=lato;
  }
  
  
  public double getBase1(){
    return base1;
  }

  public void setBase1(double base1){
    this.base1 = base1;
  }

  public double getBase2(){
    return base2;
  }
  public void setBase2(double base2){
    this.base2 = base2;
  }

  public double getAltezza(){
    return altezza;
  }

  public void setAltezza(double altezza){
    this.altezza=altezza;
  }

  public double getLato(){
    return lato;
  }
  public void setLato(double lato){
    this.lato=lato;
  }
  
  
  public double area(){
    double a = (base1+base2)*altezza/2;
    return a;
  }
  public double perimetro(){
    double p = base1+base2+(lato*2);
    return p;
  }
  
  public String info(){
        String testo;
        testo = "base maggiore  : "  + base1  +"\n"  + 
                "base minore    : "  + base2  + "\n" +
                "altezza        : "  + altezza+ "\n" + 
                "lato           : "  + lato   + "\n";
        return testo;
    }
}