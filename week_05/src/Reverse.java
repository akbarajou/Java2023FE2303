
/**
 * October 13. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Implement reverse numbers
 */

public class Reverse {
    
    public static void main(String[] args) {
        System.out.print("\n\nWeek 05. Wednesday\n");

        int reverse = 0, temp2;

        for (int i = 15; i < 100; i++) {
            temp2 = i;

            while (temp2 != 0) {
                reverse = reverse * 10 + temp2 % 10;
                temp2 /= 10;
            }

            if (i == reverse) {
                System.out.print(i + " ");
            }
            reverse = 0;
        }

        System.out.println();
    }
}
