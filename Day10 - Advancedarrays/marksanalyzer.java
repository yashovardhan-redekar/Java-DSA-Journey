import java.util.*;

public class marksanalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter the marks of 5 students:");

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize after taking input
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int pass = 0;
        int fail = 0;

        // Process the array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];

            if (arr[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        double average = (double) sum / arr.length;

        // Output
        System.out.println("\n----- Student Marks Report -----");
        System.out.println("Highest Marks : " + max);
        System.out.println("Lowest Marks  : " + min);
        System.out.println("Total Marks   : " + sum);
        System.out.println("Average Marks : " + average);
        System.out.println("Passed Students : " + pass);
        System.out.println("Failed Students : " + fail);

        sc.close();
    }
}