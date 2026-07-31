import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        boolean found = false;
        int i;
        System.out.println("Enter the elements in the array: ");
        for(i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        for(i =0; i<arr.length; i++){
            if(arr[i] == key){
                found = true;
                break;
            }
            }
            if(found == true){
                System.out.println("number found at index: "+i);
            }
            else{
                System.out.println("number not found");
        }
    }
}
