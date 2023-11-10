package java_advanced.settimana5.ess1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static List<Student> students = new ArrayList<>();
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void newArrayList() {

        students.add(new Student("Mario", 24));
        students.add(new Student("Carlo", 22));
        students.add(new Student("Simone", 25));
        System.out.println("initial list");
        printArray();

    }

    public static void addStudent(Student student) {
        students.add(student);
    
    }

    public static void printArray() {
        for (Student student2 : students) {
            System.out.println(student2);
        }
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
