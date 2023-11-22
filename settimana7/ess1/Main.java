package java_advanced.settimana7.ess1;

import java.math.BigDecimal;
import java.math.RoundingMode;

enum Aritmetica {
    ADDIZIONE,
    SOTTRAZIONE,
    MOLTIPLICAZIONE,
    DIVISIONE,
    MIN,
    MAX
}

public class Main {

    public static void main(String[] args) {

        BigDecimal numero1 = new BigDecimal("45.23");
        BigDecimal numero2 = BigDecimal.valueOf(1200);

        operazione(Aritmetica.ADDIZIONE, numero1, numero2);
        operazione(Aritmetica.SOTTRAZIONE, numero1, numero2);
        operazione(Aritmetica.MOLTIPLICAZIONE, numero1, numero2);
        operazione(Aritmetica.DIVISIONE, numero1, numero2);
        operazione(Aritmetica.MIN, numero1, numero2);
        operazione(Aritmetica.MAX, numero1, numero2);
    }

    private static void operazione(Aritmetica operazione, BigDecimal num1, BigDecimal num2) {
        BigDecimal risultato;

        switch (operazione) {
            case ADDIZIONE:
                risultato = num1.add(num2);
                System.out.println("Addizione: " + risultato);
                break;
            case SOTTRAZIONE:
                risultato = num1.subtract(num2);
                System.out.println("Sottrazione: " + risultato);
                break;
            case MOLTIPLICAZIONE:
                risultato = num1.multiply(num2);
                System.out.println("Moltiplicazione: " + risultato);
                break;
            case DIVISIONE:
                risultato = num1.divide(num2, RoundingMode.HALF_DOWN);
                System.out.println("Divisione: " + risultato);
                break;
            case MIN:
                risultato = num1.min(num2);
                System.out.println("Minimo: " + risultato);
                break;
            case MAX:
                risultato = num1.max(num2);
                System.out.println("Massimo: " + risultato);
                break;
            default:
                System.out.println("Operazione non supportata");
        }
    }
}