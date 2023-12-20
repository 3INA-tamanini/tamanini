
package Verifica;


public class EquazioneII {
    double a,b,c;

    public EquazioneII(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double d(){
        double d = b*b *(4*a*c);
        return d;
    }
    
    public double x1(){
        double x1;
        if (d()>=0){
            if (d()>0){
                x1 = (-b + Math.sqrt(d()))/(2*a);
            }else{
                x1 = -b/(2*a);
            }
        }else{
            x1=0;
        }
        
        return x1;
    }
    
    public double x2(){
        double x1;
        if (d()>=0){
            if (d()>0){
                x1 = (-b + Math.sqrt(d()))/(2*a);
            }else{
                x1 = -b/(2*a);
            }
        }else{
            x1=0;
        }
        
        return x1;
    }
    
    
}
