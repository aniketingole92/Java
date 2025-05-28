public class ControlFlowExample {
    public static void main(String[] args) {
        int num = 10;
        // If-else
        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non-positive");
        }
        // For loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
        // Switch
        switch (num) {
            case 10:
                System.out.println("Number is 10");
                break;
            default:
                System.out.println("Other number");
        }
    }
}
