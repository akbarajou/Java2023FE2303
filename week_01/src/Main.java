import java.util.Scanner;

/**
 * First week
 * Sep 15, 2023
 * @author Tangirov Akbar
 */
public class Main {

    public static void main(String[] args) {

        // Variables
        String state = "alifornia";
        char letter = 'C';
        int streetNumber = 12;
        double temperature = 19.5;

        System.out.printf("State: %c%s\n", letter,state);
        System.out.printf("Street Number: %d\n", streetNumber);
        System.out.printf("Temperature: %.2f\n", temperature);


        // Scanner
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, sum;
        System.out.print("Enter the first number: ");
        firstNumber = Integer.valueOf(input.nextLine());

        System.out.print("Enter the second number: ");
        secondNumber = Integer.valueOf(input.nextLine());

        sum = firstNumber + secondNumber;

        System.out.println("Sum: " + sum);

        
        input.close();
    }
}

// Path: weekOne/src/Main.java
