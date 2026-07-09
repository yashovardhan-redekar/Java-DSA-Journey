import java.util.*;
public class sidepattern {
    public static void main(String args[]) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("enter the rows of the triagle : ");
        int n = var1.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
