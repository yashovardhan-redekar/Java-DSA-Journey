import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum =0;
        int avg =0;
        int pass=0;
        int fail =0;
        System.out.println("Enter the array elements: ");
        for(int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
         int max = arr[0];
          int min = arr[0];
        for(int i =0; i<arr.length; i++){
            sum =sum+arr[i];
             if(arr[i]>max ){
                max = arr[i];
            }
            if(arr[i]< min ){
                min = arr[i];
            }
             if (arr[i] >= 35) {
        pass++;
    } else {
        fail++;
    }
        }
        avg = sum/arr.length;
         System.out.println("\n------ Result ------");
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Highest Marks = " + max);
        System.out.println("Lowest Marks = " + min);
        System.out.println("Pass Students = " + pass);
        System.out.println("Fail Students = " + fail);
    }
}
