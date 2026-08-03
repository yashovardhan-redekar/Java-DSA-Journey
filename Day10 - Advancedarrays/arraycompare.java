import java.util.*;

public class arraycompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[]= new int[5];
        int arr2[]= new int[5];
        boolean isEqual = true;
        System.out.println("Enter the elements of first array: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                isEqual = false;
                break;
            }
    }
     if(isEqual){
                System.out.println("Arrays are equal.");
            }
            else{
                System.out.println("Arrays are not equal.");
            }
        }
}
