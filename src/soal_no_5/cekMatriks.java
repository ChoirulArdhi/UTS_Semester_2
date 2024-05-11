package soal_no_5;

public class cekMatriks {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        if (isIdentityMatrix(matrix)) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        // Memastikan matriks memiliki dimensi 3x3
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }

        // Periksa elemen diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Memastikan elemen adalah 0, jika di luar diagonal 
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
                // Memastikan elemen adalah 1, jika pada diagonal 
                if (i == j && matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
