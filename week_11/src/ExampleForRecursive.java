
/**
 * Problem: Find the maximum value in an array using recursive function.
 */

public class ExampleForRecursive {

    public static void main(String[] args) {
//         declare and initialize array
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
//             generate random number between 0 and 100
            arr[i] = (int) (Math.random() * 100);
        }

//         displaying an array
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

        System.out.printf("Max: %d\n", findMax(arr, 0, arr.length - 1));
    }

    public static int findMax(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        }

        int mid = (start + end) / 2;
        int leftMax = findMax(arr, start, mid);
        int rightMax = findMax(arr, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }

}