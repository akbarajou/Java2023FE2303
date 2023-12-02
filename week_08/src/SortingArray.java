import java.util.Scanner;


/**
 * November 8. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Sorting array elements from got user 
 */

public class SortingArray {
    
    /**
     * This method sorts an array of integers in ascending order using the bubble sort algorithm.
     * The user is prompted to enter the length of the array and then enter random numbers to fill the array.
     * The main logic of the algorithm is to compare adjacent elements of the array and swap them if they are in the wrong order.
     * This process is repeated until the entire array is sorted in ascending order.
     * Finally, the sorted array is displayed to the user.
     */

    public static void main(String[] args) {
        System.out.println("Week 8. Array!");
        
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int length = reader.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter random number: ");
            array[i] = reader.nextInt();
        }

//         Main logic of sorting
        for (int i = 0; i < length; i++) {
//             j = i + 1 because we don't need to compare the same elements
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
//                     swap elements
//                     temp variable is used to store the value of the first element
//                     so that it is not lost when the first element is overwritten
                    int temp = array[i];

//                     the first element is overwritten with the value of the second element
//                     because the second element is smaller than the first element,
//                     and we need to sort the array in ascending order
                    array[i] = array[j];
//                     the second element is overwritten with the value of the first element
//                     which was stored in the temp variable
                    array[j] = temp;
                }
            }
        }

//         display elements of array
        System.out.print("Sorted array: ");
        for (int each : array) {
            System.out.print(each + " ");
        }
        System.out.println();


        reader.close();
    }
}
