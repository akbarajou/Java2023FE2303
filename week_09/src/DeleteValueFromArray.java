import java.util.Scanner;

/**
 * November 13. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * This program deletes the value from the array
 */

public class DeleteValueFromArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(reader.nextLine());
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of the element [" + i + "]: ");
            array[i] = reader.nextInt();
        }

        System.out.print("before deleting: ");
        for (int each : array) {
            System.out.print(each + " ");
        }
        System.out.println();

        System.out.print("Enter the value to delete: ");
        int deleteValue = reader.nextInt();
        int[] newArray = new int[size - 1];

//         delete the value
//         main logic
//         I create j to keep track of the index of the new array, because
//         the new array is smaller than the original array
        int j = 0;
        for (int i = 0; i < size; i++) {
//             if the value is not the value to delete, I add it to the new array
            if (array[i] != deleteValue) {
                newArray[j] = array[i];
                j++;
            }
        }
        

        System.out.print("after deleting: ");
        for (int each : newArray) {
            System.out.print(each + " ");
        }
        System.out.println();


        reader.close();
    }
}