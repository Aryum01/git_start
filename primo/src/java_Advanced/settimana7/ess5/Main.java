package java_Advanced.settimana7.ess5;

enum ShapeType {
    CERCHIO,
    RETTANGOLO
}

public class Main {
    public static void main(String[] args) {
        Shape cerchio = Factory.createShape(ShapeType.CERCHIO);
        cerchio.draw();

        
        Shape rettangolo = Factory.createShape(ShapeType.RETTANGOLO);
        rettangolo.draw();
    }
}
