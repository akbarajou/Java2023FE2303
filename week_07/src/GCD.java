
import java.util.Scanner;

/**
 * October 23. 2023
 * Ajou university inTashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 */

public class GCD {

    public static void main(String[] args) {
        System.out.println("Week 07. Monday");
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = reader.nextInt();
        int gcd = 0;

        int limit = firstNumber;
        if (secondNumber > limit) {
            limit = secondNumber;
        }

        for (int i = 1; i <= limit; i++) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                gcd = i;
            }
        }

        System.out.println("GCD is: " + gcd);


        reader.close();
    }
}
