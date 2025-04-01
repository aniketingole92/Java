import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    private String accountNumber;
    private String name;
    private double balance;
    private List<String> transactions;

    public Customer(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
        addTransaction("Account Created | Balance: ₹0.00");
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            addTransaction("Deposit: ₹" + String.format("%.2f", amount));
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance -= amount;
            addTransaction("Withdrawal: ₹" + String.format("%.2f", amount));
        } else {
            addTransaction("Failed Withdrawal: ₹" + String.format("%.2f", amount));
        }
    }

    public void printTransactions() {
        System.out.println("\n--- Transaction History ---");
        for(String t : transactions) {
            System.out.println(t);
        }
    }

    private void addTransaction(String message) {
        transactions.add(message + " | Balance: ₹" + String.format("%.2f", balance));
    }

    public String getAccountInfo() {
        return "Account: " + accountNumber + " | Name: " + name;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankingApp {
    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n Aniket Ingole Bank ");
            System.out.println("1. New Acount");
            System.out.println("2. Saving Acount");
            System.out.println("3. Exit");
            System.out.print("choose num: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    selectAccount();
                    break;
                case 3:
                    System.out.println("धन्यवाद!");
                    System.exit(0);
                default:
                    System.out.println("गलत चुनाव!");
            }
        }
    }

    static void createAccount() {
        System.out.print("\nअकाउंट नंबर डालें: ");
        String accNo = sc.next();
        System.out.print("ग्राहक का नाम डालें: ");
        String name = sc.next();
        
        customers.add(new Customer(accNo, name));
        System.out.println("अकाउंट सफलता से बना!");
    }

    static void selectAccount() {
        if(customers.isEmpty()) {
            System.out.println("\nकोई अकाउंट नहीं मिला!");
            return;
        }
        
        System.out.println("\nअपना अकाउंट चुनें:");
        for(int i=0; i<customers.size(); i++) {
            System.out.println((i+1) + ". " + customers.get(i).getAccountInfo());
        }
        
        System.out.print("नंबर डालें: ");
        int accIndex = sc.nextInt()-1;
        
        if(accIndex < 0 || accIndex >= customers.size()) {
            System.out.println("गलत नंबर!");
            return;
        }
        
        accountMenu(customers.get(accIndex));
    }

    static void accountMenu(Customer customer) {
        while(true) {
            System.out.println("\n===== अकाउंट मेनू =====");
            System.out.println("1. बैलेंस चेक करें");
            System.out.println("2. पैसा जमा करें");
            System.out.println("3. पैसा निकालें");
            System.out.println("4. ट्रांज़ैक्शन हिस्ट्री");
            System.out.println("5. बैक");
            System.out.print("चुनाव करें: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("\nबैलेंस: ₹" + 
                        String.format("%.2f", customer.getBalance()));
                    break;
                case 2:
                    System.out.print("जमा राशि डालें: ₹");
                    customer.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("निकासी राशि डालें: ₹");
                    customer.withdraw(sc.nextDouble());
                    break;
                case 4:
                    customer.printTransactions();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("गलत चुनाव!");
            }
        }
    }
}
