package settimana5.ess5;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {

    private static TreeMap<String, Integer> treeMap = new TreeMap<>();

    public static void inizializeTreemap() {

        treeMap.put("Pesca", 4);
        treeMap.put("Mela", 3);
        treeMap.put("Pera", 8);
        printTreeMap();
    }

    public static void printTreeMap() {
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        System.out.println();
    }
}
