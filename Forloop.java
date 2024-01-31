import java.util.*;

public class Forloop
{

public static void main (String [] args){

int n;

Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
n = sc.nextInt();

for (int i = 1; i <= n; i++)
{
for (int j = 0; j <= n - i -  1; j++)
{

System.out.print(" ");

}
for (int j = 0; j <= i; j++)
{
System.out.print("#");

}
System.out.print(" ");

for(int j = 0; j <= i; j++)
{
System.out.print("#");
}
System.out.print("\n");
}
}
}