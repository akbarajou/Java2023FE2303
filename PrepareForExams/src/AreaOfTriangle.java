
import java.util.Scanner;

/**
 * October 29. 2023
 * Ajou University in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * This program calculates the area of a triangle
 */

public class AreaOfTriangle {

    public static void main(String[] args) {
        System.out.println("Finding area of triangle");

        Scanner reader = new Scanner(System.in);

//        get base from user
        System.out.print("Enter base: ");
        double base = reader.nextDouble();

//        get height from user
        System.out.print("Enter height: ");
        double height = reader.nextDouble();

//        calculate area
        double area = (height * base) / 2;

//        display the area
        System.out.println("Area of triangle: " + area);


        reader.close();
    }
}

