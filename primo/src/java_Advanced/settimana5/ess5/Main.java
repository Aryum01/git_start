package java_Advanced.settimana5.ess5;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pesca", 4);
        hashMap.put("Mela", 3);
        hashMap.put("Pera", 8);

        printHashMap(hashMap);

       
        List<Integer> valuesList = new ArrayList<>(hashMap.values());
        Collections.sort(valuesList);
        printSortedValues(valuesList);
    }

    public static void printHashMap(HashMap<String, Integer> hashMap) {
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        System.out.println();
    }

    public static void printSortedValues(List<Integer> values) {
        System.out.println("Valori ordinati:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
