package java_basics.settimana3.ess5;

 class Triangolo implements Forma{
    private double base ;
    private double altezza;

    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcoloArea(){
        double area = (base * altezza) / 2;
        return area ;
    }
    
}
