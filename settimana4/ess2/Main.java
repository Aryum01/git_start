package settimana4.ess2;

public class Main {
    public static void main(String[] args){
        try{
            char a ='e';
            isNumber(a);
            System.out.println(" Il carattere  è un numero.");
        }catch(NotANumber e ){
            System.out.println("ERRORE: Il carattere non è un numero.");
        }
    }

    public static void isNumber (char a) throws NotANumber{
        if (!Character.isDigit(a)) {
            throw new NotANumber();
        }
    }

}
