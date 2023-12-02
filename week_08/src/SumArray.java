
/**
 * November 8. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * 
 * Compute sum of array 
 */

public class SumArray {
    
    public static void main(String[] args) {
        System.out.println("Week 8. Array!");

        int array[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }

        // display elements of array
        System.out.print("Array: ");
        for(int each : array) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("Sum of array: " + sum);
        
    }
}
