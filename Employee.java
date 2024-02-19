import java.util.*;
import javax.swing.*;

public class Employee{
   public static void main(String [] args){
      
      Scanner sc = new Scanner(System.in);
      
      System.out.print("What is your name?  ");
      String name = sc.nextLine();
      
      System.out.print("How old are you?  ");
      int age = sc.nextInt(); 
      
      
      Information i = new Information(name, age);
      
      System.out.print("So your name is " + i.getName() + " and your age is " + i.getAge() + " So your brother's age must be " + i.brothersAge());     
      
   
   }

}