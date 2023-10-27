package settimana3.ess7;

public class Triangolo extends Forma {
    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        super(TipoForma.TRIANGOLO);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double area =( base * altezza) / 2;
        System.out.println("Area del triangolo: " + area);
    }
}
