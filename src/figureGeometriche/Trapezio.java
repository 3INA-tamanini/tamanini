package figureGeometriche;
public class Trapezio{
  private double base1,base2,altezza,lato;
  /**
   * metodo costruttore
   * @param base1
   * @param base2
   * @param altezza
   * @param lato
   */
  public Trapezio(double base1, double base2, double altezza, double lato){
    this.base1=base1;
    this.base2=base2;
    this.altezza=altezza;
    this.lato=lato;
  }
  /**
   * metodo per calcolare l'area
   * @return a
   */
  public double area(){
    double a = (base1+base2)*altezza/2;
    return a;
  }
  /**
   * metodo per calcolare il perimetro
   * @return perimetro
   */
  public double perimetro(){
    double p = base1+base2+(lato*2);
    return p;
  }
  /**
   * metodo get della base maggiore
   * @return base1
   */
  public double getBase1(){
    return base1;
  }
  /**
   * metodo set della base maggiore
   * @param base1
   */
  public void setBase1(double base1){
    this.base1 = base1;
  }
  /**
   * metodo get della base minore
   * @return base2
   */
  public double getBase2(){
    return base2;
  }
  /**
   * metodo set della base minore
   * @param base2
   */
  public void setBase2(double base2){
    this.base2 = base2;
  }
  /**
   * metodo get dell'altezza
   * @return altezza
   */
  public double getAltezza(){
    return altezza;
  }
  /**
   * metodo set dell'altezza
   * @param altezza
   */
  public void setAltezza(double altezza){
    this.altezza=altezza;
  }
  /**
   * metodo get del lato
   * @return lato
   */
  public double getLato(){
    return lato;
  }
  /**
   * metodo set del lato
   * @param lato
   */
  public void setLato(double lato){
    this.lato=lato;
  }
}