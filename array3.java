public class array3 {
    public static void main(String arg[]){
        int[] a = {1,1,2,2,3,3};
        int[] b = new int[a.length];

        newArray(a,b);
    }

    public static void newArray(int[] c , int[] d){
        int s = 0;
       for(int i=0 ; i< c.length ; i++){
        boolean duplicato = false;
             for(int j=0 ; j < d.length ; j++){
                if(c[i] == d[j]){
                    duplicato = true;
                    break;
                }     
            }  
            if (!duplicato) {
                d[s] = c[i];
                s++;
            }
       }
       
        for(int i=0 ; i< s; i++){
            System.out.println(" ecco l'array senza duplicati : " + d[i]);
        }   
    }
}

