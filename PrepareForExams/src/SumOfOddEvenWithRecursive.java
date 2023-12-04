public class SumOfOddEvenWithRecursive {

    public static void main(String[] args) {

        System.out.println("Sum of even(5-50): " + sumOfEven(5, 50));
        System.out.println("Sum of odd(5-50): " +sumOfOdd(5, 50));
    }


//    public static int sumOfEven(int n) {
//        if (n == 0) return 0;
//        if (n % 2 == 0) return n + sumOfEven(n - 1);
//        else return sumOfEven(n - 1);
//    }

    public static int sumOfEven(int start, int end) {
        if (start > end) return 0;
        if (start % 2 == 0) return start + sumOfEven(start + 1, end);
        else return sumOfEven(start + 1, end);
    }

//    public static int sumOfOdd(int n) {
//        if (n == 0) return 0;
//        if (n % 2 != 0) return n + sumOfOdd(n - 1);
//        else return sumOfOdd(n - 1);
//    }

    public static int sumOfOdd(int start, int end) {
        if (start > end) return 0;
        if (start % 2 != 0) return start + sumOfOdd(start + 1, end);
        else return sumOfOdd(start + 1, end);
    }

}
