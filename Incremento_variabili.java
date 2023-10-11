public class Incremento_variabili {
    public static void main(String arg[]){
      int a,b;
      a = 4 ;
      b = 5;
      System.out.println("ecco il risultato dell'incremento delle variabili di 2 e della successiva moltiplicazione : "+ incremento(a,b));
    }

    public static double incremento(int c , int d){
        int valore_aggiunto = 2 ;
        c+= valore_aggiunto;
        d+=valore_aggiunto;
        double risultato = c * d;
      return risultato ;
    }
}
