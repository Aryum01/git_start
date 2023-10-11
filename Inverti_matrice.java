public class Inverti_matrice{
    public static void main(String args[]) {
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}};
        int colonne = matrice[0].length;
        int righe = matrice.length;
        int[][] matrice2 = new int[colonne][righe];
        calcolo(matrice, matrice2, colonne, righe);
    }
      // Prima quadra numero di array (quanti array ha) array1 = 2; array2 = 3
        // Seconda quadra quanti valori ci sono dentro ogni ARRAY della prima quadra. array1= 3; array2= 2
        // specify two indexes: one for the array, and one for the element inside that array

    public static void calcolo(int[][] matrix, int[][] matrix2, int colonn, int righ) {
        for (int i = 0; i < righ; i++) {
            for (int j = 0; j < colonn; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < colonn; i++) {
            for (int j = 0; j < righ; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
