import java.util.Scanner;

/**
 * October 13. 2023
 * Ajou university inTashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Implement Armstrong numbers
 */

public class ArmstrongNumbers {

    
    public static void main(String[] args) {
        System.out.print("\nWeek 05. Monday\n");
        Scanner reader = new Scanner(System.in);

        int result, temp, a;


//        print armstrong numbers between 1 and 1000
        for (int i = 1; i <= 1000; i++) {
            temp = i;
            result = 0;
            while (temp != 0) {
                a = temp % 10;
                result += a * a * a;
                temp /= 10;
            }
            if (result == i) {
                System.out.print(i + " ");
            }
        }


        System.out.println();
        reader.close();
    }
}
