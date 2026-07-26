import java.util.*;

public class arrayinput {
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);

        int arr[] = new int[5];
        
        System.out.println("Enter ant 5 elements: ");
        for(int i = 0; i< arr.length; i++){
            arr[i] = x.nextInt();
        }
        System.out.println("Array elements: ");
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        x.close();
    }
}
