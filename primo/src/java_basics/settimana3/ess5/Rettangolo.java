package java_basics.settimana3.ess5;

class Rettangolo implements Forma {
    private double base;
    private double altezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.base = lunghezza;
        this.altezza = larghezza;
    }

    @Override
    public double calcoloArea() {
        double area = base * altezza;
        return area ;
    }
}