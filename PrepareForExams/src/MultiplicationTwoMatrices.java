
import java.util.Scanner;

/**
 * November 24. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 *
 * This program computes multiplication of two matrices
 */

public class MultiplicationTwoMatrices {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter size of the  matrix: ");
        int n = reader.nextInt();


//        declare and initialize two matrices
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = (int) (Math.random() * 10);
                matrixB[i][j] = (int) (Math.random() * 10);
            }
        }


//        display matrices
        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);


//        compute multiplication of two matrices
        int[][] matrixC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }


//        display result
        System.out.println("\nMatrix C:");
        displayMatrix(matrixC);

        reader.close();
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
