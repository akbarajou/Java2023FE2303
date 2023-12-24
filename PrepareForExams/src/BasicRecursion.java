public class BasicRecursion {

    public static void main(String[] args) {

        System.out.println(factorial(5));
        
        System.out.println(fibonacci(10));

        System.out.println(sumOfN(5));

        System.out.println(power(4, 2));

        System.out.println(reverseString("Akbar"));
    }


//    recursive function to calculate the factorial of a given integer.
    public static int factorial(int n) {
        if (n == 2) return n;
        return n * factorial(n - 1);
    }


//    recursive function to calculate the nth Fibonacci number.
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


//    recursive function to find the sum of the first n natural numbers.
    public static int sumOfN(int n) {
        if (n == 0) return n;
        return n + sumOfN(n - 1);
    }


//    recursive function to compute the power of a number (x^n).
    public static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }


//    recursive function to reverse a string.
    public static String reverseString(String s) {
        if (s.isEmpty()) return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
