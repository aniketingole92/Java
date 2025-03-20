// EBookWebsite.java
public class EBookWebsite {
    public static void main(String[] args) {
        System.out.println("Welcome to the E-Book Website!");
        System.out.println("--------------------------------");
        System.out.println("1. Login");
        System.out.println("2. View Books");
        System.out.println("3. Exit");
        System.out.println("--------------------------------");

        // Simulating user input (for demonstration)
        int choice = 2; // Assume user selects option 2

        switch (choice) {
            case 1:
                System.out.println("You selected: Login");
                System.out.println("Redirecting to login page...");
                break;
            case 2:
                System.out.println("You selected: View Books");
                System.out.println("Available Books:");
                System.out.println("1. Java Programming by John Doe");
                System.out.println("2. Python for Beginners by Jane Smith");
                System.out.println("3. Web Development by Alice Johnson");
                break;
            case 3:
                System.out.println("You selected: Exit");
                System.out.println("Thank you for visiting!");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    }
}