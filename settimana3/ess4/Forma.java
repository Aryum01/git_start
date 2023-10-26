package settimana3.ess4;

public abstract class Forma {
    protected double base;
    protected double altezza;


    public Forma(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public abstract double  calcoloArea();
}
