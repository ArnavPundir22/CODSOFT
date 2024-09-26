import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful!");
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.println("Your balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scanner.close(); // close scanner
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // initial balance of $1000
            int Number=12386543;  // Initial ATM Number
            int Pin=2898; // Initial ATM Pin
            Scanner input = new Scanner(System.in);
            System.out.println("\n - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("             Welcome to ATM Machine !!!!");
            System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Enter Account No. : ");
            int AtmNumber = input.nextInt();
            System.out.print("Enter the Pin : ");
            int PIN = input.nextInt();
            if((AtmNumber==Number)&&(PIN==Pin)){
                ATM atm = new ATM(account);
                atm.run();
        
            }
            else {
                System.out.println("Invalid ATM Number or PIN...");
                System.exit(0);
            }
        }
}
