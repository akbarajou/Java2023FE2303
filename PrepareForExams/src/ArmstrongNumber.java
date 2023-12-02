import java.util.Scanner;

/**
 * October 29. 2023
 * Ajou University in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed ny Tangirov Akbar
 * This program finds the Armstrong number
 */

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println("Armstrong number");

        Scanner reader = new Scanner(System.in);
        int temp, result = 0;

//        get number from user
        System.out.print("Enter any number: ");
        int number = reader.nextInt();

//        find armstrong number
        temp = number;
        while (temp != 0) {
            int remainder = temp % 10;
            result += remainder * remainder * remainder;
            temp /= 10;
        }

//        display the result
        if (result == number) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }

        reader.close();
    }
}
