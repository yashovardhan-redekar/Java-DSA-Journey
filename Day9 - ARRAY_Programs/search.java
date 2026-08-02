import java.util.*;

public class search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int count = 0;
        int index = -1;

        System.out.println("Enter the array elements:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int key = sc.nextInt();

        for(int i = 0; i < arr.length; i++){

            if(arr[i] == key){

                count++;

                if(index == -1){
                    index = i;
                }

            }

        }

        if(index != -1){
            System.out.println("Number found at index: " + index);
            System.out.println("Occurrences: " + count);
        }
        else{
            System.out.println("Number not found.");
        }

        sc.close();
    }
}