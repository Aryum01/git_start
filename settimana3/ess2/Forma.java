package settimana3.ess2;

import java.util.Scanner;

public class Forma {
    public static double calcolaArea(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" inserisci la base del triangolo");
        double Base = scan.nextDouble();
        System.out.println(" inserisci l'altezza del triangolo");
        double altezza = scan.nextDouble();
        double area = (Base * altezza) / 2;
        System.out.println("l'area del triangolo è : " + area);
        return area ;
    }
    
}
