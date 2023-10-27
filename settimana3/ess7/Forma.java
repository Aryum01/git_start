package settimana3.ess7;

public class Forma {
    public enum TipoForma {
        TRIANGOLO, RETTANGOLO
    }

    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public void calcolaArea() {
        System.out.println("Impossibile calcolare l'area. Tipo di forma non specificato.");
    }
}
