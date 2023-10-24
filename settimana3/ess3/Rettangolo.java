package settimana3.ess3;

public class Rettangolo extends Forma{

    public Rettangolo(double base, double altezza, double area) {
        super(base, altezza, area);
    }

    @Override
   public  double calcolaArea(){
    double area = base * altezza ; 
    return area ;
 } 
}
