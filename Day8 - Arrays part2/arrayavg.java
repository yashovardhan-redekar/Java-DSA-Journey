import java.util.*;

public class arrayavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum =0;
        int avg =0;
    
        System.out.println("enter the elements in the array: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i< arr.length; i++){
            sum = sum+arr[i];
        }
        avg = sum/arr.length;
        System.out.println("Average is: "+avg);
    }
}
