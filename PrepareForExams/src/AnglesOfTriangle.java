import java.util.Scanner;

/**
 * November 13. 2023
 * Ajou university inTashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 * 
 * This program computes angles of triangle
 */

public class AnglesOfTriangle {

    public static void main(String[] args) {
        System.out.println("Angles of triangle!");

        Scanner reader = new Scanner(System.in);
        double sideA, sideB, sideC, angleA, angleB, angleC;

        System.out.print("Enter side A: ");
        sideA = reader.nextDouble();
        System.out.print("Enter side B: ");
        sideB = reader.nextDouble();
        System.out.print("Enter side C: ");
        sideC = reader.nextDouble();

//        compute angles
//        angleA = Math.asin(sideA / sideC) * 180 / Math.PI;
//        angleB = Math.acos(sideA / sideC) * 180 / Math.PI;
//        angleC = 180 - angleA - angleB;
//       (other way)
        angleA = Math.asin(sideA / sideC) / Math.PI * 180;
        angleB = Math.asin(sideB / sideC) / Math.PI * 180;
        angleC = 180 - angleA - angleB;

//        display results
        System.out.println("Angle A: " + angleA);
        System.out.println("Angle B: " + angleB);
        System.out.println("Angle C: " + angleC);


        reader.close();
    }
}
