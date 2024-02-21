import java.util.*;

public class Encapsulation{
   public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      String name = input.nextLine();
      
      System.out.print("What is your age? ");
      int age = input.nextInt();
      
      Encapsulation1 e = new Encapsulation1(name,age);
      
      System.out.print("So your name is " + e.getName() + " And your age is " + e.getAge() + " so your brother's age will be " + e.getAgeofBrother());
      
   
   
   }

}