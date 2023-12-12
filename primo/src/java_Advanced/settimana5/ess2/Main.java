package java_Advanced.settimana5.ess2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        newArrayList(students);
        System.out.println("sorted list by age ");
        printArray(students);
    }

    public static void newArrayList(List<Student> students) {
        students.add(new Student("Mario", 24));
        students.add(new Student("Carlo", 22));
        students.add(new Student("Simone", 25));
        students.add(new Student("Antonio", 24));
        students.add(new Student("Danilo", 23));
        students.add(new Student("Pietro", 29));
        students.add(new Student("Marco", 25));
        students.add(new Student("Giuseppe", 29));
        students.add(new Student("Noemi", 26));
        students.add(new Student("Francesca", 22));
        students.add(new Student("Simona", 20));
        students.add(new Student("Rosanna", 20));
        System.out.println("initial list");
        printArray(students);
        Comparator<Student> SortArray = Comparator.comparingInt(Student::getAge);
        Collections.sort(students, SortArray);
    }

    public static void printArray( List<Student> students) {
        for (Student student2 : students) {
            System.out.println(student2);
        }
    }

}
