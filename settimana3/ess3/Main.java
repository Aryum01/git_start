package settimana3.ess3;

public class Main {
    public static void main(String[] arg){
       Forma newRettangolo =  new Rettangolo (2,5,0);
       Forma newTriangolo = new Triangolo (3,5,0);

       System.out.println("l'area del rettangolo è : " +  newRettangolo.calcolaArea());
       System.out.println("l'area del triangolo è : " +   newTriangolo.calcolaArea());
        
    }
}
