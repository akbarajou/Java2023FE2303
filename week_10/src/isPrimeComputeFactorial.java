import java.util.Scanner;

public class isPrimeComputeFactorial {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter any integer number: ");
        int value = Integer.parseInt(reader.nextLine());

        if(! isPrime(value)){
            System.out.println("Oooops!\n");
        } else {
            System.out.printf("%d! is %7.4f\n\n", value, nFactorial(value));
        }

        reader.close();        
    }

    public static boolean isPrime(int arg) {
        if (arg <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(arg); i++) {
            if (arg % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double nFactorial(int arg) {
        double factorial = 1;

        for (int i = 1; i <= arg; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

