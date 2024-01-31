import java.util.*;

public class Practice {

public static void main(String [] args)

{
Scanner sc = new Scanner(System.in);

System.out.print("Enter first number: ");
double a = sc.nextDouble();
System.out.print("Enter second number");
double b = sc.nextDouble();

double sum = a + b;
double average = sum / 2;

System.out.printf("The sum of the two numbers is: ", + sum);
System.out.printf("The average of the two numbers is: ", + average);


}




}