package java_Advanced.esempi.checkpoint.prova2;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<Student> registry = new ArrayList<>();

    public void addStudent(Student student) {
        registry.add(student);
    }

    public void removeStudent(Student student) {
        registry.remove(student);
    }

    public void printStudent() {
        for (Student student : registry) {
            System.out.println(student);
        }
    }

    public double mediaVotiStudente(String matricola) {
        for (Student studente : registry) {
            if (studente.getMatricola().equals(matricola)) {
                return studente.calculateMedia();
            }
        }
        return -1; // Restituisce -1 se lo studente non viene trovato
    }

    public List<Student> mediaMaxACertainLimit(int b) {
        List<Student> newRegistry = new ArrayList<>();
        for (Student student : registry) {
            if (student.calculateMedia() >= b) {
                newRegistry.add(student);
            }
        }
        return newRegistry;
    }
}
