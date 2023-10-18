import java.util.Scanner;

public class algebra {
     public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un operatore algebrico");
        String number =scan.nextLine();
        scan.close();
        operator(number);
    }

    public static void operator(char a){
        switch(a){
           case "+" : System.out.println("addizione");
           break;
           case "-" : System.out.println("sottrazione");
           break;
           case "*": System.out.println("moltiplicazione");
           break;
           case "/" : System.out.println("divisione");
           break;
           default: System.out.println("input non valido");
        }
        
    }
}
