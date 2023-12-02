
/**
 * November 6. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Find max value in array 
 */

public class FindMax {
    
    public static void main(String[] args) {
       
        int[] numbers = {32, 56, 3, 12, 87, 1};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("max: " + max);

        
    }
}
