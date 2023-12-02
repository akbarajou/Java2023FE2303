import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Palindrome number");

        Scanner reader = new Scanner(System.in);
        int temp, result = 0;

//        get number from user
        System.out.print("Enter any number: ");
        int number = reader.nextInt();

//        find palindrome number
        temp = number;
        while (temp != 0) {

            result = result * 10 + (temp % 10);
            temp /= 10;
        }

//        display the result
        if (result == number) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrome number");
        }

        reader.close();
    }
}
