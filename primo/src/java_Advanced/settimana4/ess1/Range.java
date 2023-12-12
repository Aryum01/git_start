package java_Advanced.settimana4.ess1;
import java.util.Scanner;

public class Range {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
        try{System.out.println("dammi il limite superiore");
        int superiore = scan.nextInt();
        System.out.println("dammi il limite inferiore");
        int inferiore = scan.nextInt();
         System.out.println("dammi un numero da cercare nel range ");
        int find = scan.nextInt();
        trueOrFalse(superiore,inferiore,find);
    }catch (java.util.InputMismatchException e){
          System.out.println(" ERRORE : inserisci un intero ");
    }catch (FuoriRangeException  e){
          System.out.println(" ERRORE : il numero è fuori dal range");
    }finally{
        scan.close();
    }
    }


    public static boolean trueOrFalse(int superiore,int inferiore,int find) throws FuoriRangeException{
          boolean result;
         
        if(find < superiore && find > inferiore){
            result =  true ;
            System.out.println(result);
        }else{
            throw new  FuoriRangeException();
        }  
        return result;
    }
}
