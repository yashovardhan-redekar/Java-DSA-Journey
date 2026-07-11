import java.util.*;

public class leap_year{
    public static void main(String args[])
    {
        System.out.print("enter any year: ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y % 400 == 0){
            System.out.println("the year is leap year ");
        }
        else if(y % 4 ==0 && y % 100 !=0){
            System.out.println("the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
    }
}
