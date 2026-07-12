import java.util.*;

public class terneryeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number: ");
        int a = sc.nextInt();

        String ans=(a%2 == 0) ? "even" : "odd";
        System.out.println("the number is: "+ans);
    }
}
