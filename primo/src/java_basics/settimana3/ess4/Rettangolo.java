package java_basics.settimana3.ess4;

public class Rettangolo  extends Forma{
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
       
    }
    @Override
    public double calcoloArea() {
        double area = base * altezza ; 
        return area ;
    }

    
}
