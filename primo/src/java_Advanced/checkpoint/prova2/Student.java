package java_Advanced.checkpoint.prova2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String cognome;
    private String matricola;
    private List<Integer> voti;

    public Student(String name, String cognome, String matricola) {
        this.name = name;
        this.cognome = cognome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public List<Integer> getVoti() {
        return voti;
    }

    public void setVoti(List<Integer> voti) {
        this.voti = voti;
    }

    public void addVoti(Integer a) {
        voti.add(a);
    }

    public double calculateMedia() {
        double media = 0;
        for (int voto : voti) {
            media += voto;
        }
        return media / voti.size();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cognome=" + cognome + ", matricola=" + matricola + ", voti=" + voti + "]";
    }
}
