package settimana3.ess2;

import java.util.Scanner;

public class Rettangolo extends Forma{
    public static double calcolaArea(){
        Scanner scan = new Scanner(System.in);
        System.out.println(" inserisci la base del rettangolo");
        double Base2 = scan.nextDouble();
        System.out.println(" inserisci l'altezza del rettangolo");
        double altezza2 = scan.nextDouble();
        double area2 = Base2 * altezza2;
        System.out.println("l'area del rettangolo è : " + area2);
        return area2 ;
    }

}