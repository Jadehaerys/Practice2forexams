import java.util.*;

public class Rectangle
{
public static void main (String [] args)
{

double height;
double width;


do {
Scanner w = new Scanner(System.in);
System.out.print("Enter the Height of the Rectangle: ");
height = w.nextDouble();
} while (height <= 0);
do {
Scanner w = new Scanner(System.in);
System.out.print("Enter the Width of the Rectangle: ");
width = w.nextDouble();
} while (width <= 0);


System.out.printf("The area of the rectangle is %.2f\n ", area (height, width));
System.out.printf("The Parameter of the rectangle is %.2f\n ", parameter (height, width));




}
public static double area (double num1, double num2)
{
double area = num1 * num2;

return area;

}

public static double parameter (double num1, double num2)
{
double parameter = 2 * (num1 + num2);
return parameter;
}
}