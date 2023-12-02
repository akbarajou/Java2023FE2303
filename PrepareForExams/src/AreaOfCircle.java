import java.util.Scanner;

/**
 * October 29. 2023
 * Ajou University in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * This program calculates the area of a circle
 */

public class AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("Finding area of circle");

        Scanner reader = new Scanner(System.in);

//        get radius from user
        System.out.print("Enter radius: ");
        double radius = reader.nextDouble();

//        calculate area
        double area = Math.PI * Math.pow(radius, 2);

//        display the area
        System.out.println("Area of circle: " + area);




        reader.close();
    }
}


