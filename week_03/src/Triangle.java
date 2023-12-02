
/**
 * Sep 28. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * This program prints a triangle of asterisks to the console.
 * The triangle has a base of 5 asterisks and each row has one more asterisk
 * than the previous row.
 */
    

public class Triangle {    

    public static void main(String[] args) {
        
        
         for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
