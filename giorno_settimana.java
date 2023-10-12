 import java.util.Scanner;

public class giorno_settimana {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero tra 1 e 7 ");
        int number =scan.nextInt();
        scan.close();
        week(number);
    }

    public static void week(int day){
        switch(day){
           case 1 : System.out.println("lunedi");
           break;
           case 2 : System.out.println("martedi");
           break;
           case 3 : System.out.println("mercoledi");
           break;
           case 4 : System.out.println("giovedi");
           break;
           case 5 : System.out.println("venerdi");
           break;
           case 6 : System.out.println("sabato");
           break;
           case 7 : System.out.println("domenica");
           break;
           default: System.out.println("input non valido");
        }
        
    }
}
