import java.util.*;

public class ATM_menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 15000;
        System.out.println("---------- ATM MENU ----------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposite Money");
        System.out.println("3. Withdraw money");
        System.out.println("4.Exit");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1 : 
                System.out.println("Your balance is: "+ balance);
            break;
            case 2:
                System.out.print("Enter amount to Deposite: ");
                int deposite = sc.nextInt();
                balance = deposite + balance;
                System.out.println("Updated Balance: "+balance);
            break;

             case 3:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Updated balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance!");
                }
                break;
            case 4:
                System.out.println("Thank you for using the ATM!");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}

