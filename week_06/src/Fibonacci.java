
import java.util.Scanner;

/**
 * October 16. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Print Fibonacci numbers 
 */

public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println("Week 06, Monday!");
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int fNum = reader.nextInt();
        System.out.print("Enter second number: ");
        int sNum = reader.nextInt();

        int i = 0;
        do {
            int fibonacci = fNum + sNum;
            System.out.print(fibonacci + " ");
            fNum = sNum;
            sNum = fibonacci;
            i++;
        } while (i < 10);
        System.out.println();


        reader.close();
    }
}
