import java.util.Scanner;

class ATMManagementSystem{

    // Private variables used inside class
    private String name;
    private int accNumber;
    private String type;
    private int amount = 0;
    private int tot = 0;

    // Public methods
    public void setValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        scanner.nextLine(); // To consume newline character

        name = scanner.nextLine();

        System.out.println("Enter Account number");
        accNumber = scanner.nextInt();
        System.out.println("Enter Account type");
        type = scanner.next();
        System.out.println("Enter Balance");
        tot = scanner.nextInt();
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNumber);
        System.out.println("Account type: " +type);
        System.out.println("Balance: " +tot);
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter amount to be Deposited");
        amount = scanner.nextInt();
    }

    public void showBalance() {
        tot += amount;
        System.out.println("\nTotal balance is: " +tot);
    }

    public void withdrawal() {
        Scanner scanner = new Scanner(System.in);
        int a, availableBalance;
        System.out.println("Enter amount to withdraw");
        a = scanner.nextInt();
        availableBalance = tot - a;
        System.out.println("Available Balance is: " +availableBalance);
    }
}

public class Bank{

    public static void main(String[] args) {
        // Object of class
        Bank b = new Bank();
         int choice;
     // Infinite while loop to choose options everytime
        while (true) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~WELCOME~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                    "~~~~~~~~~\n\n");
            System.out.println("Enter Your Choice");
            System.out.println("\t1. Enter name, Account number, Account type");
            System.out.println("\t2. Balance Enquiry");
            System.out.println("\t3. Deposit Money");
            System.out.println("\t4. Show Total balance");
            System.out.println("\t5. Withdraw Money");
            System.out.println("\t6. Cancel");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            // Choices to select from
            switch (choice) {
                case 1:
                    b.setValues();
                    break;
                case 2:
                    b.showData();
                    break;
                case 3:
                    b.deposit();
                    break;
                case 4:
                    b.showBalance();
                    break;
                case 5:
                    b.withdrawal();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice");
            }
            System.out.println("Thank you for choosing atm service");
        }
    }
}
