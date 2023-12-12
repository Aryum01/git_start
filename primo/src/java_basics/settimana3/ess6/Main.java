package java_basics.settimana3.ess6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi la stringa da analizzare");
        String  ingr = scanner.nextLine();

        System.out.println("Dammi l'indice da utilizzare");
        int ind = scanner.nextInt();

        unicode( ingr,ind);

        scanner.close();
    }

    public static void unicode(String  ingr ,int ind) {
        if (ind< 0 || ind >= ingr.length()) {
            System.out.println("Indice non valido.");
        } else {
            StringBuilder stringBuilder = new StringBuilder(ingr);
            int inputUnicode = stringBuilder.codePointAt(ind);
            System.out.println("Il carattere in Unicode è --> " + inputUnicode);
        }
    }
}