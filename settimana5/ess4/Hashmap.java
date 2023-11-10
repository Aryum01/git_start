package settimana5.ess4;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    private static HashMap<String, Integer> firstMap = new HashMap<>();

    private static HashMap<String, Integer> secondMap = new HashMap<>(Map.of("Pesca", 4));

    private static HashMap<String, Integer> thirdMap = new HashMap<>();

    public static void initializeMap() {
        firstMap.put("Mela", 3);
        thirdMap.putAll(Map.of("Banana", 7, "Pera", 8));
        printHashMap(firstMap);
        printHashMap(secondMap);
        printHashMap(thirdMap);
    }

    public static void printHashMap(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        System.out.println();
    }
}
