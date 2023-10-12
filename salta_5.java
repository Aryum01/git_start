public class salta_5 {

     public static void main(String arg[]){
         int a = 10;
         stampa(a);
     }

     public static void stampa(int a ){
          for (int i = 0; i <= a  ; i++ ){
           if(i == 5){
               continue;
           }else{
               System.out.println(i);
           }
          }
     }
}
