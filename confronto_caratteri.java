public class confronto_caratteri {
    public static void main(String arg[]){
        char a = 'a';
        char b = 'b';
        comparazione(a, b);

    }

    public static void comparazione(char c , char d){
        boolean equals = c == d; 
        System.out.println(c + " e  " + d + " sono uguali ? : " + equals);
    }
}
