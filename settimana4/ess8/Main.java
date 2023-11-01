package java_advanced.settimana4.ess8;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> prova = new HashSet<>();
        prova.add("mela");
        prova.add("pesca");
        prova.add("kiwi");

        String find = "Banana";

        boolean exist = prova.contains(find);

        if (exist) {
            System.out.println("L'elemento '" + find + "' è parte dell'HashSet.");
        } else {
            System.out.println("L'elemento '" + find + "' non è parte dell'HashSet.");
        }
    }

}