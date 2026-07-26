import java.util.*;

public class methodsum {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static void showSum(int result) {
        System.out.println("Sum = " + result);
    }

    static void showSub(int result) {
        System.out.println("Subtraction = " + result);
    }

    static void showMul(int result) {
        System.out.println("Multiplication = " + result);
    }

    static void showDiv(int result) {
        System.out.println("Division = " + result);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);
        int subtraction = sub(num1, num2);
        int multiplication = mul(num1, num2);
        int division = div(num1, num2);

        showSum(sum);
        showSub(subtraction);
        showMul(multiplication);
        showDiv(division);

        sc.close();
    }
}