
import java.util.Scanner;

/**
 * October 29. 2023
 * Ajou University in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * This program calculates the perimeter of a rectangle
 */
public class PerimeterOfRectangle {

    public static void main(String[] args) {
        System.out.println("Perimeter of rectangle");

        Scanner reader = new Scanner(System.in);

//        get length from user
        System.out.print("Enter length: ");
        double length = reader.nextDouble();

//        get width from user
        System.out.print("Enter width: ");
        double width = reader.nextDouble();

//        calculate perimeter
        double perimeter = 2 * (length + width);

//        display the perimeter
        System.out.println("Perimeter of rectangle: " + perimeter);


        reader.close();
    }
}
