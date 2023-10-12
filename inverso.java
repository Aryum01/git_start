import java.util.Scanner;

public class inverso {
    
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println(" inserisci il numero da cui partire ");
        int base = scan.nextInt();
        System.out.println(" inserisci il numero massimo di risultati  ");
        int max = scan.nextInt();
        scan.close();
        tab(base,max);
    }

    public static int tab(int a, int b){
        int risultato = 0 ;
        System.out.println("ecco il risultato");
         for (int i =  a; i > 0 && b > 0 ; i-- ){
           risultato = i ;
           System.out.print( " " + risultato);
              b--;
         }
         return risultato;
    }
    
}
