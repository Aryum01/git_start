package java_Advanced.esempi.checkpoint.prova2;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gabriele", null, "12434125");
        Student student2 = new Student("Giovanni", "Pietro di", "345");
        Student student3 = new Student("Miao", "Miao", "7689");

        student1.addVoti(5);
        student1.addVoti(2);
        student1.addVoti(2);

        student2.addVoti(10);
        student2.addVoti(3);
        student2.addVoti(7);

        student3.addVoti(9);
        student3.addVoti(5);
        student3.addVoti(10);

        Registry registry = new Registry();
        registry.addStudent(student1);
        registry.addStudent(student2);
        registry.addStudent(student3);
        registry.printStudent();
        System.out.println(" ");
        registry.removeStudent(student3);
        registry.printStudent();
        System.out.println(" ");

        System.out.println(registry.mediaVotiStudente("12434125"));
        System.out.println(" ");
        System.out.println(registry.mediaMaxACertainLimit(6));

    }
}
