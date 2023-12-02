import java.util.Scanner;

/**
 * October 30. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * Midterm Exam problem
 * Write a program that calculates two numbers based on the operator (using switch case).
 */

public class SwitchCases {
    
    public static void main(String[] args) {
        System.out.println("Switch Cases");

        Scanner reader = new Scanner(System.in);

        // get the first number, second number and the operator from the user
        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = reader.nextInt();
        System.out.print("Enter the operator: (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        int result = 0;

        // check the operator and compute the result
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.printf("%d + %d = %d\n", firstNumber, secondNumber, result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.printf("%d - %d = %d\n", firstNumber, secondNumber, result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.printf("%d * %d = %d\n", firstNumber, secondNumber, result);
                break;
            case '/':
                result = firstNumber / secondNumber;
                System.out.printf("%d / %d = %d\n", firstNumber, secondNumber, result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        

        reader.close();
    }
}
