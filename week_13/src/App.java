
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true) {

            mainMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(reader.nextLine());


            if (choice == 1) {
                System.out.print("Enter the student's name: ");
                String name = reader.nextLine();
                System.out.print("Enter the student's ID: ");
                int ID = Integer.parseInt(reader.nextLine());


                students.add(new Student(name, ID));
            } else if (choice == 2) {
                System.out.println("Name\tID");
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }



    public static void mainMenu() {
        System.out.println("\n=======================");
        System.out.println("1 - Add a student");
        System.out.println("2 - Print all students");
        System.out.println("3 - Exit");
        System.out.println("=======================");
    }


}
