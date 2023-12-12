package settimana5.ess3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Pesca"));
        System.out.println("initial list");
        printList(fruits);
        addTofruitsList(fruits);
        System.out.println("new list ");
        printList(fruits);
    }

    public static void addTofruitsList(LinkedList<Fruit> fruits) {
        fruits.addFirst(new Fruit("Pera"));
        fruits.addLast(new Fruit("Ananas"));
    }

    public static void printList(LinkedList<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
