package java_advanced.settimana4.ess5;

public class Main {
    public static void main(String[] args){
        try{
               Integer numeratore = 10;
               Integer denominatore = null;
               System.out.println(" il risultato della divisione è : " + division(numeratore,denominatore));
               
               
        }catch(IllegalArgumentException e ){
                 System.out.println(" Errore: " + e.getMessage());
        }
    }


    public static double division(Integer numeratore, Integer denominatore){
        if(numeratore == null || denominatore == null){
           throw new  IllegalArgumentException("Il numeratore e il denominatore non possono essere nulli.");
        }
        return numeratore / denominatore ;
    }
}
