import java.util.*;
import javax.swing.*;

public class Gui
{
public static void main (String [] args)

{
int num1, num2;

Scanner input = new Scanner(System.in);



String first = JOptionPane.showInputDialog( "Enter a number: ");
num1 = Integer.parseInt(first);

String second = JOptionPane.showInputDialog( "Enter a number: ");
num2 = Integer.parseInt(second);

JOptionPane.showMessageDialog(null, "The Sum is: " + (num1 + num2));




}
}