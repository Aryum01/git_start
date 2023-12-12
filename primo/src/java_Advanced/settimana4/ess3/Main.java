package java_Advanced.settimana4.ess3;

public class Main {
     public static void main(String[] args){
       try {
            int a = divisione(34, 0);
            System.out.println("Il risultato della divisione è: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static int divisione(int b, int c) {
        if (c == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        return b / c;
    }
}