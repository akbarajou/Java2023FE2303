import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Student> students;
    private Student student;


    public UserInterface() {
        this.students = new ArrayList<Student>();
        this.student = new Student();

    }


    public void start() {
        System.out.println("Hello!");
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("Enter the student name ");
            String name = reader.nextLine();
            System.out.print("Enter the student ID ");
            int ID = Integer.parseInt(reader.nextLine());
            System.out.print("Enter the student major ");
            String major = reader.nextLine();

            students.add(student.setName(name), student.setID(ID), student.setMajor(major));
        }
    }
}
