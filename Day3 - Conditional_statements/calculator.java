import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result =0;
        System.out.println("----------operations-----------");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println("enter any choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1: 
            result = a + b;
            System.out.println("the addition is: "+result);
            break;
            case 2:
                result = a - b;
                System.out.println("The substraction is: "+result);
            break;
            case 3:
                result = a*b;
                System.out.println("The Multiplication is: "+result);
                break;
            case 4:
                result = a/b;
                System.out.println("The division is: "+result);
                break;
                default:
                    System.out.println("invalid choice");
        }
        
    }
}
