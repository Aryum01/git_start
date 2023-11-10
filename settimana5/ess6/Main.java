package settimana5.ess6;

record Point(int x, int y) {}

public class Main {
    public static void main(String[] args) {
       
        Point punto = new Point(5, 10);

        System.out.println("Coordinate del punto: (" + punto.x() + ", " + punto.y() + ")");
    }
}
