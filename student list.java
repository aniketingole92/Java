import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter roll no: ");
                int rollNo = scanner.nextInt();
                students.add(new Student(name, rollNo));
                System.out.println("Student added!");
            } else if (choice == 2) {
                System.out.println("\n--- Students List ---");
                students.forEach(System.out::println);
            } else if (choice == 3) {
                break;
            }
        }
    }
}
