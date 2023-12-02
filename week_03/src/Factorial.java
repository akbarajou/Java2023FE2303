import java.util.Scanner;

/**
 * Sep 29. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * This program prints the factorial of a number.
 */
public class Factorial {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int number = Integer.valueOf(reader.nextLine());
        int factorial = 1;

        for (int j = number; j >= 1; j--){
            factorial = factorial * j;
        }
        System.out.printf("%d factorial of %d\n", factorial, number);


        reader.close();
    }
}
