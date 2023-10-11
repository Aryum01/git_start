public class fizz {
    public static void main(String arg[]){
        int a = 100;
        fizzbuzz(a);
    }

    public static void fizzbuzz(int b){
        for(int i = 0 ; i <= b; i++){
           if( i % 3 == 0 && i % 5 == 0){
         System.out.println("fizzbuzz");
           }else if (i % 3 == 0){
            System.out.println("fizz");
           }else if (i % 5 == 0 ){
            System.out.println("buzz");
           }else {
            System.out.println(i);
           }
        }
    }
}

