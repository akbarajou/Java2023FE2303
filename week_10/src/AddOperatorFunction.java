import java.util.Scanner;

/**
 * November 20. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * This program adds two numbers by calling the function
 */

public class AddOperatorFunction {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = reader.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + add(firstNumber, secondNumber));


        reader.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
