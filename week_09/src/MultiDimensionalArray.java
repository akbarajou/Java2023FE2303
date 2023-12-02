public class MultiDimensionalArray {
    
    public static void main(String[] args) {
        

        int[][] arrayA = {{1, 2}, {3, 4}};
        int[][] arrayB = {{1, 1}, {2, 2}};
        int[][] arrayC = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }

        for (int[] ints : arrayC) {
            for (int j = 0; j < arrayC.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }


    }
}
