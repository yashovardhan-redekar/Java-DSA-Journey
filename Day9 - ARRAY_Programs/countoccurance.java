import java.util.*;

public class countoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        int i;
        int arr[] = new int[5];
        System.out.println("enter the elements in the array: ");
        for(i =0; i<arr.length; i++){
        arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();
        for(i =0; i<arr.length; i++){
    if (arr[i] == key) {
    count++;
}
        }
if (count > 0) {
    System.out.println(key + " occurs " + count + " times.");
} else {
    System.out.println(key + " not found.");
}
}
}
