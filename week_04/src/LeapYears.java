
/**
 * Oct 05, 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * Implement leap years
 */

public class LeapYears {
    
    public static void main(String[] args) {
        
         // Leap years
        for (int leap = 1999; leap <= 2050; leap++) {
            if (leap % 4 == 0) {
                System.out.println(leap);
            }
        }
    }
}
