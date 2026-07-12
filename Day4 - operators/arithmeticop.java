import java.util.*;

public class arithmeticop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;

        result = a+b;
        System.out.println("Addition is: "+result);

        result = a-b;
        System.out.println("substraction is: "+result);

        result = a*b;
        System.out.println("Multiplication is: "+result);

        result  = a/b;
        System.out.println("Division is: "+result);
    }
}
