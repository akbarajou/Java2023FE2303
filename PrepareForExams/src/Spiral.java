
import java.util.Scanner;

public class Spiral {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = Integer.parseInt(reader.nextLine());
        System.out.print("Enter number of columns: ");
        int columns = Integer.parseInt(reader.nextLine());

        int[][] spiral = Spiral.spiral(rows, columns);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }

        reader.close();
    }





    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];

        int value = 1;
        int topRow = 0, bottomRow = rows - 1, leftCol = 0, rightCol = columns - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            // Traverse from left to right
            for (int col = leftCol; col <= rightCol; col++) {
                result[topRow][col] = value++;
            }
            topRow++;

            // Traverse from top to bottom
            for (int row = topRow; row <= bottomRow; row++) {
                result[row][rightCol] = value++;
            }
            rightCol--;

            // Traverse from right to left
            if (topRow <= bottomRow) {
                for (int col = rightCol; col >= leftCol; col--) {
                    result[bottomRow][col] = value++;
                }
                bottomRow--;
            }

            // Traverse from bottom to top
            if (leftCol <= rightCol) {
                for (int row = bottomRow; row >= topRow; row--) {
                    result[row][leftCol] = value++;
                }
                leftCol++;
            }
        }

        return result;
    }
}

