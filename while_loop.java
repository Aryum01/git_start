public class while_loop {
    public static void main(String arg[]){
        int a = 0 ;
        int b = 10 ;
       System.out.println(" la  somma di tutti i numeri da a a b è :" +  somma(a,b));

    }

    public static int somma(int i, int j){
        int  add = 0;
      while(i < j){
         add += i ;
         i++ ; 
      }
      return add ;
    }
}
