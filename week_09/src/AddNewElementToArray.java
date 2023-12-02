import java.util.Scanner;

/**
 * November 13. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * This program adds the new element to the array
 */

public class AddNewElementToArray {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = reader.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of the element [" + i + "]: ");
            array[i] = reader.nextInt();
        }

//         display the array
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

//         add extra element
        System.out.print("Do you want to add element? (if yes enter element): ");
        int extraElement = reader.nextInt();
        int[] newArray = new int[size + 1];

//         add the extra element
//         main logic
//         I just copy the elements from the original array to the new array
        for (int i = 0; i < size; i++)
            newArray[i] = array[i];

        // add the new element to the end of the new array
        newArray[size] = extraElement;

        // display the new array
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();


        reader.close();
    }
}
