public class NumberPyramid {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--)
                System.out.print(" ");

            for (int k = 0; k < i; k++)
                System.out.print(i);

            for (int m = 1; m < i; m++)
                System.out.print(i);
            System.out.println();
        }
    }
}
