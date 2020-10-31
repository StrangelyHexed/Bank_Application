import java.util.Scanner;

public class BankApplication {
    private int balance;
    private int previousTransaction;
    private String name;
    private String id;

    BankApplication(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void deposit(int amount) {
        if (amount > 0) {
            previousTransaction = amount;
            balance = +amount;
        }
    }


    void withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0)
            System.out.println("Deposited: " + previousTransaction);
        else if (previousTransaction < 0)
            System.out.println("Withdrawn: " + previousTransaction);
        else
            System.out.println("No transaction was taken.");

    }



    void showMenu() {
        char letter;

        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Welcome " + name);
        System.out.println("Your ID is " + id);
        System.out.println();
        System.out.println("What do you wish to do? (Input A-E)");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");


        do {
            System.out.println();
            System.out.print("Enter option: ");
            letter = input.next().toLowerCase().charAt(0);
            System.out.println();

            switch (letter) {
                case 'a':
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println("Balance: $" + balance);
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 'b':
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Enter deposit amount: ");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 'c':
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.print("Enter withdraw amount: ");
                    int amount2 = input.nextInt();
                    withdraw(amount2);
                    System.out.println("-------------------------------------------------------------------------------");
                    break;
                case 'd':
                    System.out.println("-------------------------------------------------------------------------------");
                     getPreviousTransaction();
                     System.out.println("-------------------------------------------------------------------------------");
                     break;
                case 'e':
                    System.out.println("-------------------------------------------------------------------------------");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid input. Please enter again from options A-E.");

            }
        } while (letter != 'e');

        System.out.println("Thank you for your services");

    }
}
