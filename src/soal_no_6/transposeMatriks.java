package soal_no_6;

public class transposeMatriks {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks sebelum tranposisi:");
        printMatrix(matrix);

        transpose(matrix);

        System.out.println("Matriks setelah tranposisi:");
        printMatrix(matrix);
    }

    public static void transpose(int[][] matrix) {
        // Loop untuk melakukan tranposisi
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                // Menukar elemen matrix[i][j] dengan matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
