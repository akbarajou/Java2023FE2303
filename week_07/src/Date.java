
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Date {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);        
        int year, month, day;

        System.out.print("Enter year: ");
        year = reader.nextInt();
        System.out.print("Enter month: ");
        month = reader.nextInt();
        System.out.print("Enter day: ");
        day = reader.nextInt();

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);

        System.out.println("Your age is " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays() + " days");


        reader.close();
    }
}
