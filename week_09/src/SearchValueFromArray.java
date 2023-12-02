import java.util.Scanner;

/**
 * November 13. 2023
 * Ajou university inTashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * This program searches value from array
 */

public class SearchValueFromArray {


    public static void main(String[] args) {
        System.out.println("\nSearch value from array!\n");

        Scanner reader = new Scanner(System.in);
        int length;

        System.out.print("Enter the length of array: ");
        length = reader.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value of array[" + i + "]: ");
            array[i] = reader.nextInt();
        }

        System.out.print("Enter the value to search: ");
        int searchValue = reader.nextInt();

        
        for (int i = 0; i < length; i++) {
            if (array[i] == searchValue) {
                System.out.println("Found " + searchValue + " at index " + i);
                break;
            } else if (i == length - 1) {
                System.out.println("Not found " + searchValue + " in array");
            }
        }

        reader.close();
    }
}
