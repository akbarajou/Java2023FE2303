public class AdvancedRecursion {

    public static void main(String[] args) {

        System.out.println(gcd(18, 27));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));

        towerOfHanoi(3, 'A', 'C', 'B');

        int[] subset = new int[arr.length];
        generateSubsets(arr, 0, subset);

        System.out.println(isPalindrome("madam", 0, 4));

    }




//    1. Write a recursive function to find the greatest common divisor (GCD) of two numbers.
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }


//    2. Implement a recursive function to perform binary search on a sorted array.
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1; // element not found
        int mid = (start + end) / 2;
        if (arr[mid] == target) return mid; // element found
        if (arr[mid] > target) return binarySearch(arr, target, start, mid - 1);
        return binarySearch(arr, target, mid + 1, end);
    }


//    3. Write a recursive function to solve the Tower of Hanoi problem for n disks.
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.printf("Move disk 1 from %c to %c\n", from, to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.printf("Move disk %d from %c to %c\n", n, from, to);
        towerOfHanoi(n - 1, aux, to, from);
    }


//    4. Implement a recursive function to generate all possible subsets of a set.
    public static void generateSubsets(int[] arr, int index, int[] subset) {
        if (index == arr.length) {
            for (int i = 0; i < subset.length; i++)
                if (subset[i] == 1) System.out.print(arr[i] + " ");
            System.out.println();
            return;
        }
        subset[index] = 0;
        generateSubsets(arr, index + 1, subset);
        subset[index] = 1;
        generateSubsets(arr, index + 1, subset);
    }


//    5. Write a recursive function to check if a given string is a palindrome.
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }


}
