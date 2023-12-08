import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private ArrayList<Student> students;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.students = new ArrayList<>();
    }

    public void start() {
        while (true) {

            mainMenu();
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(this.reader.nextLine());


            if (choice == 1) {
                System.out.print("Enter the student's name: ");
                String name = this.reader.nextLine();
                System.out.print("Enter the student's ID: ");
                int ID = Integer.parseInt(this.reader.nextLine());
                System.out.print("Enter the student's group ID: ");
                String groupID = this.reader.nextLine();

                this.students.add(new Student(name, ID, groupID));
            } else if (choice == 2) {
                for (Student student : this.students) {
                    System.out.println(student);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    
//    display main menu
    public static void mainMenu() {
        System.out.println("\n=======================");
        System.out.println("1 - Add a student");
        System.out.println("2 - Print all students");
        System.out.println("3 - Exit");
        System.out.println("=======================");
    }
}
