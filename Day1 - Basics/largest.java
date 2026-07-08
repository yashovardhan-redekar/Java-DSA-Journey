/*public class largest {
    public static void main (String args[])
    {
        int a =10;
        int b = 20;
        int c = 30;
        if (a > b && a > c)
        {
            System.out.println("a is greater");
        }
        else if (b > a && b > c)
        {
            System.out.println("b is greater");
        }
        else if(c > a && c > b)
        {
            System.out.println("c is greater");
        }
        else{
            System.out.println("all are equal");
        }
    }
}
*/

import java.util.*;
public class largest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers to Compare : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c)
        {
            System.out.println(a+ " is greater");
        }
        else if (b > a && b > c)
        {
            System.out.println(b+ " is greater");
        }
        else if(c > a && c > b)
        {
            System.out.println(c+ " is greater");
        }
        else{
            System.out.println("all are equal");
        }
    }
}
