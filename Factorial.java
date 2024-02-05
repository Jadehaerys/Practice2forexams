import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int num1;
        int factorial1 = 1;
        int factorial2 = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number Sir: ");
        num1 = sc.nextInt();

        for (int i = 1; i <= num1; i++) {
            factorial1 *= i;
            factorial2 = factorial1;
            sum += factorial2;
        }

        System.out.print("The factorial is " + factorial2);
    }
}