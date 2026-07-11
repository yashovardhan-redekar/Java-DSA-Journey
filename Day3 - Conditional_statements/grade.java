import java.util.*;
public class grade {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks: ");
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("A grade");
        }
        else if(marks >= 75){
            System.out.println("B grade");
        }
        else if(marks >= 60){
            System.out.println("C grade");
        }
        else if(marks >= 50){
            System.out.println("D grade");
        }
        else {
            System.out.println("fail");
        }
    }
}
