import java.util.*;

public class digit_count {
    public static void main(String args[]) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter any number to count the digits : ");
        int count = 0;
        int n= var1.nextInt();

        while(n>0) {
            n = n/10;
            count++;
        }
        System.out.println("The number of digits in " + n + " is : " + count);
    }
}
