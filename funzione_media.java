public class funzione_media {
    public static void main(String arg[]){
        int numero1=4;
        int numero2=5;
        int numero3=3;
         System.out.println("la media è : " + media(numero1,numero2,numero3));
    }

    public static double media(int a , int b , int c){
        double risultato = (a + b + c) / 3 ;
      return risultato;
    }
}
