package java_advanced.settimana5.ess1;

public class Main {
    public static void main(String[] args) {
        Student.newArrayList();

        Student.addStudent(new Student("Giovanni", 26));
        Student.addStudent(new Student("Pietro", 29));
        Student.addStudent(new Student("Danilo", 23));
        Student.addStudent(new Student("Antonio", 27));
      
        System.out.println("list with new students");
        Student.printArray();
    }
}
