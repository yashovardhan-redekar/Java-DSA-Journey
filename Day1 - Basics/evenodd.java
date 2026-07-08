//public class evenodd {
   // public static void main(String args[])
    //{
        //int num = 10;
        //if (num % 2 == 0)
      //  {
        //    System.out.println("the number is even");//
        //}
       // else{
        //    System.out.println("the number is odd");
       // }
   // }
//}

import java.util.*;
public class evenodd{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter any number: ");
    int num =sc.nextInt();
    if (num % 2 == 0)
    {
      System.out.println("the number is even");
    }
    else{
      System.out.println("the number is odd");
    }
  }
}
