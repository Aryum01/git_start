package java_Advanced.settimana7.ess5;

public class Factory {
    public static Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case CERCHIO:
                return new Cerchio();
            case RETTANGOLO:
                return new Rettangolo();
            default:
                throw new IllegalArgumentException("Tipo di shape non supportato");
        }
    }
}
