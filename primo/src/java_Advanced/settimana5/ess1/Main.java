package java_Advanced.settimana5.ess1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        System.out.println("initial list");
        students.add(new Student("Mario", 24));
        students.add(new Student("Carlo", 22));
        students.add(new Student("Simone", 25));
        printArray(students);

        addStudent(students, new Student("Giovanni", 26));
        addStudent(students, new Student("Pietro", 29));
        addStudent(students, new Student("Danilo", 23));
        addStudent(students, new Student("Antonio", 27));

        System.out.println("list with new students");
        printArray(students);
    }
    public static void addStudent(List<Student> students, Student newStudents) {
        students.add(newStudents);
    }

    public static void printArray(List<Student> students) {
        for (Student student2 : students) {
            System.out.println(student2);
        }
    }
}
