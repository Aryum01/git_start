package settimana4.ess9;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Set<String> prova = new HashSet<>();
        prova.add("mela");
        prova.add("pesca");
        prova.add("kiwi");

        String find = "kiwi";

        boolean exist = prova.contains(find);

        if (exist) {
            Iterator<String> iterator = prova.iterator();
            while (iterator.hasNext()) {
                String elemento = iterator.next();
                if (elemento.equals(find)) {
                    iterator.remove(); // Rimuovi l'elemento corrente
                }
            }
            System.out.println(prova); // Stampa il set dopo la rimozione
        }

        if (!exist) {
            System.out.println("L'elemento '" + find + "' non è parte dell'HashSet.");
        }

        prova.clear();

        if (prova.isEmpty()) {
            System.out.println("L'HashSet è vuoto: " + prova);
        } else {
            System.out.println("L'HashSet non è vuoto: " + prova);
        }
    }
}
