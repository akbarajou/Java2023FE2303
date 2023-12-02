import java.util.Scanner;

/**
 * October 30. 2023
 * Ajou university in Tashkent
 * Department of Electrical and Computer Engineering
 * Developed by Tangirov Akbar
 * 
 * Midterm Exam problem
 * Write a program that checks if the letter is a vowel or not.
 */

public class VowelLetters {
    
    public static void main(String[] args) {
        System.out.println("Vowel or Not");

        Scanner input = new Scanner(System.in);

        // get the letter from the user
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        // check if the letter is a vowel
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") ||
            letter.equals("o") || letter.equals("u")) {
            System.out.println(letter + " is a vowel");
        } else {
            System.out.println(letter + " is not a vowel");
        }



        input.close();
    }
}
