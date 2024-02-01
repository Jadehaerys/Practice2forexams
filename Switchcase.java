import java.util.*;

public class Switchcase
{
public static void main (String [] args)
{
int in;
int num;
do {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a positive number: ");
in = sc.nextInt();
}while (in <= 0);

do {
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter a number from the menu: \n 1: Print Even numbers\n 2: Print Odd Numbers\n 3. Print Prime numbers\n 4. Exit Program\n ");
num = sc.nextInt();


switch(num){
case 1:{ 
even(in);
break;
}
case 2:{
odd(in);
break;
}
}
}while (num != 4); 
}

static void even (int in)
{
System.out.print("The Even numbers are: ");
for (int i = 0; i < in; i+=2)
{
System.out.print(i + " ");
}
}
static void odd (int in)
{
System.out.print("The Even numbers are: ");
for (int i = 1; i < in; i++)
{
if (i % 2 == 1){
System.out.print(i + " ");
}
}
}

}
