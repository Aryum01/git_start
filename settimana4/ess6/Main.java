package java_advanced.settimana4.ess6;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        Integer b = a; // autoboxing

        double c = 2.12;
        Double d = c; // autoboxing

        char e = 'c';
        Character f = e;// autoboxing

        Integer primo= Integer.valueOf(24);
        int primo2 = primo; // Unboxing

        Double secondo = Double.valueOf(5.65);
        double secondo2 = secondo; // Unboxing

        Character terzo = Character.valueOf('o');
        char terzo2 = terzo; // Unboxing

        somma(a, primo2);
        somma2(b, primo);
        carattere(e);
        Character(f);

    }

    public static void somma(int a, int b) {
        int somma = a + b;
        System.out.println("la somma tra " + a + " e " + b + " è uguale a " + somma);
    }

    public static void carattere(char c) {
        System.out.println("Il carattere è: " + c);
    }

    public static void somma2(Integer d, Integer e) {
        int somma = d + e;
        System.out.println("la somma tra " + d + " e " + e + " è uguale a " + somma);
    }

    public static void Character(Character f) {
        System.out.println("Il carattere è: " + f);
    }
}
