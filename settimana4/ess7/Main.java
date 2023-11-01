package java_advanced.settimana4.ess7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> prova = new HashSet<>();
        prova.add("mela");
        prova.add("pesca");
        prova.add("kiwi");
        System.out.println(prova);
        System.out.println(prova.size());
    }
}
