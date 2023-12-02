
/**
 * November 20. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * 
 * This program multiplies two matrices
 */

public class MultiplicationTwoMatrices {
    public static void main(String[] args) throws Exception {
        System.out.println("\n=================================");
        System.out.println("Multiplication of two matrices");

        // length of matrix
        int n = 2;

        // declare and initialize matrices
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                b[i][j] = (int) (Math.random() * 10);
            }
        }

        // computing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[j][k] * b[k][j];
                }
            }
        }

        // displaying
        System.out.println("matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nmatrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nmatrix C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
