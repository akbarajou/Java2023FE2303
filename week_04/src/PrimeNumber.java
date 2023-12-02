
/**
 * Oct 05, 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Implement prime numbers
 */


public class PrimeNumber {
    
    public static void main(String[] args) {
        
        // Prime numbers
        int count = 0, i, j;
        for (i = 1; i <= 50; i++) {
            count = 0;
            for (j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }

            if (count == 2) {
                System.out.println(i);  
            } 
        }
    }
}
