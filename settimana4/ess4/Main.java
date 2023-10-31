package settimana4.ess4;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 4, 3, 1, 8, 9 };
        try {
            division(numbers, 2);
            division(numbers, 8);

        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

    public static void division(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("indice non presente nell'array");
        }

        if (index == 0) {
            throw new ArithmeticException("Divisione per zero non consentita.");
        }
        
        int result = array[3] / index;
        System.out.println("Risultato: " + result);
    }

}
