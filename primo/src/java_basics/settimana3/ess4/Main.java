package java_basics.settimana3.ess4;

public class Main {
    public static void main(String[] arg){
       Forma newRettangolo =  new Rettangolo (2,5);
       Forma newTriangolo = new Triangolo (3,5);

       System.out.println("l'area del rettangolo è : " +  newRettangolo.calcoloArea());
       System.out.println("l'area del triangolo è : " +   newTriangolo.calcoloArea());
        
    }
}
