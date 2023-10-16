
public class Main{
    public static void main(String[] args){
     Studente studente1 = new Studente("Mario","Rossi", 423412);
     Studente studente2 = new Studente("Gino","Bianchi", 325167);
     Studente studente3 = new Studente("Ugo","Verdi", 891675);

     String tuttiGliStudenti = studente1 + "\n" + studente2 + "\n" + studente3;
     System.out.println(tuttiGliStudenti);
 }
    }

