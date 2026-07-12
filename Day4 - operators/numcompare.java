import java.util.*;

public class numcompare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
