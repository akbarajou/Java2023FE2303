
/**
 * October 30. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * Midterm Exam problem
 * Write a program that computes the sum of even and odd numbers from 65 to 35.
 */

public class SumofEvenOdd {
    
    public static void main(String[] args) {
        System.out.println("Sum of Even and Odd Numbers");

        // declare and initialize variables
        int sumEven = 0, sumOdd = 0;

        // compute the sum of even and odd numbers
        for (int i = 65; i >= 35; i--) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        // Print the sum of even and odd numbers
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
}
