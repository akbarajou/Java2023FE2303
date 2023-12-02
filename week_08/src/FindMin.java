
/**
 * November 6. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Find minimum value in array 
 */

public class FindMin {
    
    public static void main(String[] args) {
        
        int[] numbers = {3, 4, 6, 1, 2, 5};
        int min = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("min: " + min);
    }
}

