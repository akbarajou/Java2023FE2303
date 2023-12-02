import java.util.Scanner;

/**
 * November 6. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * get value from user and store in the array 
 */


public class GetValue {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = reader.nextInt();
        int[] numbers = new int[length];

//         get value from user
        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value: ");
            numbers[i] = reader.nextInt();
        }

//         display array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        reader.close();
    }
}
