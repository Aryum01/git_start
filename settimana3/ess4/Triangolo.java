package settimana3.ess4;

public class Triangolo extends Forma {
    public Triangolo (double base , double altezza){
        super(base,altezza);
    }
    
     @Override
    public  double calcoloArea(){
       double area = (base * altezza) / 2;   
       return area ;
    }

}
