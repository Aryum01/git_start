public class array2 {
    public static void main(String argh[]){
        char[] a = {'a','b','a','c','d','a'};
        sommaArray(a);
   }

  public static int sommaArray(char[] a ){
       int risultato =  0;
        for(int i = 0; i < a.length ;i++){
          if(a[i] == 'a' ){
              risultato++;
          }
        }
        System.out.println( " ci sono : "+ risultato + " occorenze di a  ");
       
      return risultato;
   }
}
