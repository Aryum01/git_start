public class pari_o_dispari {
    public static void main(String arg[]){
        int a = 5 ;
        valoreCompreso(a);
   
       }
   
       public static void valoreCompreso(int b){
        boolean f = (b % 2) == 0 ;
        System.out.println(b + (f ? " è pari " : " è dispari"));
       }
}
