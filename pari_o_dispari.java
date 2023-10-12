public class pari_o_dispari {
    public static void main(String arg[]){
        int a = 5 ;
        even(a);
   
       }
   
       public static void even(int b){
        boolean f = (b % 2) == 0 ;
        System.out.println(b + (f ? " è pari " : " è dispari"));
       }
}
