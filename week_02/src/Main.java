
import java.util.Scanner;

/**
 * Sep 22, 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * developed by Tangirov Akbar
 */

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = reader.nextLine();

        System.out.print("Enter first mark: ");
        int markOne = Integer.valueOf(reader.nextLine());

        System.out.print("Enter second mark: ");
        int markTwo = Integer.valueOf(reader.nextLine());

        System.out.print("Enter third mark: ");
        int markThree = Integer.valueOf(reader.nextLine());


//        Check studentOne = new Check(markOne, markTwo, markThree);
//
//        System.out.println();
//        System.out.println("Student name: " + name);
//        System.out.println("Result: " + studentOne.getResult());
//

//        if (studentOne.GetResult()) {
//            System.out.println("Result: PASSED!");
//        } else {
//            System.out.println("Result: FAILED!");
//        }

/**
 *  Sep 22, 2023 FRIDAY
 */

//        int max = markOne;
//        if (markTwo > max) {
//            max = markTwo;
//        } else if (markThree > max) {
//            max = markThree;
//        }
//        System.out.println(max);


        Check studentOne = new Check(markOne, markTwo, markThree);

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println(studentOne.getGrade());
        System.out.println("Average Points: " + studentOne.getAverage());
        System.out.println("Total Points: " + studentOne.getTotal());


        reader.close();

    }
}

