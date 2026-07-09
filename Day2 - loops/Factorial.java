import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("enter the number to find the factorial : ");
        int n = var1.nextInt();
        int fact = 1;
        int i;
        for(i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " + n + " is : " + fact);
    }
}
