package settimana3.ess5;

public class Main {
    public static void main(String [] args){
        Forma newRettangolo = new Rettangolo(7,5);
        Forma newTriangolo = new Triangolo (3,5);


        System.out.println("l'area del rettangolo è : " +  newRettangolo.calcoloArea());
       System.out.println("l'area del triangolo è : " +   newTriangolo.calcoloArea());
    }
}
