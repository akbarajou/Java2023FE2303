// import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        int n = 3;

        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                matrixA[i][j] = input.nextInt();
//                matrixB[i][j] = input.nextInt();
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }

        int[][] matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }


        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        System.out.println("\nMatrix C:");
        displayMatrix(matrixC);

    }


    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }
}
