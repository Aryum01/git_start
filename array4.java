public class array4 {
    public static void main(String args[]){
        int[][] matrice = {{2, 3, 3, 5, 6}, {9, 7, 8, 3, 2}};
        System.out.println("ecco la somma dei valori all'interno della prima riga della matrice : " + calcolo(matrice));
    }

    public static int calcolo(int[][] a){
        int somma = 0;
            for (int j = 0; j < a[0].length; j++) {
               somma+=a[0][j];
            }
        return somma;
    }
}
