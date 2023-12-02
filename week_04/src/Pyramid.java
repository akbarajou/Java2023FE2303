import java.util.Scanner;

/**
 * Oct 05, 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * 
 * Implement pyramid
 */


public class Pyramid {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("Enter height: ");
        int height = Integer.valueOf(reader.nextLine());

        for (int i = 0; i < height; i++) {
            // white space
            for (int n = height; n >= i; n--) {
                System.out.print(" ");
            }

            // right angle
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            // left angle
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    
        reader.close();
    }
}
