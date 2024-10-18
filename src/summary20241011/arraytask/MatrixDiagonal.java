package summary20241011.arraytask;

public class MatrixDiagonal {

    public static void main(String[] args) {
        int m = 3;  // row
        int n = 4;  // column

        printMatrix(createMatrix(m,n));
    }

    private static int [][] createMatrix(int m, int n) {
        int [][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            int j = n-1 - i;
            if ( j>= 0 && j< n ) {
               matrix [i][j] = 1;
            }

        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
