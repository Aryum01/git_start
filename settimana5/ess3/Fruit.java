package settimana5.ess3;

import java.util.LinkedList;

public class Fruit {
    private static LinkedList<Fruit> fruits = new LinkedList<>();
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public static void newFruitsList() {
        fruits.add(new Fruit("Mela"));
        fruits.add(new Fruit("Banana"));
        fruits.add(new Fruit("Pesca"));
        System.out.println("initial list");
        printList();
    }

    public static void addTofruitsList() {

        fruits.addFirst(new Fruit("Pera"));
        fruits.addLast(new Fruit("Ananas"));
        System.out.println("new list ");
        Fruit.printList();
    }

    public static void printList() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    @Override
    public String toString() {
        return "Fruit [name=" + name + "]";
    }

}
