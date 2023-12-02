import java.util.Scanner;

/**
 * Sep 29. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * This program prints the odd numbers from 50 to 25.
 */

public class OddNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        for (int l = 50; l >= 25; l--) {
            if (l % 2 == 1) {
                System.out.print(l + " ");
            }
        }
        System.out.println();


        reader.close();
    }
}
