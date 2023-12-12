package settimana5.ess5;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Pesca", 4);
        treeMap.put("Mela", 3);
        treeMap.put("Pera", 8);
        printTreeMap(treeMap);
    }

    public static void printTreeMap(TreeMap<String, Integer> treeMap) {
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Chiave: " + entry.getKey() + ", Valore: " + entry.getValue());
        }
        System.out.println();
    }
}
