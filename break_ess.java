public class break_ess {
     public static void main(String arg[]){
         int a = 10;
         stampa(a);
     }

     public static void stampa(int a ){
          for (int i = 0; i <= a  ; i++ ){
           if(i == 5){
               break;
           }else{
               System.out.println(i);
           }
          }
     }
}
