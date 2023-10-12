public class Inverti_matrice{
    public static void main(String args[]) {
        int[][] matrice = {{2, 3, 3, 5, 6}, {9, 7, 8, 3, 2}};
        int colonne = matrice[0].length;
        int righe = matrice.length;
        int[][] matrice2 = new int[colonne][righe];
        inverti(matrice, matrice2, colonne, righe);
    }
    public static void inverti(int[][] a, int[][] b, int c, int d) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
