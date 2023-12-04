public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("Prime numbers: ");
        displayPrime();
    }


//    check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= n/2; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void displayPrime() {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
}
