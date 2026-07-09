import java.util.*;

public class multiplication_table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the nuber of table : ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
