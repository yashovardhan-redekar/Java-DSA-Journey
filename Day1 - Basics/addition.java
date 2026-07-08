//public class addition {
    //public static void main(String args[])
    //{
       // int a = 10;
        //int b = 20;
        //int sum = a + b;
        //System.out.println("The sum of a and b is: " + sum);}
//}

import java.util.*;
public class addition {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: " + sum);
    }
}