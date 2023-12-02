
import java.util.Scanner;

/**
 * October 16. 2023
 * Ajou university inTashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Implement Switch cases
 */

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Week 06, Monday!");
        Scanner reader = new Scanner(System.in);

//        Arithmetic operations
        System.out.print("Enter first number: ");
        double fNum = reader.nextDouble();
        System.out.print("Enter second number: ");
        double sNum = reader.nextDouble();
        System.out.print("Enter operation: ");
        String operation = reader.next();

        switch (operation) {
            case "+":
                System.out.printf("%.0f + %.0f = %.0f\n", fNum, sNum, (fNum + sNum));
                break;
            case "-":
                System.out.printf("%.0f - %.0f = %.0f\n", fNum, sNum, (fNum - sNum));
                break;
            case "*":
                System.out.printf("%.0f * %.0f = %.0f\n", fNum, sNum, (fNum * sNum));
                break;
            case "/":
                System.out.printf("%.0f / %.0f = %f\n", fNum, sNum, (fNum / sNum));
                break;
            case "%":
                System.out.printf("%.0f %s %.0f = %.0f\n", fNum, "%", sNum, (fNum % sNum));
                break;
            default:
                System.out.println("Invalid operation!");
        }


        reader.close();
    }
}