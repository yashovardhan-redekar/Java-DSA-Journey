import java.util.*;

public class drive {
    public static void main(String srgs[]){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Do you have licence : ");
        boolean haslicence = sc.nextBoolean();

        if(age >= 18){
            if(haslicence == true){
                System.out.println("eligible to drive");
            }           
        }
        else{
                System.out.println("not eligible to drive");
            }
    }
}





/* Eligible to vote 
 year is leap or not 
 largest of three numbers 
 build a simple calculator using switch 
 check whether number is positive negative or zero */
