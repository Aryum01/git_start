import java.util.Scanner;

public class tabellina {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println(" inserisci il numero di cui fare la tabellina ");
        int base = scan.nextInt();
        scan.close();
        tab(base);
    }

    public static int tab(int a){
        int risultato = 0;
        System.out.println("ecco la tabellina di " + a );
         for (int i =  1; i <= 10 ; i++ ){
          risultato = a * i ;
             System.out.print( " " + risultato);
         }

        return risultato;
    }
}
