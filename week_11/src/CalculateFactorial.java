import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the number (in int): ");
        int intValue = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the number (in double): ");
        double doubleValue = Double.parseDouble(reader.nextLine());


        System.out.printf("%d factorial is %d  (result in int)\n", intValue, nFactorial(intValue));
        System.out.printf("%.1f factorial is %f  (result in double)\n", doubleValue, nFactorial(doubleValue));

        reader.close();
    }


    static int nFactorial(int arg) {
        int factorial = 1;

        for (int i = 1; i <= arg; i++) {
            factorial *= i;
        }

        return factorial;
    }

    static double nFactorial(double arg) {
        double factorial = 1;

        for (int i = 1; i <= arg; i++) {
            factorial *= i;
        }

        return factorial;
    }
}