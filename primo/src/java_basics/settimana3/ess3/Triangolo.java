package java_basics.settimana3.ess3;

public class Triangolo extends Forma{
      
    public Triangolo(double base, double altezza,double area) {
        super(base, altezza, area);
    }


    @Override
    public  double calcolaArea(){
    area = (base * altezza) / 2;   
    return area ;
    }
}
