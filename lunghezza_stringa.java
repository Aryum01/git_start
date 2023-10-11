public class lunghezza_stringa {
    public static void main(String arg[]){
      String a = "supercalifraggilistichespiralidoso";
      lunghezza(a);
    }
    public static void lunghezza(String b){
        if(b.length() > 10){
          System.out.println("la lunghezza della stringa  è maggiore di 10");
        }else if(b.length() < 10){
          System.out.println("la lunghezza della stringa  è minore di 10");
        }else{
          System.out.println("la lunghezza della stringa  è uguale a 10");
        }
    }
}


