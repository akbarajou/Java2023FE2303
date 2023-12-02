import java.util.Scanner;

/**
 * Example for overloading.
 */

public class ExampleForOverloading {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Overloading\n");

        System.out.print("Enter the first value: ");
        int fInt = Integer.parseInt(reader.nextLine());
        System.out.print("Enter the second value: ");
        int sInt = Integer.parseInt(reader.nextLine());

        // convert to double
        double fDouble = fInt;
        double sDouble = sInt;

        System.out.printf("%d / %d = %d  (result in int)\n", fInt, sInt, devide(fInt, sInt));
        System.out.printf("%.0f / %.0f = %.2f  (result in double)\n", fDouble, sDouble, devide(fDouble, sDouble));

        reader.close();
    }


    static int devide(int a, int b) {
        return a / b;
    }

    static double devide(double a, double b) {
        return a / b;
    }
}