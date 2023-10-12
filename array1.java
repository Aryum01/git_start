public class array1 {
    public static void main(String argh[]){
         int[] a = new int [10];
         sommaArray(a);
    }

   public static int sommaArray(int[] a ){
         int risultato = 0;
         for(int i = 0; i < 10 ;i++){
            a[i] = i + 1 ;
            risultato += i;
            System.out.print( " " + a[i] + " ");    
         }
         System.out.println( " " + "ecco la somma dei valori dentro l'array :  " + risultato);
       return risultato;
    }

}
