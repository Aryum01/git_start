public class valore_compreso {
    public static void main(String arg[]){
        int a = 0 ;
        int b = 10 ;
        valoreCompreso(a, b);
   
       }
   
       public static void valoreCompreso(int a , int b ){
        int e = 6 ;
        boolean f = e >= a && e <= b; 
        System.out.println(e + (f ? " è" : " non è") + " compreso tra " + a + " e " + b);
       }
}
