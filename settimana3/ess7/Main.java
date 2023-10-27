package settimana3.ess7;

public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(4.0, 5.0);
        Rettangolo rettangolo = new Rettangolo(6.0, 8.0);

        Forma[] forme = {triangolo, rettangolo};

        for (Forma forma : forme) {
            System.out.println(forma.getTipo());
            forma.calcolaArea();
        }
    }
}
