import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.next();
        System.out.print("Enter ID: ");
        String id = input.next();

        BankApplication bA = new BankApplication(name,id);
        bA.showMenu();


    }
}
