
/**
 * Sep 29. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * This program prints the numbers 1 to 4, each repeated 5 times on a new line.
 * The output is displayed in the console.
 */

public class PrintNumbers {
    
    public static void main(String[] args) {
        
        for (int m = 1; m <= 4; m++) {
            
            for (int n = 1; n <= 5; n++) {
                System.out.print(m);
            }
            System.out.println("");
        }
    }
}
