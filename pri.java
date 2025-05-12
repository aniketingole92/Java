import java.util.ArrayList;

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", RollNo=" + rollNo + "]";
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        // Adding students
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 103));

        // Displaying students
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Removing a student
        students.remove(1);
        System.out.println("\nAfter removing Bob:");
        students.forEach(System.out::println);
    }
}
