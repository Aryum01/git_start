public class confronto {
    public static void main(String arg[]){
     int a = 3;
     int b = 4 ;
     comparazione(a, b);

    }

    public static void comparazione(int a , int b ){
     boolean equals = a == b; 
     System.out.println(a + " e  " + b + " sono uguali ? : " + equals);
    }
}
