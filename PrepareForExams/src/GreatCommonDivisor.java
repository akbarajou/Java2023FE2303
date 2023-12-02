import java.util.Scanner;

/**
 * October 30. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * Midterm Exam problem
 * Write a program that computes the greatest common divisor of two numbers.
 */

public class GreatCommonDivisor {

    public static void main(String[] args) {
        System.out.println("Great Common Divisor!");

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = reader.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = reader.nextInt();

        int gcd = 1, limit = 0;

        // I have to find the smallest number between firstNumber and secondNumber
        // because the greatest common divisor cannot be greater than the smallest number
        if (firstNumber > secondNumber) {
            limit = secondNumber;
        } else {
            limit = firstNumber;
        }

        // I have to check if the number is divisible by both firstNumber and secondNumber
        // if it is divisible by both firstNumber and secondNumber, then it is the greatest common divisor
        for (int i = 1; i <= limit; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }

        // Display the greatest common divisor
        System.out.println("Greatest Common Divisor: " + gcd);


        reader.close();
    }
}


