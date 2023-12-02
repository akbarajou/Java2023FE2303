import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * November 13. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * This program prints current month calendar
 */


public class Calendar {

    public static void main(String[] args) {
        System.out.println("\n===========================");

        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // Set to start of month
        DayOfWeek weekdays = date.getDayOfWeek();
        int weekday = weekdays.getValue(); // 1-Monday ... 7-Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < weekday; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");

            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }

        if (date.getDayOfWeek().getValue() != 1) System.out.println();

        System.out.println("===========================\n");

    }

}


